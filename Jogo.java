import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Jogo {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("SUPER TRUNFO");
            System.out.println("==============================");
            System.out.println("OPÇOES:");
            System.out.println("1 - Jogar");
            System.out.println("2 - Ranking");
            System.out.println("3 - Sair:");
            
            opcao = in.nextInt();
            switch (opcao) {
                case 1: Jogar(); break;
                case 2: Ranking(); break;
                } 
        } while (opcao != 3);
        
        System.out.println("PROGRAMA ENCERRADO");
    }
    
    public static void Jogar () {
        // Cria o Baralho
        Baralho mesa = new Baralho();
        
        // Cria os Jogadores
        ArrayList<Jogador> jogadores;
        jogadores = CriaJogadores();
        
        // Embaralhar();
        
        // DarCartas();
        
        
        
    }
    
    public static ArrayList<Jogador> CriaJogadores () {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Jogador> jogadores;
        jogadores = new ArrayList<Jogador>();
        
        int num;
        String nome;
        
        System.out.println("------------------------------");
        System.out.println("Digite o número de jogadores:");
        
        num = in.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.printf("\nJOGADOR [%i]", i+1);
            System.out.print("Nome: ");
            nome = in.next();
            jogadores.add(new Jogador(nome));
        }
        
        return jogadores;
    }
    
    public static void Ranking () {
        
    }
}
