


interface Bicycle{
  void applyBreak(int dectrement);
  void speedUp(int increment);
}

class Chandhu implements Bicycle{
  int speed=70;
  @Override
  public void applyBreak(int decrement){
    speed = speed-decrement;
  }
  @Override
  public void speedUp(int increment){
    speed = speed+increment;
  }
  
}

public class Cycle {   

    public static void main(String[] args) {
        
        Chandhu ch = new Chandhu();
        System.out.println("Chandu speed is : " + ch.speed);
        ch.applyBreak(10);
        System.out.println("Chandu speed is : " + ch.speed);
        ch.speedUp(40);
        System.out.println("Chandu speed is : " + ch.speed);
       }
}

            output: 

           Chandu speed is : 70
           Chandu speed is : 60
           Chandu speed is : 100
    




           