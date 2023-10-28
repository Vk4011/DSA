public class Occurence {
    public static void main(String[] args) {
        System.out.println("\n\t WAF to find the first Occurence of an Element in Array \n");
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.print("\n\t Array : [ ");
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.print(" ]\n");
        System.out.println("\n\t First occurence : "+firstOccurence(arr, 5, 0));
    }
    public static int firstOccurence(int arr[],int key,int i){
        //Base Case
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);

    }
}

        //     output:

        //      WAF to find the first Occurence of an Element in Array


        //  Array : [ 8 3 6 9 5 10 2 5 3  ]

        //  First occurence : 4





 