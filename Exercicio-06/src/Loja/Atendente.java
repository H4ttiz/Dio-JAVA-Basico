package Loja;

public non-sealed class Atendente extends Funcionarios{

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, false);
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento de R$" + valor + " recebido por " + getNome() + ". Valor em caixa: R$" + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado por " + getNome() + ". Valor final em caixa: R$" + valorEmCaixa);
        valorEmCaixa = 0.0; // Zera o caixa após fechar
    }
}
