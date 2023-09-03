public class Pairs {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        System.out.println("\n\t Pairs in an Array \n\n");
        System.out.print("\t[");
        for (int element : arr) {
            System.out.print("\t" + element);
        }
        System.out.print("]\n\n");
        System.out.println("\n\n\t The Pairs \n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("\t[ " + arr[i] + ", " + arr[j] + " ]");
            }
            System.out.println("\n\n");
        }
    }
}

        //     output

        //      Pairs in an Array


        // [       2       4       6       8       10]



        //  The Pairs

        // [ , 4 ] [ , 6 ] [ , 8 ] [ , 10 ]


        // [ , 6 ] [ , 8 ] [ , 10 ]


        // [ , 8 ] [ , 10 ]


        // [ , 10 ]

//  //     Pairs in an Array


        // [       2       4       6       8       10]



        //  The Pairs

        // [ 2, 4 ]        [ 2, 6 ]        [ 2, 8 ]        [ 2, 10 ]


        // [ 4, 6 ]        [ 4, 8 ]        [ 4, 10 ]


        // [ 6, 8 ]        [ 6, 10 ]


        // [ 8, 10 ]          




///    The end 