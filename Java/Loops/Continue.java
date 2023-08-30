public class Continue {
    public static void main(String[] args) {
        System.out.println("\n\t Skip vlaue 3 in iteration ");
        for (int i =0 ;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println("\n\t  "+i);
          
        }
          System.out.println("\n\t continuos statement");
    }
    
}

// output:
//    Skip vlaue 3 in iteration

//           0

//           1

//           2

//           4

//           5

//          continuos statement