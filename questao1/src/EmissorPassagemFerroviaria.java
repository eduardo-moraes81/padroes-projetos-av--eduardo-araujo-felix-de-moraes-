public class EmissorPassagemFerroviaria extends EmissorPassagens {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double valor) {
        return new PassagemFerroviaria(nomePassageiro, valor);
    }
}