import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Baralho {
    private ArrayList<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<Carta>();
    }
    
    public boolean Adicionar (Carta carta) {
        return this.cartas.add(carta);
    }
    
    public boolean Excluir (Carta carta) {
        return this.cartas.remove(carta);
    }
    
    public Carta getCartaByIndex (int index) {
        return this.cartas.get(index);
    }
    
    public int getSize () {
        return this.cartas.size();
    }
    
    public void GeraBaralho () {
        Carta carta;
        String letra = "";
        int cont = 0;

        String [] nomeMoto = new String [32];
        nomeMoto[0] = "Harley Davidson";
        // Continuar os nomes das motos até 32
        
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0: letra = "A"; break;
                case 1: letra = "B"; break;
                case 2: letra = "C"; break;
                case 3: letra = "D"; break;
                case 4: letra = "E"; break;
                case 5: letra = "F"; break;
                case 6: letra = "G"; break;
                case 7: letra = "H"; break;
                }
            for (int numero = 1; numero <= 4; numero++) {
                carta = new Carta(letra, numero, nomeMoto[cont]);
                this.cartas.add(carta);
                cont++;
            }
        }
    }
    
    public void Embaralhar () {
        Carta carta1;
        Carta carta2;
        int rand;
        
        for (int i = 0; i < cartas.size(); i++) {
            rand = ThreadLocalRandom.current().nextInt(0,32);
            carta1 = cartas.get(i);
            carta2 = cartas.get(rand);
            cartas.set(i, carta2);
            cartas.set(rand, carta1);
        }
    }
    
    public void Listar () {
        Carta carta;
        for (int i = 0; i < cartas.size(); i++) {
            carta = cartas.get(i);
            System.out.println(carta.toString());
        }
    }
    
    public void listarCompacto () { // Só pra debug
        Carta carta;
        for (int i = 0; i < cartas.size(); i++) {
            carta = cartas.get(i);
            System.out.printf("[%d] %s%d -> %s%n", (i+1), carta.getLetra(), carta.getNumero(), carta.getNome());
        }
    }
}