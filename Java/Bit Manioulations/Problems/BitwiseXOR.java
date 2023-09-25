public class BitwiseXOR {
    public static void main(String[] args) {
        System.out.println("\n\t Xor operator \n");
        int num1 = 10;   // Binary: 1010
        int num2 = 7;    // Binary: 0111

        int result = num1 ^ num2;  // Bitwise XOR operation

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("Result of num1 ^ num2: " + result);
    }
}

            // 0 ^ 0 =0  0^1=1 same bits = 0 different bits = 1 
            // 1010 ^ 0111 = 1101 ==> (1101)10=1*8+1*4+0*2+1*1 = 13 

                output:

                    Xor operator

                    num1: 10
                    num2: 7
                    Result of num1 ^ num2: 13