package SS;

public class Practise {
    
    public static void main(String[] args) {
       
        B b = new B();
    }
}
class A{
    int valA;
    
    A(int a){
       
        System.out.print("Hello from constructor A" + a);
    }
}
class B extends A{
    int valB;
    
    B(){
        super(10);
        System.out.print("\n Hello from constructor B");
    }
}