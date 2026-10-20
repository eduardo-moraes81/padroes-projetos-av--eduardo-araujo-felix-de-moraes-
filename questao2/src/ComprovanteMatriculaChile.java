public class ComprovanteMatriculaChile implements ComprovanteMatricula {
    private final String aluno;
    private final String rut;

    public ComprovanteMatriculaChile(String aluno, String rut) {
        this.aluno = aluno;
        this.rut = rut;
    }

    @Override
    public String descricao() {
        return "Aluno: " + aluno + " | RUT: " + rut;
    }
}