import java.util.List;

public abstract class Passagem {
    private final String nomePassageiro;
    private final double valor;

    protected Passagem(String nomePassageiro, double valor) {
        this.nomePassageiro = nomePassageiro;
        this.valor = valor;
    }

    public String pegarNomePassageiro() {
        return nomePassageiro;
    }

    public double pegarValor() {
        return valor;
    }

    public abstract double calcularTaxa();

    public abstract List<String> pegarDocumentosExigidos();

    public abstract String pegarTipo();
}
