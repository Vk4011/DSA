public class Triangle {
    public static void triangle(int n) {
        System.out.println("\n\t Triangle star pattern \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
}

class Reverse extends Triangle{
    public static void rev(int n){
        System.out.println("\n\t Reverse triangle pattern \n");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i>=j){
                System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("\n");
        }
    }
    public static void equ(int n){
        System.out.println("\n\t Equalateral triangle pattern \n");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i>=j){
                System.out.print(" *    ");//add white space (n spaces + 1) 
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("\n");
        }
    }
    public static void sss(int n){
        System.out.println("\n\t Space Star Space \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("\t ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("\t*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.println("\t ");
            }
            System.out.print("\n");
        }
    }
   
}
class Inverse extends Reverse{
     public static void  inverse(int n){
        System.out.println("\n\t Inverse Triangle \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("\t *");
            }
            System.out.println("\n ");
        }
    }
    public static void SsS(int n){
        System.out.println("\n\t Inverse SSS \n");
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("\t ");
            }
            for(int j=0;j<((2*n)-(2*i+1));i++){
                System.out.print("\t *");
            }
            for(int j=0;j<i;j++){
                System.out.print("\t ");
            }
            System.out.print("\n");
        }
    }
}