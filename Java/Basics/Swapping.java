public class Swapping {
    public static void main(String[] args) {
        System.out.println("\n\t Swappin of two number \n");
        int a=5;
        int b=4;
        System.out.println("\n\t Before Swapping  a : "+a+" b : "+b);
        int c=a;
        a=b;
        b=c;    
        System.out.println("\n\t After Swapping   a : "+a+" b : "+b);


        int n=5;
        System.out.println("\n\t value n : "+n);
        increase(n);
        ++n;
        System.out.println("\n\t pre increement : "+n);
        System.out.println("\n\t increement : "+n);

    }
    public static void increase(int n){
        System.out.println("\n\t Increasing the value \n");
        n=n+1;
     
        System.out.println("\n\t n value n=n+1  : "+n);
    }
}
