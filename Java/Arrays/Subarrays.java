import java.util.Scanner;

public class Subarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\t Print Subarray ");
        System.out.println("\n\t Enter array size ");
        int s=sc.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\t Arry : [");
        for(int element : arr){
            System.out.print("\t"+element);
        }
        System.out.print("\t]\n");
        System.out.println("\n\n\t  Sub arrays  \n");
        for( int i =0 ;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end=j;
            
            for(int k=start;k<=end;k++){
                System.out.print("\t"+arr[k]+" ");
            }
            System.out.println("\n");
        }
    }
    System.out.println("\n");

    }
    
}
//                         output:
//                        Print Subarray

//          Enter array size
// 5
// 2
// 6
// 1 
// 4
// 8
//          Arry : [       2       6       1       4       8       ]


//           Sub arrays

//         2

//         2       6

//         2       6       1

//         2       6       1       4

//         2       6       1       4       8

//         6

//         6       1

//         6       1       4

//         6       1       4       8 

//         1

//         1       4

//         1       4       8

//         4

//         4       8

//         8