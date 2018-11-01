public class Carta {
    
    private char letra;
    private int numero;

    public Carta(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }
    /**
     * Getters
     */
    public char getLetra() { return letra; }
    public double getNumero() { return numero; }
    /**
     * Setters
     */
    public void setLetra(char letra) { this.letra = letra; }
    public void setNumero(int numero) { this.numero = numero; }
    /**
     * toString
     */
    public String toString () {
        return "Carta: " + letra + numero;
    }
}
