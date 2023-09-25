public class Sub {

    public static void main(String[] args) {
        System.out.println("\n\t Difference of two numbers \n");
        int num1 = 10;
        int num2 = 4;
        System.out.println("\n\t num1 : "+num1+"\n\t num2 : "+num2);

        int result = subtract(num1, num2);

        System.out.println("\n\tResult of " + num1 + " - " + num2 + " is: " + result);
    }

    public static int subtract(int a, int b) {
        while (b != 0) {
            // Borrow contains common set bits of a and unset bits of b
            int borrow = (~a) & b;

            // Subtraction of bits of a and b where at least one of the bits is not set
            a = a ^ b;

            // Borrow is shifted by one so that subtracting it from a gives the required difference
            b = borrow << 1;
        }

        return a;
    }
}
                output:

                 Difference of two numbers 


                num1 : 10
                num2 : 4

                Result of 10 - 4 is: 6