import Domain.Employee;
import Domain.Maneger;
import Domain.Salesman;

public class Main {

    public static void main(String[] args) {
        //Domain.Employee employee = new Domain.Employee(); --> class abstrac não pode ser instanciada
        printEmployee(new Maneger()); // Polimorfismo
        printEmployee(new Salesman()); // Polimorfismo
    }

    public static void printEmployee(Employee employee) { // Cria a variavel/Objeto employee
        System.out.println("==============" + employee.getClass().getCanonicalName() + "=============="); // Imprime o nome da class Extend (Domain.Maneger, Domain.Salesman)
        switch (employee){
            case Maneger maneger -> { // Cria a variavel/objeto maneger na class Domain.Maneger Instanciada pela class Domain.Employee
                maneger.setCode("123");
                maneger.setName("John Doe");
                maneger.setSalary(5000);
                maneger.setLogin("John123");
                maneger.setPassword("123456");
                maneger.setAddress("Rua Santa Carina");
                maneger.setAge(43);
                maneger.setCommission(1200);

                System.out.println("Comissão: " + maneger.getCommission());
                System.out.println("Code: " + maneger.getCode());
                System.out.println("Endereço: " + maneger.getAddress());
                System.out.println("Salario: " + maneger.getSalary());
                System.out.println("Idade: " + maneger.getAge());
                System.out.println("Nome: " + maneger.getName());
                System.out.println("Login: " + maneger.getLogin());
                System.out.println("Senha: " + maneger.getPassword());
            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setName("Jane Doe");
                salesman.setSalary(2500);
                salesman.setAge(23);
                salesman.setAddress("Rua Rio de Janeiro");
                salesman.setSoldAmount(1000);
                salesman.setPercentPerSold(10);

                System.out.println("Porcentual por venda: " + salesman.getPercentPerSold());
                System.out.println("Salario: " + salesman.getSalary());
                System.out.println("Valor Vendido: " + salesman.getSoldAmount());
                System.out.println("Idade: " + salesman.getAge());
                System.out.println("Endereço: " + salesman.getAddress());
                System.out.println("Code: " + salesman.getCode());
                System.out.println("Nome: " + salesman.getName());
            }
        }
        System.out.println("Salario Final: " + employee.getFullSalary());
        System.out.println("===================================");
    }
}