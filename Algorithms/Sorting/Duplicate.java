import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int a[] = {1,3,4,2,2};
        System.out.println("\n\t Array : "+Arrays.toString(a));
        Arrays.sort(a);              
        System.out.println("\n\t Sorted array : "+Arrays.toString(a));
        dups(a);

    }
    public static void dups(int a[]){
        System.out.print("\n\t Duplicate in your array : ");
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                    System.out.print(a[i]);
           }
        }
    }
}
