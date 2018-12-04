import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ranking {
    private ArrayList<Vencedor> vencedores;
    private File arquivo;
    
    public Ranking() {
        this.arquivo = new File("./ranking.txt");
        
        if (!this.arquivo.exists()) {
            this.arquivo.createNewFile();
        }
        
        this.vencedores = this.getVencedoresArquivo();
    }
    
    private ArrayList<Vencedor> getVencedoresArquivo() {
        ArrayList<Vencedor> vencedoresSalvos = new ArrayList<Vencedor>();
        
        FileReader fr = new FileReader(this.arquivo);
        BufferedReader br = new BufferedReader(fr);
        
        while (br.ready()) {
            String linha = br.readLine();
            String [] partes = linha.split(";");
            String nome = partes[0];
            int pontuacao = Integer.parseInt(partes[1]);
            
            Vencedor vencedor = new Vencedor(nome, pontuacao);
            vencedoresSalvos.add(vencedor);
        }
        
        br.close();
        fr.close();
        
        return vencedoresSalvos;
    }
    
    private boolean setVencedoresArquivo() {
        FileWriter fw = new FileWriter(this.arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (int i = 0; i < this.vencedores.size(); i++) {
            bw.write(this.vencedores.get(i).getNome() + ";" + this.vencedores.get(i).getPontuacao());
            bw.newLine();
        }
        
        bw.close();
        fw.close();
        
        return true;
    }
    
    public void exibir() {
        for (int i = 0; i < this.vencedores.size(); i++) {
            System.out.println((i + 1) + ": " + this.vencedores.get(i).getNome() + " | " + this.vencedores.get(i).getPontuacao() + "pontos");
        }
    }
    
    public boolean salvarVencedor(String nome, int pontuacao) {
        Vencedor vencedor = new Vencedor(nome, pontuacao);
        this.vencedores.add(vencedor);
        return this.setVencedoresArquivo();
    }
}
