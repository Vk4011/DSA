import java.util.Arrays;
import java.util.Scanner;

public class BasicSorting {
    
    private static void buble(int arr[]){
        int l=arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    private static void printArray(int arr[]){
        System.out.print("\n\t sorted array : [ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
        System.out.print(" ] \n"); 
    }
    
    public static void main(String[] args) {
        System.out.println("\n\t sorting \n");
        System.out.println("\n\t Enter the array size \n");
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();    
        int a[]=new int[s];
        System.out.println("\n\t Enter array elements  ");
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("\n\t Array is  a[] : "+Arrays.toString(a));


        buble(a);
        printArray(a);
        System.out.println("\n\t Selction sort \n");
        Slectionsort(a, s);
        System.out.println("\n\t Insertion sort  \n");
        insertion_sort(a);
         printArray(a);
    }
    private static void Slectionsort(int arr[] ,int n){
            for(int i=0;i<n-1;i++){
                int mini=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[mini]){
                        mini=i;
                    }
                }
                swaping(arr[i], arr[mini]);
            }
            printArray(arr);
    }
    private static void swaping(int a,int b){
        // System.out.println("\n\t Swaping \n");
        int temp=a;
        a=b;
        b=temp;
    }
    private static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }


}


                    output :

                        sorting


                    Enter the array size

            5   

                    Enter array elements
            5
            1
            6
            2
            4

         Array is  a[] : [5, 1, 6, 2, 4]

         sorted array : [  1  2  4  5  6  ]




                        output-2:

                        sorting


         Enter the array size

12

         Enter array elements
9
3
6
5
1
8
4
7
2
10
16
12

         Array is  a[] : [9, 3, 6, 5, 1, 8, 4, 7, 2, 10, 16, 12]

         sorted array : [  1  2  3  4  5  6  7  8  9  10  12  16  ] 

         Selction sort


         sorted array : [  1  2  3  4  5  6  7  8  9  10  12  16  ] 




                    output:

                     sorting


         Enter the array size

5

         Enter array elements
6
1
4
2
8

         Array is  a[] : [6, 1, 4, 2, 8]

         sorted array : [  1  2  4  6  8  ] 

         Selction sort


         sorted array : [  1  2  4  6  8  ]

         Insertion sort


         sorted array : [  1  2  4  6  8  ]





         













         

