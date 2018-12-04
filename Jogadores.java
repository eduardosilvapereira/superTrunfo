import java.util.Scanner;
import java.util.ArrayList;

public class Jogadores {

    private ArrayList<Jogador> jogadores;

    public Jogadores() {
        Scanner in = new Scanner(System.in);
        int num;
        String nome;

        jogadores = new ArrayList<>();

        do {
            System.out.println("------------------------------");
            System.out.print("Digite o número de jogadores (2 à 8): ");

            num = in.nextInt();

            if (num < 2 || num > 8) {
                System.out.println("Número de jogadores inválido!");
            } else {
                System.out.println("Digite os nomes:");
                for (int i = 0; i < num; i++) {
                    System.out.printf("JOGADOR [%d] -> ", (i + 1));
                    nome = in.next();
                    jogadores.add(new Jogador(nome, i + 1));
                }
            }
        } while (num < 2 || num > 8);
    }

    public Jogador getJogadorByIndex(int index) {
        return jogadores.get(index);
    }

    public int getSize() {
        return this.jogadores.size();
    }

    public void exibeJogadores() { // Só pra DEBUG
        Jogador jogador;
        Baralho cartas;

        System.out.println("\n------------------------------");
        System.out.println("LISTA JOGADORES:");

        for (int i = 0; i < jogadores.size(); i++) {
            jogador = jogadores.get(i);
            cartas = jogador.getCartas();
            System.out.println("------------------------------");
            System.out.println(jogador.toString());
            if (cartas.getSize() > 0) {
                System.out.println("Cartas:");
                jogadores.get(i).getCartas().listarCompacto();
            }

        }
    }

    public void darCartas(Baralho mesa) {
        int aux = 0;
        int num = mesa.getSize();
        Carta carta;

        for (int i = 0; i < num; i++) {
            carta = mesa.getCartaByIndex(0);
            mesa.Excluir(carta);
            jogadores.get(aux).adicionaCarta(carta);

            aux++;
            if (aux >= jogadores.size()) aux = 0;
        }
    }

    public void recolheCartas(Jogador jogador) {
        Jogador aux;
        Carta carta;

        for (int i = 0; i < jogadores.size(); i++) {
            aux = jogadores.get(i);

            if (aux != jogador) {
                carta = aux.getCartaByIndex(0);
                aux.excluiCarta(carta);
                jogador.adicionaCarta(carta);
            }
        }
    }

    public Jogador jogadorVencedor() {
        Jogador vencedor = null;

        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getCartas().getSize() == 32) vencedor = jogadores.get(i);
        }
        
        return vencedor;
    }

    public Jogador vencedorRodada(Jogador jogador, int opcao) {
        Jogador aux, vencedor;
        Carta carta;

        vencedor = jogador;

        System.out.println("\nCartas dos outros jogadores:");

        // Verifica se algum jogador tem a carta SUPER TRUNFO
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getCartaByIndex(0).getSuperTrunfo()) vencedor = jogadores.get(i);
        }

        if (vencedor.getCartaByIndex(0).getSuperTrunfo()) {
            for (int i = 0; i < jogadores.size(); i++) {
                aux = jogadores.get(i);
                if (aux != jogador) {
                    carta = aux.getCartaByIndex(0);
                    System.out.println("------------------------------");
                    System.out.println(aux.toString());
                    System.out.println(carta.toString());
                }
                if (jogadores.get(i).getCartaByIndex(0).getLetra().equals("A")) vencedor = jogadores.get(i);
            }
        } else {
            for (int i = 0; i < jogadores.size(); i++) {
                aux = jogadores.get(i);
                if (aux != jogador) {
                    carta = aux.getCartaByIndex(0);
                    System.out.println("------------------------------");
                    System.out.println(aux.toString());
                    System.out.println(carta.toString());
                    if (opcao == 1) {
                        if (carta.getPeso() > vencedor.getCartaByIndex(0).getPeso()) vencedor = aux;
                    } else if (opcao == 2) {
                        if (carta.getCilindrada() > vencedor.getCartaByIndex(0).getCilindrada()) vencedor = aux;
                    } else if (opcao == 3) {
                        if (carta.getVelocidade() > vencedor.getCartaByIndex(0).getVelocidade()) vencedor = aux;
                    } else if (opcao == 4) {
                        if (carta.getAceleracao() > vencedor.getCartaByIndex(0).getAceleracao()) vencedor = aux;
                    } else {
                        if (carta.getPotencia() > vencedor.getCartaByIndex(0).getPotencia()) vencedor = aux;
                    }
                }
            }
        }

        return vencedor;
    }

    public boolean vencedorPartida() {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getCartas().getSize() == 32) return true;
        }

        return false;
    }
}