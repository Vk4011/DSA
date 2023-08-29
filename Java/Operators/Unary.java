public class Unary {
    public static void main(String[] args) {
        int a=4;
        int b = ++a;
        long p = 11;
        long q=p--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(p);
        System.out.println(q);
        double f=20.34;
        f=f+1;
        System.out.println(f);
        double d=29;
        d+=11;  
        System.out.println(d);
    }
    
}

// output:
// 5
// 5
// 10
// 11
// 21.34
// 40.0



