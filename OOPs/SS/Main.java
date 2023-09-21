package SS;

 class Animal {
    String color;
    
    Animal(String c){
        System.out.println("\n\t Animal constructor is called\n");
        this.color =c;
    }
       void display(){
        
            System.out.println("\n\t Method in the Super class ");
        }
    
}
class Horse extends Animal{
    int age;
    Horse(String c,int a){
        super("Sida");//invokeing the Super class by using super calling the Animal () //
        // c="red";
        this.age =a; 
        System.out.println("\n\t Horse constructor is called \n");
        System.out.println("\n\t Horse age : "+a);
        System.out.println("\n\t Horse color : "+c);
        // System.out.println("\n\t Horse color : "+color);
    }
    void display(){
        System.out.println("\n\t Method in sub class");
        super.display();
    }
 
}


public class Main{
    public static void main(String[] args) {
    Horse h=new Horse("brown",30);
    System.out.println("\n\t Name of horse : "+h.color);
     h.display();
    }
}