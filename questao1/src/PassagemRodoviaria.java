import java.util.Collections;
import java.util.List;

public class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String nomePassageiro, double valor) {
        super(nomePassageiro, valor);
    }

    @Override
    public double calcularTaxa() {
        return pegarValor() * 0.03;
    }

    @Override
    public List<String> pegarDocumentosExigidos() {
        return Collections.singletonList("Documento de identidade com foto");
    }

    @Override
    public String pegarTipo() {
        return "Rodoviária";
    }
}
