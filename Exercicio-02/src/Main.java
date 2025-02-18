import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Car car = new Car(0);
    private final static Engine engine = new Engine(car);

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;
        do {


            System.out.println("====Escolha uma das opções====");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - aumentar marcha");
            System.out.println("3 - diminuir marcha");
            System.out.println("4 - acelerar");
            System.out.println("5 - freiar");
            System.out.println("6 - virar para a esquerda");
            System.out.println("7 - virar para a direita");
            System.out.println("8 - desligar o carro");
            option = scanner.nextInt();
            switch(option){
                case 1 -> setCar();
                case 2 -> engine.addMarch();
                case 3 -> engine.reducesMarch();
                case 4 -> acelere();
                case 5 -> desacelere();
                case 6 -> engine.turnToTheLeft();
                case 7 -> engine.turnToTheRight();
                case 8 -> option = offCar();
            }
        }while (option != 0);

    }
    public static void setCar() {
        System.out.println("Ligando o Carro");
        for (int cont = 0; cont < 5; cont++) {
            System.out.println(".");
        }
        engine.startCar();
    }
    public static int offCar(){
        int velocidade = engine.getSpeedometer();
        int marcha = engine.getMarch();
        engine.stopCar();
        if (velocidade == 0 && marcha == 0) {
            return 0;
        }
        return 1;
    }
    public static void acelere() {
        engine.accelerate();
        int velocidade = engine.getSpeedometer();
        System.out.println("Velocidade: " + velocidade);
    }
    public static void desacelere() {
        engine.decelerate();
        int velocidade = engine.getSpeedometer();
        System.out.println("Velocidade: " + velocidade);
    }
}
