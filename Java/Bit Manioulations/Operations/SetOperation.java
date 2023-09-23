import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        System.out.println("\n\t Set Operation \n");
        System.out.println("\n\t Set ith bit value : "+SetIthBit(10,2));
    }
    public static int SetIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;

    }
    
}
                output : 

                
         Set Operation 


         Set ith bit value : 14