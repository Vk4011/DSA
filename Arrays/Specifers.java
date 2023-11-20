public class Specifers {
    public static void printArr(int arr[]) {
        System.out.print("\n\t  Array : [ ");
        for(int e:arr){
            System.out.printf("%s",e+" ");
        }
        System.out.print("]\n"); //IllegalFormatConversionException
        
    }
    public static void main(String[] args) {
        System.out.printf("\n\t Format specifiers \n");
        String name = "John";
        int age = 25;
        double height = 1.75;
        
        System.out.printf("\n\t Name: %s, Age: %d, Height: %.2f meters%n", name, age, height);
        
        int arr[]={1,2,3,4,5};
        System.out.print("\n\t Original ");
        printArr(arr);
        rev(arr);
        System.out.print("\n\t Reverse ");
        printArr(arr);


    }
    public static void rev(int[] arr) {
        int start =0 ;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }

}


        // Format specifiers

        //  Name: John, Age: 25, Height: 1.75 meters


        // Original
        //   Array : [ 1 2 3 4 5 ]

        //  Reverse
        //   Array : [ 5 4 3 2 1 ]

