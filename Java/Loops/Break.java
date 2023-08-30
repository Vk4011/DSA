public class Break{
    public static void main(String[] args) {
        System.out.println("\n\t Exit loop for certain number");
        for(int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n\t i am out of the loop ...!");
    }
}
// output:
//          Exit loop for certain number
// 1
// 2

//          i am out of the loop ...!


