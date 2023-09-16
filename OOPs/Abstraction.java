public class Abstraction {
    public static void main(String[] args) {
    System.out.println("\n\t Hiding all the unnecessary details and showing only the important parts of the uses \n");        
    
    Horse h=new Horse();
    h.eat();
    h.walk();
    Chicken c=new Chicken();
    c.eat();
    c.walk();

    //Animal a = new Animal(); //error cannot instantiate the type animal 

    }
}

abstract class Animal{
    void eat(){
        System.out.println("\n\t Animal eats ");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("\n\t Walks on 4 legs \n");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("\n\t Walks on 2 legs \n");
    }
}

            out put:

                Hiding all the unnecessary details and showing only the important parts of the uses 


         null is eating

         Walks on 4 legs 


         null is eating

         Walks on 2 legs




         