import Loja.Atendente;
import Loja.Gerente;
import Loja.Vendedor;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", "joao@empresa.com", "senha123",false);
        Vendedor vendedor = new Vendedor("Maria", "maria@empresa.com", "senha456",false);
        Atendente atendente = new Atendente("Carlos", "carlos@empresa.com", "senha789",false);

        gerente.realizarLogin("joao@empresa.com", "senha123");
        System.out.println("Adiministrador: "+ gerente.isAdministrador());
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.realizarLogoff();

        vendedor.realizarLogin("maria@empresa.com", "senha456");
        System.out.println("Adiministrador: "+ vendedor.isAdministrador());
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogoff();

        atendente.realizarLogin("carlos@empresa.com", "senha789");
        System.out.println("Adiministrador: "+ atendente.isAdministrador());
        atendente.receberPagamento(100.0);
        atendente.receberPagamento(50.0);
        atendente.fecharCaixa();
        atendente.realizarLogoff();
    }
}