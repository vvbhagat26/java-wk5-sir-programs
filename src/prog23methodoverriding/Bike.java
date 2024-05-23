package prog23methodoverriding;

public class Bike extends Vehicle{
    /**
     * Creating a child class
     */

    public void run() {
        System.out.println("Vehicle is running safely");
    }

    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.run();
    }
}
