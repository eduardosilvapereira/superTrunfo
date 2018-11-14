import java.util.concurrent.ThreadLocalRandom;

public class Moto {
    
    protected String nome;
    protected double peso;
    protected int cilindrada;
    protected double velocidade;
    protected double aceleracao;
    protected int potencia;

    public Moto(String nome) {
        this.nome = nome;
        this.peso = ThreadLocalRandom.current().nextDouble(120.00,482.00);
        this.cilindrada = ThreadLocalRandom.current().nextInt(100,1200);
        this.velocidade = ThreadLocalRandom.current().nextDouble(100.00,330.00);
        this.aceleracao = ThreadLocalRandom.current().nextDouble(2.30,10.00);
        this.potencia = ThreadLocalRandom.current().nextInt(100,1200);
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
        return "Nome: " + nome +
               "\nPeso: " + peso +
               "\nCilindrada: " + cilindrada +
               "\nVelocidade: " + velocidade +
               "\nAceleração: " + aceleracao +
               "\nPotência: " + potencia;
    }
}
