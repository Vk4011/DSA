import java.util.Random;

public class Recursivesort{
    public static void printArray(int arr[]) {
        System.out.print("\n\t The array : [");
        for(int i=0;i<arr.length;i++){
            System.out.print("\t "+arr[i]);
        }
        System.out.print(" ] \n");
        
    }
    public static void main(String[] args) {
        System.out.println("\n\t Quick sort \n");
        Random rand = new Random();
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
        }
        System.out.println("\n\t Before quick sort : ");
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


         Before quick sort :

         The array : [   96      95      86      55      29      83      95      53      11      36 ] 

         After quick sort :

         The array : [   11      29      36      53      55      83      86      95      95      96 ]

                    
         Quick sort


         Before quick sort :

         The array : [   10      91      49      42      51      29      17      2       25      2 ] 

         After quick sort :

         The array : [   2       2       10      17      25      29      42      49      51      91 ]



         

