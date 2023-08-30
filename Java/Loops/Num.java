import java.util.*;


public class Num {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int counter = 1;
    System.out.println("\n\t Enter the value :");
    int range=input.nextInt();    
    while(counter <= range){
        System.out.print(counter+"\t ");
        counter++;
    }
    System.out.println("\n\n\t printend 1 to "+range+"  numbers...........! ");
    }
}

// output:
//          Enter the value :
// 9
// 1        2       3       4       5       6       7       8       9       

//          printend 1 to 9  numbers...........!

