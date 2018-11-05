public class Jogador {

    private String nome;
    private int qtd_carta;

    public Jogador(String nome) {
        this.nome = nome;
        this.qtd_carta = 4;
    }
    /**
     * Getters
     */
    public String getNome() { return nome; }
    public int getQtd_Carta() { return qtd_carta; }
    /**
     * Setters
     */
    public void setNome(String nome) { this.nome = nome; }
    public void setQtd_Carta(int qtd_carta) { this.qtd_carta = qtd_carta; }
    /**
     * toString
     */
    public String toString () {
        return "Jogador: " + nome + " Quantidade de cartas:" qtd_carta ;
    }
}
