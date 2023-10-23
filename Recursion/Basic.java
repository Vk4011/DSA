public class Basic {
    public static void inc(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        inc(n-1);
        System.out.println(n+" ");

    }
    public static void main(String[] args) {
        System.out.println("\n\t Recursion Basic \n");
        int n=10;
        printN(n);
        System.out.println("\n\t increasing order \n");
        inc(n);
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

//             increasing order

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10



