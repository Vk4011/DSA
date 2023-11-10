public class QuickSort {

    public static void printArr(int arr[]){
        System.out.print("\n\t Array is arr[] : [ ");    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" ]");
    }
    public static void main(String[] args) {
        System.out.println("\n\t Quick sort ");
        System.out.println("\n\t Step 1 : pivot \n");
        System.out.println("\n\t Step 2 : partition \n");
        System.out.println("\n\t Step 3 : Quicksort(left/right) \n");
        int arr[]= {6,3,9,8,2,5};
        printArr(arr);
        quicksort(arr, 0,arr.length-1);
        printArr(arr);
    }

    public static void quicksort(int arr[], int si,int ei){

        //base case 
        if(si>=ei){
            return;
        }

        //last elent pivot
        int pIdx = partition( arr, si, ei);
        quicksort(arr, si,pIdx-1);//left
        quicksort(arr, pIdx+1,ei);//right
    }
    public static int partition(int arr[] , int si, int ei){
        int pivot = arr[ei];
        int i=si-1;// to make place for els smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
         arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

}


        //           Quick sort

        //  Step 1 : pivot


        //  Step 2 : partition


        //  Step 3 : Quicksort(left/right)


        //  Array is arr[] : [ 6 3 9 8 2 5  ]
        //  Array is arr[] : [ 2 3 5 6 8 9  ]



        