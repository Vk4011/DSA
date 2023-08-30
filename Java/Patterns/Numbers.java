public class Numbers {
    
    public static void Number(int n){
        System.out.println("\n\t INVERTED & ROTATED HALF-PYRAMID with Numbers \n\n");
        //Outer loop 5 lines print . loop  will run 5 times
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+"\t");// n it will print 5 
            }
            System.out.println("\n\t");
        }
      
    }

    public static void main(String[] args) {
        Number(5);
        
    }
    
}


// output:
//          INVERTED & ROTATED HALF-PYRAMID with Numbers


// 1       2       3       4       5

// 1       2       3       4

// 1       2       3

// 1       2

// 1