import java.util.ArrayList;

public class Jogador {

    private String nome;
    private ArrayList<Carta> cartas;
    
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
    public String toString () {
        return "Jogador: " + nome;
    }
}
