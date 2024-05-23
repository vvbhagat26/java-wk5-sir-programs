package prog24overridingbank;

public class Test2 { //Test class to create objects and call the methods
    public static void main(String[] args) {
    SBI s=new SBI();
    ICICI i=new ICICI();
    Axis a=new Axis();
        System.out.println("SBI rate "+ s.rateOfInterest());
        System.out.println("ICICI rate "+i.rateOfInterest());
        System.out.println("Axis rate "+a.rateOfinterest());
}}
