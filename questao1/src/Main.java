public class Main {
    public static void main(String[] args) {
        new EmissorPassagemAerea().emitir("escobarzin da rua debaixo", 1500.00);
        new EmissorPassagemRodoviaria().emitir("duduzin da rua de cima", 220.00);
        new EmissorPassagemFerroviaria().emitir("guilhermin da 17", 800.00);
    }
}
