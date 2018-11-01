public class Moto extends Carta {
    
    private String nome;
    private double peso;
    private int cilindrada;
    private double velocidade;
    private double aceleracao;
    private int potencia;

    public Moto(char letra, int numero, String nome) {
        super(letra, numero);
        this.nome = nome;
    }
    /**
     * Getters
     */
    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public int getCilindrada() { return cilindrada; }
    public double getVelocidade() { return velocidade; }
    public double getAceleracao() { return aceleracao; }
    public int getPotencia() { return potencia; }
    /**
     * Setters
     */
    public void setNome(String nome) { this.nome = nome; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
    public void setVelocidade(double velocidade) { this.velocidade = velocidade; }
    public void setAceleracao(double aceleracao) { this.aceleracao = aceleracao; }
    public void setPotencia(int potencia) { this.potencia = potencia; }
    /**
     * toString
     */
    public String toString () {
        return super.toString() +
        "\nNome: " + nome +
        "\nPeso: " + peso +
        "\nCilindrada: " + cilindrada +
        "\nVelocidade: " + velocidade +
        "\nAceleração: " + aceleracao +
        "\nPotência: " + potencia;
    }
}
