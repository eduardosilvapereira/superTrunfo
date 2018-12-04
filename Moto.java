import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class Moto {

    private String nome;
    private double peso;
    private int cilindrada;
    private double velocidade;
    private double aceleracao;
    private int potencia;

    public Moto(String nome) {
        this.nome = nome;
        this.peso = ThreadLocalRandom.current().nextDouble(120.00, 482.00);
        this.cilindrada = ThreadLocalRandom.current().nextInt(100, 1200);
        this.velocidade = ThreadLocalRandom.current().nextDouble(100.00, 330.00);
        this.aceleracao = ThreadLocalRandom.current().nextDouble(2.30, 10.00);
        this.potencia = ThreadLocalRandom.current().nextInt(100, 1200);
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public int getPotencia() {
        return potencia;
    }

    public String toString() {
        return "Nome Moto.: " + nome +
                "\nPeso......: " + new DecimalFormat("#.0#").format(peso) +
                "\nCilindrada: " + cilindrada +
                "\nVelocidade: " + new DecimalFormat("#.0#").format(velocidade) +
                "\nAceleração: " + new DecimalFormat("#.0#").format(aceleracao) +
                "\nPotência..: " + potencia;
    }
}
