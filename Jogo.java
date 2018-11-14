import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Jogo {
    public static void main (String [] args) {
    	//Variáveis
    	int opcao = 0;
    	int qtd_jogadores = 0, aletInt = 0;
    	String aletChar = null;
    	
    	//Variáveis para gerar chars e números aleatórios, para realização da chamada do método geraBaralho
    	aletChar = "abcd";
    	aletInt = ThreadLocalRandom.current().nextInt(0,5);
    	
    	//Objeto Scanner
    	Scanner in = new Scanner(System.in);
        
    	//ArrayLists
        ArrayList<Jogador> jogadores;
        ArrayList<Carta> mesa;
        jogadores = new ArrayList<Jogador>();
        
        //Inicio do game  
        do {
        	//Só deve entrar neste laço quando for inicio do jogo 
        	if(opcao == 0) {	
        		System.out.println("Bem vindo ao SuperTrunfo Motos");
        	}
        	System.out.println("Por favor, digite a quantidade de jogadores:");
        	qtd_jogadores = in.nextInt();
        	
        	//Laço de repetição para criação de novos jogadores
        	for (int i = 0; i<qtd_jogadores; i++) {
        		System.out.println("Digite o nome do jogador "+ (i+1));
        		Jogador jog = new Jogador(in.next());
        		jogadores.add(jog);
        	}
        	
        	
        	//Menu do final do jogo
        	System.out.println("Você deseja continuar jogando (1) ou sair do jogo? ");
        	opcao = in.nextInt();
        }while(opcao != 2);
        public void geraBaralho(){
        	Carta ca = new Carta(aletChar.charAt(aletInt),aletInt);
        }
        
        /*
        //Métodos do jogo a serem desenvolvidos
        public void distribuiCartas() {}
        public void comparaCartas() {}
        //Método abaixo deve consultar e atualizar/criar dados em um arquivo externo
        public void salvaRank() {}
      */
      }
}
