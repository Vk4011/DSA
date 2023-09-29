
public class Conversion {
    public static void main(String[] args) {
        System.out.println("\n\t Binary to Decimal Conversion \n");
        decToBin(4);
    }
    private static void decToBin(int n){
        int pow=0;
        int myNum=n;
        int binNum=0;
        while(n>0){
            int rem=n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("\n\t Binary form of "+myNum+" = "+binNum);
    }
}


            output:

               Binary to Decimal Conversion 


               Binary form of 4 = 100