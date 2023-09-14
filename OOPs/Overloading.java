public class Overloading {
    public static void main(String[] args) {
        System.out.println("\n\t Method Overloading \n");
        Cal c=new Cal();
        System.out.println("\n\t Sum of two integers :"+c.sum(5,8));
        System.out.println("\n\t Sum of two floating :"+c.sum((float)1.5,(float)2.8));
        System.out.println("\n\t Sum of 3   integers :"+c.sum(5,8,9));
    }
}

class Cal{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}