public class Generate {
    public static void main(String[] args) {
        System.out.println("\n\t Generator \n");
        int min = 1000; // Minimum value for the OTP
        int max = 9999; // Maximum value for the OTP

        int otp = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("\n\t Generated OTP: " + otp);
    }
}
                output:

                Generator


                 Generated OTP: 7041