public class EmissorPassagemRodoviaria extends EmissorPassagens {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valor) {
        return new PassagemRodoviaria(nomePassageiro, valor);
    }
}