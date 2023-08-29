public class Type {
    public static void main(String[] args) {
        // float a=3.15;   
        // int b=a; error
        float a=23.14f;
        int b = (int)a;
        System.out.println("\n\t "+b);
        double x=123.12345678;
        int y =(int)x;
        System.out.println(y);

    }    
}


// output:
// IT always removes decimal value
