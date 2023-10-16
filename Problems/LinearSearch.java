public class LinearSearch{
    public static void main(String[] args) {
        System.out.println("\n\t Linear search \n");
        int arr[]={6,7,8,9,4,1};
        Arrays(arr);
        int n=arr.length;
        int num=8;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.print("\n\t index value of num is :  "+i);
            }
            // }else{
            //     System.out.println("\n\t Dosen't exixt -1 \n");
            // }
        }
    }
    private static void Arrays(int arr[]){
          System.out.print("\n\t array indexing  : [ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
        }
         System.out.print("]\n");
        System.out.print("\n\t array is arr[]  : [ ");
        for(int e: arr){
            System.out.print(e+" ");
        }
           System.out.print("]\n");
    }
}
                    output:
                    Linear search


         array indexing  : [ 0 1 2 3 4 5 ]

         array is arr[]  : [ 6 7 8 9 4 1 ]

         index value of num is :  2






         