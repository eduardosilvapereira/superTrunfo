import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Jogo {
    public static void main (String [] args) {
    	//Vari�veis
    	int opcao = 0;
    	int qtd_jogadores = 0, aletInt = 0;
    	String aletChar = null;
    	
    	//Vari�veis para gerar chars e n�meros aleat�rios, para realiza��o da chamada do m�todo geraBaralho
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
        	//S� deve entrar neste la�o quando for inicio do jogo 
        	if(opcao == 0) {	
        		System.out.println("Bem vindo ao SuperTrunfo Motos");
        	}
        	System.out.println("Por favor, digite a quantidade de jogadores:");
        	qtd_jogadores = in.nextInt();
        	
        	//La�o de repeti��o para cria��o de novos jogadores
        	for (int i = 0; i<qtd_jogadores; i++) {
        		System.out.println("Digite o nome do jogador "+ (i+1));
        		Jogador jog = new Jogador(in.next());
        		jogadores.add(jog);
        	}
        	
        	
        	//Menu do final do jogo
        	System.out.println("Voc� deseja continuar jogando (1) ou sair do jogo? ");
        	opcao = in.nextInt();
        }while(opcao != 2);
        public void geraBaralho(){
        	Carta ca = new Carta(aletChar.charAt(aletInt),aletInt);
        }
        
        /*
        //M�todos do jogo a serem desenvolvidos
        public void distribuiCartas() {}
        public void comparaCartas() {}
        //M�todo abaixo deve consultar e atualizar/criar dados em um arquivo externo
        public void salvaRank() {}
      */
      }
}
