import java.util.ArrayList;

public class Jogador {

    private String nome;
    private ArrayList<Carta> cartas;
    private Carta cartaAtiva;
    
    public Jogador(String nome) {
        this.nome = nome;
    }
    /**
     * Getters
     */
    public String getNome() { return nome; }
    /**
     * Setters
     */
    public void setNome(String nome) { this.nome = nome; }
    /**
     * toString
     */
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
