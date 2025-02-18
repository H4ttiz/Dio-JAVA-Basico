public class Car {

    private int march;

    private int speedometer;

    private boolean on;

    public Car(int march) {
        this.march = march;
        this.on = false;
        this.speedometer = 0;
    }


    public void setMarch(int march) {this.march = march;}
    public int getMarchMarch() {return march;}

    public void setSpeedometer(int speedometer) {this.speedometer = speedometer;}
    public int getSpeedometerSpeedometer() {return speedometer;}

    public boolean isOn() {return on;}
    public void turnOn(boolean on) {this.on = on;}
}
