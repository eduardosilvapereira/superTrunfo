import java.util.ArrayList;

public class Baralho {
    private ArrayList<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<Carta>();
        GeraBaralho();
    }
    
    public boolean Adicionar (char letra, int numero, String nome) {
        return this.cartas.add(new Carta(letra, numero, nome));
    }
    
    public void GeraBaralho () {
        char letra;
        int cont = 0;
        
        int [] nomeMoto = new String [32];
        nomeMoto[0] = "Harley Davidson";
        // Continuar os nomes das motos até 32
        
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0: letra = 'A'; break;
                case 1: letra = 'B'; break;
                case 2: letra = 'C'; break;
                case 3: letra = 'D'; break;
                case 4: letra = 'E'; break;
                case 5: letra = 'F'; break;
                }
            for (int numero = 1; numero <= 4; numero++) {
                Adicionar(letra, numero, nomeMoto[cont]);
                cont++;
            }
        }
    }
    
    public boolean Excluir (Carta carta) {
        return this.cartas.remove(carta);
    }
    
    public void Listar () {
        Carta c;
        for (int i = 0; i < this.cartas.size(); i++) {
            c = cartas.get(i);
            c.toString();
        }
    }
    
    public int getIndex (Carta carta) {
        return this.cartas.indexOf(carta);
    }
}