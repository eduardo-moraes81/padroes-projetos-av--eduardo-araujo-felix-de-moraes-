public class ChileFactory implements PaisFactory {
    private final String aluno;
    private final String rut;

    public ChileFactory(String aluno, String rut) {
        this.aluno = aluno;
        this.rut = rut;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalChile();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoChile();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteMatriculaChile(aluno, rut);
    }
}
