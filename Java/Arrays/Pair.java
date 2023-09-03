public class Pair {
    public static void  main(String[] args) {
        int arr[] ={2,4,6,8,10};
        System.out.println("\n\t Pairs in an Array \n\n");
        System.out.print("\t[");
        for(int element:arr){
            System.out.print("\t"+element);

        }
        System.out.print("]\n\n");
        System.out.println("\n\n The Pairs ");
     
        for(int i=0;i<arr.length;i++){
            int counter=arr[i];//2,4,6,8,10
            for(int j=i+1;j<arr.length;j++){
                System.out.print("\t[ "+arr+" ]");
            }
            System.out.println("\n\n");
        }

    }
    
}
//             output

//             Pairs in an Array


//         [       2       4       6       8       10]



//  The Pairs
//         [ [I@5f5a92bb ] [ [I@5f5a92bb ] [ [I@5f5a92bb ] [ [I@5f5a92bb ]


//         [ [I@5f5a92bb ] [ [I@5f5a92bb ] [ [I@5f5a92bb ]


//         [ [I@5f5a92bb ] [ [I@5f5a92bb ]


//         [ [I@5f5a92bb ]



// Garbage values 