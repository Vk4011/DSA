public class LeftShif {

    public static void main(String[] args) {
        System.out.println("\n\t Left Shift \n");
        int num = 5; // Binary: 0101
        
        // Left shift 'num' by 2 positions
        int result = num << 2;
        
        System.out.println("\n\tOriginal number: " + num);
        System.out.println("\n\tResult of num << 2: " + result);
        System.out.println("\n\t Formula : a<<b = a*2(b)\n\t=> 5*2powerb\n\t=> 5*4\n\t=> 20 //");
    }
}

                        output:

                        Left Shift


                        Original number: 5

                        Result of num << 2: 20

                        Formula : a<<b = a*2(b)
                        => 5*2powerb
                        => 5*4
                        => 20 //