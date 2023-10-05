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
}