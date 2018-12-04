public class Carta extends Moto {

    private String letra;
    private int numero;
    private boolean superTrunfo;

    public Carta(String letra, int numero, String nome, boolean superTrunfo) {
        super(nome);
        this.letra = letra;
        this.numero = numero;
        this.superTrunfo = superTrunfo;
    }

    public String getLetra() {
        return letra;
    }

    public int getNumero() {
        return numero;
    }

    public boolean getSuperTrunfo() {
        return superTrunfo;
    }

    public String toString() {
        String str = "CARTA.....: " + letra + numero;

        if (superTrunfo) {
            str += " (SUPER TRUNFO)";
        }

        return str + "\n" + super.toString();
    }
}
