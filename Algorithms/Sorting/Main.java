import java.util.Scanner;
public class Main {

    static {
        System.out.print("\n\t Bubble Sort \n");
    }
    void printArray(int a[]){
        System.out.print("\n\t array : [ ");
        for(int i = 0; i < a.length-1; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("]\n");
    }
    static public void main(String arguments[]){
    Scanner sc = new Scanner(System.in); 
    System.out.print("\n\t Enter the size of the array n : ");
    int n=sc.nextInt();
    System.out.print("\n\t Enter the Array Elements \n");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.printf("\n\t Element a [%d] : ",i);
        arr[i]=sc.nextInt();
    }   
    Main obj=new Main();
    obj.printArray(arr);
    BubbleSort b=new BubbleSort();
    b.sort(arr);
    obj.printArray(arr);

    }

}
