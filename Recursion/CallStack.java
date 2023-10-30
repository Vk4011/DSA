public class CallStack {
    public static void main(StringReverse[] args) {
        System.out.println("\n\t Call Stack \n");
        int n=1;
        iterations(n);
    }
    public static void iterations(int n){
        if(n==10){
            System.out.print("\t"+n);
            return;
        }
        System.out.print("\t"+n+" ");
        iterations(n+1);

    }
    
}
                
        //  Call Stack

        // 1       2       3       4       5       6       7       8       9       10


        