import java.util.Scanner;
import java.util.ArrayList;

public class Jogo {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("\n==============================");
            System.out.println("SUPER TRUNFO");
            System.out.println("==============================");
            System.out.println("\nOPÇOES:");
            System.out.println("1 - Jogar");
            System.out.println("2 - Ranking");
            System.out.println("3 - Sair");
            
            System.out.print("\nDigite uma opção:");
            opcao = in.nextInt();
            switch (opcao) {
                case 1: Jogar(); break;
                case 2: Ranking(); break;
                } 
        } while (opcao != 3);
        
        System.out.println("\n[ PROGRAMA ENCERRADO ]");
        System.exit(0);
    }
    
    public static void Jogar () {
        // Cria o Baralho
        Baralho mesa = new Baralho();
        mesa.GeraBaralho();
        mesa.Embaralhar();
        
        // Cria os Jogadores
        ArrayList<Jogador> jogadores;
        jogadores = CriaJogadores();
        
        // Da as Cartas();
        darCartas(mesa, jogadores);
        
        exibeJogadores(jogadores);
        
    }
    
    public static ArrayList<Jogador> CriaJogadores () {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Jogador> jogadores;
        jogadores = new ArrayList<Jogador>();
        
        int num;
        String nome;
        
        System.out.println("------------------------------");
        System.out.printf("Digite o número de jogadores: ");
        
        num = in.nextInt();
        
        System.out.println("Digite os nomes:");
        for (int i = 0; i < num; i++) {
            System.out.printf("JOGADOR [%d] -> ", (i + 1));
            nome = in.next();
            jogadores.add(new Jogador(nome));
        }
        
        return jogadores;
    }
    
    public static void exibeJogadores (ArrayList<Jogador> jogadores) { // Só pra DEBUG
        Jogador jogador;
        Baralho cartas;
        
        System.out.println("\n------------------------------");
        System.out.println("LISTA JOGADORES:");
        
        for (int i = 0; i < jogadores.size(); i++) {
            jogador = jogadores.get(i);
            cartas = jogador.getCartas();
            System.out.println("------------------------------");
            System.out.println(jogador.toString(i+1));
            if (cartas.getSize() > 0) {
                System.out.println("Cartas:");
                jogadores.get(i).getCartas().listarCompacto();
            }
            
        }
    }
    
    public static void darCartas(Baralho mesa, ArrayList<Jogador> jogadores) {
        int aux = 0;
        int num = mesa.getSize();
        Carta carta;
        Jogador jogador;
        
        for (int i = 0; i < num; i++) {
            carta = mesa.getCartaByIndex(0);
            mesa.Excluir(carta);
            jogadores.get(aux).adicionaCarta(carta);
            
            aux++;
            if (aux >= jogadores.size()) aux = 0;
        }
    }
    
    public static void Ranking () {
        
    }
}
