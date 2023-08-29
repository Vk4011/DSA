public class Elseif {
    public static void main(String[] args) {
        int a=2,b=4,c=6;
        if((a>b)&&(a>c)){
            System.out.println("\n\t Largest value : "+a);
        }else if(b>=c){
            System.out.println("\n\t Largest Value :"+b);
        }
        else{
            System.out.println("\n\t largest value : "+c);
        }
    }
}

// output:
//      largest value : 6

