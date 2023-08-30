public class Hollow{
    public static void Hallow_rectangle(int r,int c){
    System.out.println("\n\t Print HOLLOW RECTANGLE pattern \n");
        //outer loop 
    for(int i=1;i<=r;i++){
        //inner loop columns
            for(int j=1;j<=c;j++){
                //Cell -(i,j) 
                 if(i==1||i==r||j==1||j==c){
                     //Boundary cell star no boundary empty string
              
                    System.out.print("\t*");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println("\n");
        }
        System.out.println("");

}
    
    public static void main(String[] args) {
        Hallow_rectangle(4, 5);
        
    }
}

// output:

//   Print HOLLOW RECTANGLE pattern

//         *       *       *       *       *

//         *                               *

//         *                               *

//         *       *       *       *       *
