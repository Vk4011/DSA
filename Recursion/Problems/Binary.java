public class Binary {
    public static void main(String[] args) {
        System.out.println("\n\t Binary String problem \n");
        System.out.println("\n\t Print all binary strings of size N without consecutive ones \n");
        System.out.println("\n\t Print the binary String pairs \n");
        pbs(3, 0,new StringBuilder());


    }
    public static void pbs(int n,int lp,StringBuilder str) {
       
        //Base case 

        if(n==0){
            System.out.println("\t "+str );
            return;
        }

        //f
        pbs(n-1,0,str.append("0"));
        if(lp==0){
            pbs(n-1,1,str.append("1"));

        }

        
    }
    
}

        //          Binary String problem


        //  Print all binary strings of size N without consecutive ones


        //  Print the binary String pairs

        //  000
        //  0001
        //  000110
        //  000110100
        //  0001101001