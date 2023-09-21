package SS;

public class Mkv {
    public static void main(String[] args) {
        B b=new B();
        
    }
}

class A{
    int a;
    A(){
        System.out.println("\n\t Constructor A");
    }
}
class B extends A{
     
    B(){
         a=90;
        System.out.println("\n\t Constructor B");
      
        System.out.println("\n\t Confuse : "+a);
    }
}