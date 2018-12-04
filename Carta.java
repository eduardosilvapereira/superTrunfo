public class Carta extends Moto {
    private String letra;
    private int numero;

    public Carta(String letra, int numero, String nome) {
        super(nome);
        this.letra = letra;
        this.numero = numero;
    }
    
    public String getLetra () { return letra; }
    public int getNumero () { return numero; }
    
    public void setLetra (String letra) { this.letra = letra; }
    public void setNumero (int numero) { this.numero = numero; }
    
    public String toString () {
        return "CARTA.....: " + letra + numero + "\n" + super.toString();
    }
}
