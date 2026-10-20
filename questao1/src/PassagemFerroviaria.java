import java.util.Collections;
import java.util.List;

public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String nomePassageiro, double valor) {
        super(nomePassageiro, valor);
    }

    @Override
    public double calcularTaxa() {
        return pegarValor() * 0.05;
    }

    @Override
    public List<String> pegarDocumentosExigidos() {
        return Collections.singletonList("Comprovante de reserva");
    }

    @Override
    public String pegarTipo() {
        return "Ferroviária";
    }
}
