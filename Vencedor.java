public class Vencedor {

    private String nome;
    private int rodadas;

    public Vencedor(String nome, int rodadas) {
        this.nome = nome;
        this.rodadas = rodadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }

    public String getNome() {
        return nome;
    }

    public int getRodadas() {
        return rodadas;
    }
}
