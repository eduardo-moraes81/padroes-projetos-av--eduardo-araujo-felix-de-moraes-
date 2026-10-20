import java.util.Objects;

public class Matricula {
    private final PaisFactory paisFactory;

    public Matricula(PaisFactory paisFactory) {
        this.paisFactory = Objects.requireNonNull(paisFactory, "PaisFactory não pode ser nulo");
    }

    public void emitir() {
        DocumentoFiscal documentoFiscal = paisFactory.criarDocumentoFiscal();
        Pagamento pagamento = paisFactory.criarPagamento();
        ComprovanteMatricula comprovante = paisFactory.criarComprovante();

        System.out.println("=====================================");
        System.out.println("Documentos da matrícula");
        System.out.println("Documento fiscal: " + documentoFiscal.descricao());
        System.out.println("Pagamento: " + pagamento.descricao());
        System.out.println("Comprovante: " + comprovante.descricao());
        System.out.println("=====================================");
    }
}
