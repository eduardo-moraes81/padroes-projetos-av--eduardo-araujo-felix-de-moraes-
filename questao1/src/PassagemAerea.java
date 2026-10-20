import java.util.Arrays;
import java.util.List;

public class PassagemAerea extends Passagem {
    public PassagemAerea(String nomePassageiro, double valor) {
        super(nomePassageiro, valor);
    }

    @Override
    public double calcularTaxa() {
        return pegarValor() * 0.08;
    }

    @Override
    public List<String> pegarDocumentosExigidos() {
        return Arrays.asList("Documento de identidade com foto", "Bilhete eletrônico");
    }

    @Override
    public String pegarTipo() {
        return "Aérea";
    }
}
