public class Squareroot {
    public static void main(String[] args) {
        System.out.println("\n\t Newton rapson Method \n");
        int n=40;
        System.out.println("\n\t Square root : "+sqrt(n));
    }
    static double sqrt(double n){
        double x=n;
        double root;
        while (true) {
             root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
    
}

        //       Newton rapson Method


        //  Square root : 6.40195561907565


        // Complexcity : O( (log N ) f(N) )
        
        // f(n) = cost of calculating f(x)/f(x)' with n-digit precetion





        