


class Anmial{
    void eat(){
        System.out.println("\n\t Eat anything ");
    }
}

public class Polym {
    public static void main(String[] args) {
    System.out.println("\n\t Method Overriding \n");
    System.out.println("\n\t Parent and child classes both contain the same function with a different definition is called function Overrides.");
    Deer d = new Deer();
    d.eat();
        
    }
}

class Deer extends Anmial{
    void eat(){
        System.out.println("\n\t Eating grass ");
    }
}



