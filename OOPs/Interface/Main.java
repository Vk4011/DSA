
public class Main{
  public static void main(String args[]){
    System.out.println("Abstractions The ghost theory !!!");
    Horse h=new Horse();
    Chandu ch = new Chandu();
    ch.color = "blue";
    System.out.println("\n\t Chandhu color : "+ch.color);
    //Animal -> Horse -> Chandhu
    //Animal a=new Animal() //not possible 
    h.eat();
    h.walk();
    Hen chicken=new Hen();
    chicken.eat();
    chicken.walk();
    System.out.println("Horse color : " + h.color);
    h.makesound();
    chicken.makesound();
    ch.makesound();
    
      
  }
}


 abstract class Animal{
  String color;
  void eat(){ //normal methods
    System.out.println("\n\t Animal eats ");
  }
  Animal(){
    color = "brown"; 
    System.out.println("\n\t Animal constructor is called \n");
  }
  
  abstract void walk();
   //abstract method
   void makesound(){
     System.out.println("\n\t Animal make Sound ...");
   }
  
}

class Horse extends Animal{
  @Override
  void walk(){
    System.out.println("\n\t  Walking with 4 legs  ");
  }
  @Override
   void makesound(){
     System.out.println("\n\t Animal make barke ...");
   }
}
class Hen extends Animal{
    
  @Override
   void makesound(){
     System.out.println("\n\t Hen make sound  Hakum ...");
   }
  void walk(){
    System.out.println("\n\t Walking with 2 legs \n");
  }
}


class Chandu extends Horse{
  Chandu(){
    System.out.println("Chandu constructor is called..");
  }
   @Override
   void makesound(){
     System.out.println("\n\t Chandhu sound meow ...");
   }
}