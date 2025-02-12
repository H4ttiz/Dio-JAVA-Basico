import java.util.Scanner;

public class ContaBanco{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = teclado.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = teclado.nextLine();

        System.out.print("Digite seu numero de  cadastro: ");
        int numero = teclado.nextInt();

        System.out.print("Digite seu  saldo: ");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
