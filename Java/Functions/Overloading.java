public class Overloading {
    public static int sum(int a,int b) {
        return a+b;
        
    }
    public static int sum(int a,int b,int c) {
        return a+b+c;
        
    }
    
    public static void main(String[] args) {
    System.out.println("\n\t Function Overloading ...\n");  
    System.out.println("\n\t Sum 1 :"+sum(9,3));  
    System.out.println("\n\t Sum 2 :"+sum(1,2,5));  
    }
    
}

// output:
//    Function Overloading ...


//          Sum 1 :12

//          Sum 2 :8