import java.util.Arrays;
import java.util.Scanner;

public class BasicSorting {
    
    private static void buble(int arr[]){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    private static void printArray(int arr[]){
        System.out.print("\n\t sorted array : [ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.print(" ] \n"); 
    }
    
    public static void main(String[] args) {
        System.out.println("\n\t sorting \n");
        System.out.println("\n\t Enter the array size \n");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();    
        int a[]=new int[s];
        System.out.println("\n\t Enter array elements  ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("\n\t Array is  a[] : "+Arrays.toString(a));


        buble(a);
        printArray(a);
    }
}


                    output :

                        sorting


                    Enter the array size

            5   

                    Enter array elements
            5
            1
            6
            2
            4

         Array is  a[] : [5, 1, 6, 2, 4]

         sorted array : [  1  2  4  5  6  ]






         