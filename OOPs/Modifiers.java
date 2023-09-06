import org.w3c.dom.ls.LSOutput;

class Car{

    //Public means access able every where
    String model;

    String make;
    public String color;
    public  int price;

    private String Cnumber  = "1234ABC"; // The chase number of car is private

    public void printCno(){
        System.out.println("\n\t The private access modifiers are accessed inside the class ");
        System.out.println("\n\t C number of car is : "+Cnumber);
    }
    public void start(){
        System.out.println("\n\t car is starting ");
    }


}
public class Modifiers {

    public static void main(String[] args) {
        System.out.println("\n\t Access Modifier");
        System.out.println("\n\t public is access modifier it give public access = access to all");
        System.out.println("\n\t Public is access  all inside and outside of the class ");
        System.out.println("\n\t Private is access inside class we can't access outside of the class ");
        System.out.println("\n\t Car class is created ");
        System.out.println("\n\t Car kia is object is created ");
        Car kia = new Car();//Car is object is created kia

        kia.price = 5000;

        System.out.println("\n\t "+kia.price);
        kia.start();

//        kia.cNumber = 123; no access it is private

        kia.printCno();


    }
}
