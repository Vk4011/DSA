public class Perfect {
    static{
        System.out.println("\n\t Perfect number \n");
    }
    public static void main(String[] args) {
        int n = 28;
        System.out.println(isPerfect(n)); 
    }

    public static int isPerfect(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.println("\n\t true");
            }
            else{
                System.out.println("\n\t false");
            }
        }

        return sum;
    }
}



