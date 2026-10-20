import java.util.List;

public abstract class EmissorPassagens {
    public final void emitir(String nomePassageiro, double valor) {
        Passagem passagem = criarPassagem(nomePassageiro, valor);
        double taxa = passagem.calcularTaxa();
        List<String> documentos = passagem.pegarDocumentosExigidos();

        System.out.println("=====================================");
        System.out.println("Resumo da emissão");
        System.out.println("Passageiro: " + passagem.pegarNomePassageiro());
        System.out.println("Tipo: " + passagem.pegarTipo());
        System.out.println("Valor da passagem: R$ " + String.format("%.2f", passagem.pegarValor()));
        System.out.println("Taxa: R$ " + String.format("%.2f", taxa));
        System.out.println("Documentos exigidos:");
        for (String documento : documentos) {
            System.out.println("- " + documento);
        }
        System.out.println("=====================================");
    }

    protected abstract Passagem criarPassagem(String nomePassageiro, double valor);
}
