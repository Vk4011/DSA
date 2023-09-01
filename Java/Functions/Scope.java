public class Scope {
    
    public static void Scope(int a, int b){
        
        // System.out.println("\n\t This is Scope Variable :"+s);//Error s is not defined
        int s=a+b;
        System.out.println("\n\t This is Scope Variable :"+s);
        int v=45;
    }
    public static void BlockScope() {
        {
            int s=45;
        }
        // System.out.println(s);//Dosen't be used the var
        
    }
    public static void Loop() {
        for(int i=1;i<=5;i++){
            for(int p=1,q=0,k=4;i<=5;i++){
                

            }
        }
        // System.out.println(i);//Eroor it is defined in block scope
        //Scope
        int i=4;
        System.out.println(i);//4
        
    }
    
    public static void main(String[] args) {
        System.out.println("\n\t Method Scope ");
        // System.out.println(v);//Eroor doesn't be used other function variable
        int p=10;
        {
            int s=90;
            System.out.println("\n\\t Block Scope : "+s);
        } 
        System.out.println(p);
        // System.out.println(s);Error 

    }
    
}
