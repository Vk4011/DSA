import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t PAtterns \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int n=scanner.nextInt();
        Triangle t = new Triangle();
        t.triangle(n);
        Reverse p=new Reverse();
       Inverse i=new Inverse();
        p.rev(n);
        p.equ(n);
        i.inverse(n);
        i.sss(n);
        i.SsS(n);
        Num v=new Num();
        v.tri(n);
       v.numr(n);
       Alpha a=new Alpha();
       a.tri(n);

    }
}

//                     output :

//                      PAtterns


//          Enter a num :
// 4

//          Triangle star pattern



//  *

//  *  *

//  *  *  *


//          Reverse triangle pattern

//           *

//        *  * 

//     *  *  *

//  *  *  *  *


//          Equalateral triangle pattern

//           *

//        *     *

//     *     *     *    

//  *     *     *     *


//  Inverse Triangle

//          *       *       *       *       *       *

//          *       *       *       *       *

//          *       *       *       *

//          *       *       *

//          *       *

//          *


       
        //  Space Star Space

        //                         *        



        //                 *       *       *


        //         *       *       *       *       *

        // *       *       *       *       *       *       *




            
        //  Number triangle




        // 1

        // 2       3

        // 4       5       6

        // 7       8       9       10



        //     Aplahabet Traingle

        //  A       B
        //  A       B       C
        //  A       B       C       D
        //  A       B       C       D       E
        //  A       B       C       D       E       F
        //  A       B       C       D       E       F       G
        //  A       B       C       D       E       F       G       H





        