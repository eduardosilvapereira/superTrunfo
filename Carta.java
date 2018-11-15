public class Carta extends Moto {
    private String letra;
    private int numero;

    public Carta(String letra, int numero, String nome) {
        super(nome);
        this.letra = letra;
        this.numero = numero;
    }
    /**
     * Getters
     */
    public String getLetra() { return letra; }
    public double getNumero() { return numero; }
    /**
     * Setters
     */
    public void setLetra(String letra) { this.letra = letra; }
    public void setNumero(int numero) { this.numero = numero; }
    /**
     * toString
     */
    public String toString () {
        return "Carta: " + letra + numero + "\n" + super.toString();
    }
}
