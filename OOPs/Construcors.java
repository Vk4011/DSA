

public class Construcors {
    public static void main(String[] args) {
        System.out.println("\n\t Constructors ");
        Mustang mH = new Mustang();
                
    }    
}

class Animal{
    String color ;
    Animal(){
        color = "brown";
        System.out.println("\n\t Animal Constructor called \n");
    }
    void eat(){
        System.out.println("\n\t Animal eats \n");
    }
}

class Horse extends Animal{
    void changecolor(){
        color = "dark brown";
    }
    Horse(){
        System.out.println("\n\t Horse constructor is called \n");

    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("\n\t Mustang constructor is called \n");
    }
}