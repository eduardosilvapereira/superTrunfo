import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ranking {
    private ArrayList<Vencedor> vencedores;
    private File arquivo;

    public Ranking() {
        try {
            this.arquivo = new File("./ranking.txt");

            if (!this.arquivo.exists()) {
                this.arquivo.createNewFile();
            }

            this.vencedores = this.getVencedoresArquivo();
        } catch (IOException err) {
            System.out.println (err.toString());
        }
    }

    private ArrayList<Vencedor> getVencedoresArquivo() {
        ArrayList<Vencedor> vencedoresSalvos = new ArrayList<>();
        
        try {
            FileReader fr = new FileReader(this.arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                String linha = br.readLine();
                String[] partes = linha.split(";");
                String nome = partes[0];
                int rodadas = Integer.parseInt(partes[1]);

                Vencedor vencedor = new Vencedor(nome, rodadas);
                vencedoresSalvos.add(vencedor);
            }

            br.close();
            fr.close();
        } catch (IOException err) {
            System.out.println (err.toString());
        }
        
        return vencedoresSalvos;
    }

    private boolean setVencedoresArquivo() {
        try {
            FileWriter fw = new FileWriter(this.arquivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < this.vencedores.size(); i++) {
                bw.write(this.vencedores.get(i).getNome() + ";" + this.vencedores.get(i).getRodadas());
                bw.newLine();
            }

            bw.close();
            fw.close();

            return true;
        } catch (IOException err) {
            System.out.println (err.toString());
            return false;
        }
    }
        
    private void ordenarVencedores() {
        Collections.sort(this.vencedores, new Comparator() {
            public int compare(Object vencedor1, Object vencedor2) {
                Vencedor v1 = (Vencedor) vencedor1;
                Vencedor v2 = (Vencedor) vencedor2;
                return v1.getRodadas() < v2.getRodadas() ? -1 : (v1.getRodadas() > v2.getRodadas() ? +1 : 0);
            }
        });
    }

    public void exibir() {
        System.out.println("\n##############################");
        System.out.println(" RANKING");
        
        for (int i = 0; i < this.vencedores.size(); i++) {
            System.out.println("------------------------------");
            System.out.println((i + 1) + ": " + this.vencedores.get(i).getNome() + " | " + this.vencedores.get(i).getRodadas() + " Rodadas");
        }
        
        System.out.println("##############################");
    }

    public boolean salvarVencedor(String nome, int rodadas) {
        Vencedor vencedor = new Vencedor(nome, rodadas);
        this.vencedores.add(vencedor);
        this.ordenarVencedores();
        return this.setVencedoresArquivo();
    }
}
