import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("\n\t Marks \n");
        Scanner i = new Scanner(System.in);
        System.out.println("\n\t Marks obtained for Physicss : ");
        int marks[] = new int[100];
        marks[0] = i.nextInt();
        System.out.println("\n\t Marks obtained for Chem : ");
        marks[1] = i.nextInt();
        System.out.println("\n\t Marks obtained for Maths : ");
        marks[2] = i.nextInt();
        System.out.println("\n\t Marks obtained for computers : ");
        marks[3] = i.nextInt();
        System.out.println("\n\t Phy       :"+marks[0]);
        System.out.println("\n\t Chem      :"+marks[1]);
        System.out.println("\n\t Math      :"+marks[2]);
        System.out.println("\n\t computers :"+marks[3]);
    }
}

// output:

//          Marks


//          Marks obtained for Physicss :
// 70

//          Marks obtained for Chem :
// 69

//          Marks obtained for Maths :
// 73

//          Marks obtained for computers :
// 72

//          Phy       :70

//          Chem      :69

//          Math      :73

//          computers :72




// The End..............