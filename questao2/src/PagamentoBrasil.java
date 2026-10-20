public class PagamentoBrasil implements Pagamento {
    @Override
    public String descricao() {
        return "Pix";
    }
}