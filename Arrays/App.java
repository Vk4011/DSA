import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("\n\t Enter the size of the array : ");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("\n\t Enter the elment of the array : ");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\n\t array : "+Arrays.toString(arr));
        int l=arr.length;
        System.out.println("\n\t Lenght of the array is : "+l);
        parr(arr);


    }
    static void parr(int a[]){
        System.out.print("\n\t arr[] : [ ");
        for(int i=0;i<a.length;i++){
            System.out.print(i+" ");
        }
        System.out.print("]\n");

    }
    
}

    //   array : [6, 7, 8, 3, 4]
    //      Lenght of the array is : 5

    //      arr[] : [ 0 1 2 3 4 ]