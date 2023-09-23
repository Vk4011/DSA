public class GetOperation{
    public static void main(String[] args) {
        System.out.println("\n\t Get ith bit \n");
        System.out.println("\n\t bit value  : "+getIthBit(10,2));
    }
    public static int getIthBit(int n,int i){
        int bitmask = 1 << i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
}
                output :

                    Get ith bit 


                    bit value  : 0