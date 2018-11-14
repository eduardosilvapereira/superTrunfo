import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Jogo {
    public static void main (String [] args) {
    	Scanner in = new Scanner(System.in);
        
        int opcao;
    	
    	ArrayList<Jogador> jogadores;
        ArrayList<Carta> mesa;
        jogadores = new ArrayList<Jogador>();
    	
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
        
    }
    
    public static void Ranking () {
        
    }
}
