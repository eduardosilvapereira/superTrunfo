public class Jogador {

    private String nome;
    
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
