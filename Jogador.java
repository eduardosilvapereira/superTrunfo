
public class Jogador {

    private String nome;
    private int numero;
    private Baralho cartas;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.cartas = new Baralho();
    }

    public String getNome() {
        return nome;
    }

    public Baralho getCartas() {
        return cartas;
    }

    public Carta getCartaByIndex(int index) {
        return cartas.getCartaByIndex(index);
    }

    public void adicionaCarta(Carta carta) {
        cartas.Adicionar(carta);
    }

    public void excluiCarta(Carta carta) {
        cartas.Excluir(carta);
    }

    public String toString() {
        return "JOGADOR[" + numero + "]: " + nome + " (" + cartas.getSize() + ")";
    }
}
