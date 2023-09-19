public class Bits{
    
    private static void And(){
        System.out.println("\n\t Binary And 5&6 : ");
        System.out.print("\n\t 100 :  "+(5&6)+"\n\t");//5=101 6=110 100=4
    }
    protected static void Or(){
        System.out.println("\n\t Binary Or  5|6 : ");
        System.out.println("\n\t 111 :  "+(5|6)+"\n\t");

    }
    public static void main(String[] args) {
        System.out.println("\n\t Bitwise operators (&|~) ");
        
        And();
        Or();
        Not();
        Xor();

    }
    static void Xor(){
        System.out.println("\n\t Binary Xor \n");
        System.out.println("\n\t 011 : "+(5^6)+"\n");
    }
    public static void Not(){
        System.out.println("\n\t Binary ~  (One's Complement +1 )= 2's complement =  ~5 \n");
        System.out.println("\n\t 00000 110 is : "+(~5)+"\n");
        System.out.println("\n\t Magic MSB 1 is -ve value : -6");
        System.out.println("\n\t One's Complement 5 = 101 = 010 = 2 \n\n");
    }
}

            output :

             Bitwise operators (&|~)

         Binary And 5&6 :

         100 :  4

         Binary Or  5|6 :

         111 :  7


         Binary ~  (One's Complement +1 )= 2's complement =  ~5


         00000 110 is : -6


         Magic MSB 1 is -ve value : -6

         One's Complement 5 = 101 = 010 = 2



         Binary Xor


         011 : 3