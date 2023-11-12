public class BackTracking {
    public static void printArr(int[] a) {
        System.out.print("\n\t array : [ ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print(" ]");
        
    }
    public static void main(String[] args) {
        System.out.println("\n\t Backtracking Arrays \n");
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
    public static void changeArr(int[] arr,int i, int val) {
        //base Case 
        if(i == arr.length){
            printArr(arr);
            return;
        }


        //recursion 
        arr[i] =val;
        changeArr(arr,i+1,val+1); // fnx call step
        arr[i] = arr[i]-2; //backtracking step


    }
    
}



        //           Backtracking Arrays


        //  array : [ 1 2 3 4 5  ]
        //  array : [ -1 0 1 2 3  ]

        