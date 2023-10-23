public class Basic {
    public static void main(String[] args) {
        System.out.println("\n\t Recursion Basic \n");
        int n=10;
        printN(n);
    }
    public static void printN(int n){

        // Base Case
        if(n == 1) {
            System.out.println(n);
            return ;
        } 

        System.out.println(n+" ");
        printN(n-1);
    }
    
}
