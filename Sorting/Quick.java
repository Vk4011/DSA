
public class Quick{
    public static void printArray(int arr[]) {
        System.out.print("\n\t The array : [");
        for(int elements : arr){
            System.out.print("\t "+elements);
        }
        System.out.print(" ] \n");
        
    }
    public static void main(String[] args) {
        System.out.println("\n\t Quick sort \n");
        int arr[] = {1,8,3,9,4,5,7};
        System.out.println("\n\t Befor quick sort : ");
        printArray(arr);
       
        quicksort(arr, 0, arr.length-1);

       
        System.out.println("\n\t After quick sort : ");
        printArray(arr);
        
    }
    private static void swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
               
    }
    public static void quicksort(int [] array,int lowIndex,int hightIndex){
        if(lowIndex >= hightIndex){
            return ;
        }
        int pivot = array[hightIndex];
        int leftPointer = lowIndex;
        int rightPointer = hightIndex;
        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while(array[rightPointer]>=pivot&&leftPointer <rightPointer){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, hightIndex);
    quicksort(array, lowIndex,leftPointer-1);
    quicksort(array, leftPointer+1, hightIndex);
    }
    
}


                output:

                Quick sort


         Befor quick sort :

         The array : [   1       8       3       9       4       5       7 ] 

         After quick sort :

         The array : [   1       3       4       5       7       8       9 ]




         