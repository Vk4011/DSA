public class Character {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        //outer loop
        System.out.println("\n\t print Character pattern ..\n");
        for(int line=1;line<=n;line++){
            //inner loop
            for(int chars=1;chars<=line;chars++){
                System.out.print("\t"+ch);
                ch++;
            }
            System.out.println("\n");
        }
    }
}
// output:
//      print Character pattern ..

//         A

//         B       C

//         D       E       F

//         G       H       I       J


