
interface cal{
    int op(int a,int b);
}


public class App {
    public static void main(String[] args) {
        cal s=(a,b)->a+b;
        System.out.println("\n\t Sum : "+s.op(5,4));

        cal d=(a,b)->b-a;
        System.out.println("\n\t Difference : "+d.op(8,9));
    }
}


//  Sum : 9

//          Difference : 1


