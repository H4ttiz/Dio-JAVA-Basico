import domain.BRLClock;
import domain.Clock;
import domain.USClock;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHour(13);
        brlClock.setMinute(0);
        brlClock.setSecond(0);

        System.out.println(brlClock.getTime());
        System.out.println(new USClock().convert(brlClock).getTime());
    }
}
