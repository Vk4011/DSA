public class Pattern {
    
    public static void Hr(int n){
        System.out.println("\n\t Hollow Rhombus Pattern \n");
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("\t ");

            }

            //Hallow rectangle - stars
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("\t*");

                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
         

    }
    

    public static void Diamond(int n){
        System.out.println("\n\t DIAMOND Pattern\n");
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("\t ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("\t*");
            }
            System.out.println("\n");
        }

        //2nd Half 
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print("\t ");
            }
            //stars
            for(int j=1;j<=(2*i)-1;j++){
                    System.out.print("\t*");
            }
            System.out.println("\n");
        }

    }



    public static void main(String[] args) {
        Hr(5);
        Diamond(4);
    }
    
}

// output 1:
//   Hollow Rhombus Pattern

//                                         *       *       *       *       *

//                                 *                               *

//                         *                               *

//                 *                               *

//         *       *       *       *       *




output:2
DIAMOND Pattern

                                *

                        *       *       *

                *       *       *       *       *

        *       *       *       *       *       *       *

        *       *       *       *       *       *       *

                *       *       *       *       *

                        *       *       *

                                *





                                ,