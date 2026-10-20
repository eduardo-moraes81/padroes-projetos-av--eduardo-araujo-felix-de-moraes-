public class EmissorPassagemAerea extends EmissorPassagens {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valor) {
        return new PassagemAerea(nomePassageiro, valor);
    }
}