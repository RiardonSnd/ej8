public class Main {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        Bicycle b2 = new Bicycle();
        Bicycle b3 = new Bicycle(4, 5, 20);
        b2.changeGear(-5);
        b.changeCadence(20);
        b.printStates();
        b.changeGear(3);
        b.printStates();
        b2.printStates();
        System.out.print(b2);
        System.out.print(b);
    }
}
