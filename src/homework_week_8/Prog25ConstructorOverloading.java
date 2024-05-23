package homework_week_8;

public class Prog25ConstructorOverloading {
    //Java program to overload constructors

    int id;
    String name;
    int age;

    //creating two arg constructor
    Prog25ConstructorOverloading(int i,String n){
        id=i;
        name=n;
    }

   //creating three arg constructor
    Prog25ConstructorOverloading(int i,String n,int a){
        id=i;
        name=n;
        age=i;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        Prog25ConstructorOverloading student1=new Prog25ConstructorOverloading(111,"Karan");
        Prog25ConstructorOverloading student2=new Prog25ConstructorOverloading(222,"Aryan",25);
        student1.display();
        student2.display();
    }
}
