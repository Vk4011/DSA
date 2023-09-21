package Abstraction;

public class Girl extends Parent {

    //Run time polymorphism (Dynamic)
    @Override
    void job(){
        System.out.println("\n\tshe going to become a Docter \n");
    }
    @Override
    void learn(){
        System.out.println("\t  learning Medicine   \n ");
        
    }
    
}
