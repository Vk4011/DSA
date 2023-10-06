public class Powerthree {
    public static void main(String[] args) {
        System.out.println("\n\t Power three \n");
        int n=27;
        System.out.println("\n\t Power 3 is : "+Power(n));
    }
    public static boolean Power(int n) {
    
        if(n>1){
        while(n%3==0){
            n=n/3;
        }
    }
    return n==1;        
    }
    
}
                    output:

                     Power three


         Power 3 is : true




         