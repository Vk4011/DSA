public class V {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.print("\n\t ");
        printValues(a, b);
        System.out.printf("\n\t a value :%d and b value : %d ",a,b);
    }

    public static void printValues(int a, int b) {
        String output = String.format(" a : %d ,b : %d", a, b);
        System.out.println(output);
    }
}
    //   a : 5 ,b : 4

    //  a value :5 and b value : 4

    