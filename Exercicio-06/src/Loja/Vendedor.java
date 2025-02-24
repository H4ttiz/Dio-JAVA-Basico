package Loja;

public non-sealed class Vendedor extends Funcionarios{

    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada por " + getNome() + ". Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println(getNome() + " tem " + quantidadeVendas + " vendas realizadas.");
    }
}
