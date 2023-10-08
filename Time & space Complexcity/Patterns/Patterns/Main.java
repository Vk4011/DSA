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





