public class Largest {
    private static void find(int arr[]){
        System.out.println("\n\t Finding largest elment in array \n");
        int l=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }

        }
        System.out.println("\n\t Largest is : "+l);
    }
    public static void main(String[] args) {
        System.out.println("\n\t Largest Element in an array \n");
        int a[]={3,2,1,5,2};
        printArray(a);
        find(a);

    }
    public static void printArray(int arr[]){
        System.out.print("\n\t Array is : [ ");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(" "+arr[i]);
       }
        System.out.print(" ]\n");
        
    }
    
}

        output:

         Largest Element in an array


         Array is : [  3 2 1 5 2 ]

         Finding largest elment in array


         Largest is : 5







         