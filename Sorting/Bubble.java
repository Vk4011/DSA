import java.util.Arrays;

public class Bubble{
    public static void main(String[] args) {
        System.out.println("\n\t Bubble sort \n");
        int arr[] = {1,4,2,3,5};
        int a[]={5,4,3,2,1};
        System.out.println("\n\t Array 2 : "+Arrays.toString(a));
        System.out.println("\n\t Array : "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.print("\n\t after sorting : [");
        for(int n: arr){
            System.out.print(" "+n);
        }
        System.out.println(" ]");
        bubbleSort(a);
        System.out.println("\n\t After sorting : "+Arrays.toString(a));
    }
    public static void bubbleSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}

                                output

                                 Array 2 : [5, 4, 3, 2, 1]

                                Array : [1, 4, 2, 3, 5]

                                after sorting : [ 1 2 3 4 5 ]

                                After sorting : [1, 2, 3, 4, 5]



                                