public class Inverted {
    public static void main(String[] args) {
        System.out.println("\n\t Inverted Stars\n");
        int n=4;
        for(int l=1;l<=n;l++){
            for(int s=1;s<=(n-l+1);s++){
                System.out.print("\t*");
            }
            System.out.println("\n");
        }
    }
    
}
// output:
//     Inverted Start

//         *       *       *       *

//         *       *       *

//         *       *

//         *


