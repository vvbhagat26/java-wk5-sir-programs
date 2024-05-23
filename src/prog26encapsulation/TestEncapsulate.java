package prog26encapsulation;

public class TestEncapsulate {
    public static void main(String[] args) {

        Encapsulate obj=new Encapsulate();

        // setting values of the variables
        obj.setName("Amit");
        obj.setRollNo(51);
        obj.setAge(19);

        //Displaying values of the variables
        System.out.println("Prime's name "+obj.getName());
        System.out.println("Prime's rollno. "+obj.getRollNo());
        System.out.println("Prime's age "+obj.getAge());

        // Direct access of rollNo is not possible due to  encapsulatio

// System.out.println("Prime's rollNo : " +obj.geekName);
}}
