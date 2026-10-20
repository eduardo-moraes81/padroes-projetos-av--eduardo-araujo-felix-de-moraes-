public class Main1 {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new BrasilFactory("jãozin da silva", "123.456.789-09"));
        Matricula matriculaChile = new Matricula(new ChileFactory("eduzinn", "12.345.678-9"));

        matriculaBrasil.emitir();
        matriculaChile.emitir();
    }
}
