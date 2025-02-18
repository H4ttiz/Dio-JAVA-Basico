public class Engine {
        private int march = 0;
        private int speedometer = 0;
        private final Car car;

    public int getMarch() {return march;}
    public int getSpeedometer() {return speedometer;}
    public Engine(Car car) {
            this.car = car;
    }

    public void startCar() {
        if (march != 0) {
            System.out.println("Coloque a marcha no ponto morto!");
            System.out.println("Marcha: " + march);
            return;
        }
        car.turnOn(true);
        System.out.println("Carro ligado!");
    }
    public void stopCar() {
        if (speedometer != 0 || march != 0) {
            if (speedometer > 0 ){System.out.println("Pare o carro para poder desliga-lo!");}
            if (march != 0){System.out.println("Coloque a marcha no ponto morto!");}
            System.out.println("Marcha: " + march);
            System.out.println("Velocimetro: " + speedometer);
            return;
        }
        car.turnOn(false);
        System.out.println("Carro desligado!");
    }

    public void addMarch() {
        if (march == 6) {
            System.out.println("Marcha limite!");
        } else if (march == 5 && speedometer >= 100) {
            march++;
        } else if (march == 4 && speedometer >= 80) {
            march++;
        } else if (march == 3 && speedometer >= 60) {
            march++;
        } else if (march == 2 && speedometer >= 40) {
            march++;
        } else if (march == 1 && speedometer >= 20) {
            march++;
        } else if (march == 0 && speedometer == 0) {
            march++;
            System.out.println("Carro parado em marcha neutra.");
        } else {
            System.out.println("Aumente a velocidade!");
        }
        System.out.println("Marcha: " + march);
        System.out.println("Velocímetro: " + speedometer);
    }

    public void reducesMarch() {
        if (march == 0) {
            System.out.println("Marcha limite!");
        } else if (march == 1 && speedometer == 0) {
            march--;
        } else if (march == 2 && speedometer <= 20) {
            march--;
        } else if (march == 3 && speedometer <= 40) {
            march--;
        } else if (march == 4 && speedometer <= 60) {
            march--;
        } else if (march == 5 && speedometer <= 80) {
            march--;
        } else if (march == 6 && speedometer <= 100) {
            march--;
        } else {
            System.out.println("Diminuir a velocidade!");
        }

        System.out.println("Marcha: " + march);
        System.out.println("Velocímetro: " + speedometer);
    }


    public void accelerate() {
        if (speedometer == 120) {
            System.out.println("Velocidade máxima!");
        } else if ((speedometer >= 100 && march == 5) ||
                (speedometer >= 80 && march == 4) ||
                (speedometer >= 60 && march == 3) ||
                (speedometer >= 40 && march == 2) ||
                (speedometer >= 20 && march == 1) ||
                (march == 0)){
            System.out.println("Suba a marcha!");
        } else {
            speedometer++;
        }
        System.out.println("Velocidade: " + speedometer);
    }

    public void decelerate() {
        if (speedometer == 0) {
            System.out.println("Carro já está parado!");
        } else if ((speedometer <= 20 && march == 2) ||
                (speedometer <= 40 && march == 3) ||
                (speedometer <= 60 && march == 4) ||
                (speedometer <= 80 && march == 5) ||
                (speedometer <= 100 && march == 6)) {
            System.out.println("Reduza a marcha!");
        } else {
            speedometer--;
        }
        System.out.println("Velocidade: " + speedometer);
    }

    public void turnToTheLeft() {
        if (speedometer < 1) {
            System.out.println("Carro parado! Não é possível fazer a conversão.");
            return;
        } else if (speedometer > 40) {
            System.out.println("Velocidade muito alta para fazer a conversão!");
            return;
        }
        System.out.println("Virando para a esquerda!");
    }

    public void turnToTheRight() {
        if (speedometer < 1) {
            System.out.println("Carro parado! Não é possível fazer a conversão.");
            return;
        } else if (speedometer > 40) {
            System.out.println("Velocidade muito alta para fazer a conversão!");
            return;
        }
        System.out.println("Virando para a direita!");
    }

}
