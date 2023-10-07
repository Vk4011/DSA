import java.lang.reflect.Array;
import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse String \n");
        char a[] = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("\n\t String : "+Arrays.toString(a));
        Rev(a);
    }

    public static void Rev(char a[]) {

        int s = 0;
        int e = a.length - 1;
        // for(char i=0;i<a.length;i++){
        // for(int j=i;j<e;j--){
        // char temp=a[i];
        // a[i]=a[j];
        // a[j]=temp;
        // }
        // }
        while (s < e) {
            char temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;

        }
        System.out.println("\n\t Reverse String : "+Arrays.toString(a));
    }

}
                    output:


                     Reverse String


         String : [h, e, l, l, o]

         Reverse String : [o, l, l, e, h]






