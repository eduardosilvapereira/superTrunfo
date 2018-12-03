import java.util.ArrayList;

public class Jogador {

    private String nome;
    private Baralho cartas;
    
    public Jogador (String nome) {
        this.nome = nome;
        this.cartas = new Baralho();
    }

    public String getNome () { return nome; }
    public Baralho getCartas () { return cartas; }
    public Carta getPrimeiraCarta () { return cartas.getCartaByIndex(0); }
    
    public void setNome (String nome) { this.nome = nome; }

    public void adicionaCarta (Carta carta) {
        cartas.Adicionar(carta);
    }
    
    public String toString (int num) {
        String str;
        
        if (num > 0) {
            str = "Jogador [" + num + "]: " + nome;
        } else {
            str = "Jogador: " + nome;
        }
        return str;
    }
}
