import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero (Inteiro): ");
        int num1 = ler.nextInt();
        System.out.print("Digite o segundo numero (Inteiro): ");
        int num2 = ler.nextInt();

        try {
            ParametrosInvalidosException.contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}