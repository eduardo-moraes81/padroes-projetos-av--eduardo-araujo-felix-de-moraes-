public class BrasilFactory implements PaisFactory {
    private final String aluno;
    private final String cpf;

    public BrasilFactory(String aluno, String cpf) {
        this.aluno = aluno;
        this.cpf = cpf;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBrasil();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBrasil();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteMatriculaBrasil(aluno, cpf);
    }
}
