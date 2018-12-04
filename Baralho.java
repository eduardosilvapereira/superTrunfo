import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Baralho {

    private ArrayList<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
    }

    public void Adicionar(Carta carta) {
        cartas.add(carta);
    }

    public void Excluir(Carta carta) {
        cartas.remove(carta);
    }

    public Carta getCartaByIndex(int index) {
        return cartas.get(index);
    }

    public int getSize() {
        return cartas.size();
    }

    public void GeraBaralho() {
        Carta carta;
        String letra = "";
        boolean superTrunfo;
        int cont = 0;

        String[] nomeMoto = new String[32];

        nomeMoto[0] = "Honda CB1000R";
        nomeMoto[1] = "Yamaha XR650";
        nomeMoto[2] = "Honda CB650R";
        nomeMoto[3] = "Honda CB650RR";
        nomeMoto[4] = "Suzuki Hayabusa 1300R";
        nomeMoto[5] = "Suzuki Boulevard 1500";
        nomeMoto[6] = "Honda Goldwing 1800";
        nomeMoto[7] = "Harley Davidson Iron 883";
        nomeMoto[8] = "Harley Davidson Fatboy";
        nomeMoto[9] = "Suzuki Gladius";
        nomeMoto[10] = "Suzuki VStorm";
        nomeMoto[11] = "Yamaha VMAX";
        nomeMoto[12] = "Yamaha MT-03";
        nomeMoto[13] = "Buell vx1000";
        nomeMoto[14] = "Yamaha Tenere 650";
        nomeMoto[15] = "Suzuki Bandit 650";
        nomeMoto[16] = "Suzuki Bandit 1000";
        nomeMoto[17] = "Yamaha MT-07";
        nomeMoto[18] = "Ducati StreetFighter 1100";
        nomeMoto[19] = "Ducati Multistrada 1200";
        nomeMoto[20] = "Yamaha R1";
        nomeMoto[21] = "Yamaha RD 150";
        nomeMoto[22] = "Honda CB 300";
        nomeMoto[23] = "Honda CB1000RR";
        nomeMoto[24] = "Triumph SpeedTriple 675";
        nomeMoto[25] = "Triumph SpeedTriple 1200R";
        nomeMoto[26] = "BMW GS310";
        nomeMoto[27] = "BMW S1000RR";
        nomeMoto[28] = "MV Agustta Street 1000";
        nomeMoto[29] = "Triumph Boneville 1200";
        nomeMoto[30] = "Honda CB750";
        nomeMoto[31] = "Triumph Tiger 1200";
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
                superTrunfo = (letra.equals("E") && numero == 4); // Carta E4 será o Super Trunfo
                carta = new Carta(letra, numero, nomeMoto[cont], superTrunfo);
                cartas.add(carta);
                cont++;
            }
        }
    }

    public void Embaralhar() {
        Carta carta1;
        Carta carta2;
        int rand;

        for (int i = 0; i < cartas.size(); i++) {
            rand = ThreadLocalRandom.current().nextInt(0, 32);
            carta1 = cartas.get(i);
            carta2 = cartas.get(rand);
            cartas.set(i, carta2);
            cartas.set(rand, carta1);
        }
    }

    public void Listar() {
        Carta carta;
        for (int i = 0; i < cartas.size(); i++) {
            carta = cartas.get(i);
            System.out.println(carta.toString());
        }
    }

    public void listarCompacto() { // Só pra debug
        Carta carta;
        for (int i = 0; i < cartas.size(); i++) {
            carta = cartas.get(i);
            System.out.printf("[%d] %s%d -> %s%n", (i + 1), carta.getLetra(), carta.getNumero(), carta.getNome());
        }
    }
}
