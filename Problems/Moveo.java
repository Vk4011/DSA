import java.lang.reflect.Array;
import java.util.Arrays;

public class Moveo {
    public static void main(String[] args) {
        System.out.println("\n\t Move zeros in array \n");
        int arr[] = {3,0,1,0,20,4,0,7};
        System.out.println("\n\t Array arr[] : "+Arrays.toString(arr));
        movezeros(arr);
        System.out.println("\n\t move zeros \n");
        System.out.println("\n\t Array : "+Arrays.toString(arr));

    }
    public static void movezeros(int a[]){
        int c=0;//current index
        for(int i=0; i<a.length;i++){
            if(a[i]!= 0){
                a[c++]=a[i];
            }
        }
        System.out.println("\n\t Cureent value : "+c);
        System.out.println("\n\t current array value a[c] : "+Arrays.toString(a));
        for(int j=c;j<a.length;j++){
                a[j]=0;
        }
    }
}

                    output:

                     Move zeros in array


         Array arr[] : [3, 0, 1, 0, 20, 4, 0, 7]

         Cureent value : 5

         current array value a[c] : [3, 1, 20, 4, 7, 4, 0, 7]

         move zeros


         Array : [3, 1, 20, 4, 7, 0, 0, 0]





         