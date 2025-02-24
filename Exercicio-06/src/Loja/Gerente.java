package Loja;

public non-sealed class Gerente extends Funcionarios{
    public Gerente(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, true);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado por " + getNome());
    }

    public void consultarVendas() {
        System.out.println(getNome() + " está consultando as vendas.");
    }
}
