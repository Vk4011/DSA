public class bitt {
    public static void Zero_One_Triangle(int n){
        System.out.println("\n\t Zero One Triangle \n");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("\t1");//Even

                }else{
                    System.out.print("\t0");
                }

            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Zero_One_Triangle(5);
    }
    
}




// output:
//  Zero One Triangle

//         1

//         0       1

//         1       0       1

//         0       1       0       1

//         1       0       1       0       1

//         0       1       0       1       0       1



// .