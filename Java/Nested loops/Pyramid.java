public class Pyramid {
    public static void main(String[] args) {
        System.out.println("\n\t pint Half-Pyramid pattern \n");
        
        //outer loop line print
        for(int i=1;i<=4;i++){
            //inner loop numbers print
            for(int j=1;j<=i;j++){
                System.out.print("\t"+j); // same line
            }
            System.out.println("\n");//next line
        }
    }
    
}

// output:
//    pint Half-Pyramid pattern

//         1

//         1       2

//         1       2       3

//         1       2       3       4

