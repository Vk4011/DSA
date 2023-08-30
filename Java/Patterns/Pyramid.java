public class Pyramid {
    
    public static void Inverted_Rotated_Half_Pyramid(int n){
        System.out.println("\n\t INVERTED & ROTATED HALF-PYRAMID \n");
        //Outer loop row
        for(int r=1;r<=n;r++){
            
            //Spaces
            for(int c=1;c<=n-r;c++){
                System.out.print("\t");
            }
            //Stars
            for(int c=1;c<=r;c++){
                System.out.print("\t*");

            }
            System.out.println("\n");

        }
        System.out.println("\n");
        
   
    }
    
    
    public static void main(String[] args) {
        Inverted_Rotated_Half_Pyramid(5);
    }
    
}


// output:

//  INVERTED & ROTATED HALF-PYRAMID

//                                         *

//                                 *       *

//                         *       *       *

//                 *       *       *       *

//         *       *       *       *       *