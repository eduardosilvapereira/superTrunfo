public class Vencedor {
    
    private String nome;
    private int pontuacao;
    
    public Vencedor(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setPontuacao(int pontuacao) { this.pontuacao = pontuacao; }

    public String getNome() { return nome; }
    public int getPontuacao() { return pontuacao; }
}
