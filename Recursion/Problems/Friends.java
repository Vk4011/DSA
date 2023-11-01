public class Friends{
    public static void main(String[] args) {
        System.out.println("\n\t Friends pairing \n");
        Friends o=new Friends();
        System.out.println("\n\t Total number of pairs : "+o.fp(3));

    }
    public  int fp(int n){
        if(n==1||n==2){
            return n;
        }
        // //choice
        // //single
        // int fnm1 = fp(n-1);

        // //pairs
        // int fnm2 = fp(n-2);
        // int pairways = (n-1)*fnm2;

        // //toways
        // int toways = fnm1+pairways;
        // return toways;
        return fp(n-1)+(n-1)*fp(n-2);
    }
}

        //                  Friends pairing 


        //  Total number of pairs : 4





