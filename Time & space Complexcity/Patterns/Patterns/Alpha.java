public class Alpha {
    public static void tri(int n){
        System.out.println("\n\t Aplahabet Traingle \n");
        for(int i=1;i<=n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print("\t "+ch);
            }
            System.out.print("\n");
        }
    }
}

class Inv extends Alpha{
   public static void cha(int n) {
    for (int i = 0; i < n; i++) {
        char startChar = (char) ('E' - i);
        for (char ch = 'E'; ch >= startChar; ch--) {
            System.out.print(ch + "\t");
        }
        System.out.println();
    }
}

}