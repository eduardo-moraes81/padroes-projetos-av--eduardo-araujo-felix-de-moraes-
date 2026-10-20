public class ComprovanteMatriculaBrasil implements ComprovanteMatricula {
    private final String aluno;
    private final String cpf;

    public ComprovanteMatriculaBrasil(String aluno, String cpf) {
        this.aluno = aluno;
        this.cpf = cpf;
    }

    @Override
    public String descricao() {
        return "Aluno: " + aluno + " | CPF: " + cpf;
    }
}