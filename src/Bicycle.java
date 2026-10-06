import java.util.Scanner;
public class Bicycle {
    private int gear = 1;
    private int cadence = 0;
    private int speed = 0;

    public Bicycle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cadence: ");
        cadence = input.nextInt();
        System.out.print("Enter speed: ");
        speed = input.nextInt();
        System.out.print("Enter gear: ");
        gear = input.nextInt();
        input.close();
    }

    public Bicycle(int gear, int cadence, int speed) {
        this.gear = gear;
        this.cadence = cadence;
        this.speed = speed;
    }

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
        if (gear < 0) {
            gear = 0;
        }
    }

    public void changeSpeed(int increment) {
        speed = speed + increment;
    }

    public void applyBreaks(int decrement) {
        speed = speed - decrement;
        if (speed < 0) {
            speed = 0;
        }
    }
    public void printStates() {
        System.out.println("Gear: " + gear + "  Speed: " + speed + "  Cadence: " + cadence);
    }
}
