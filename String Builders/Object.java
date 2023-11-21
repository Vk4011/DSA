public class Object {
    public static void main(String[] args) {
        System.out.println("\n\t Strings objects are cannot be changed \n");
        String a="Vikram";
        System.out.println("\n\t String a pool  : "+a);
        a="Ram";
        System.out.println("\n\t Another object : "+a);
        System.out.println("\n\t String pool & imutability we canot modify the string objects \n");
        String s1 = "vikram";
        String s2 = "vikram";
        comparision(s1,s2);
        System.out.println("\n\t index value of the s1 : "+s1.charAt(4));
    }
    public static void comparision(String a,String b) {
        System.out.println("\n\t Strings are equal :  "+(a==b));
        System.out.println("\n\t "+a.equals(b));
        String s=new String("vikram");
        System.out.println("\n\t Strings are : "+(a==s));
        System.out.println("\n\t "+s.equals(b));
        
    }
    
}
