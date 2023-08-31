public class Return {
    public static void main(String[] args) {
        String message = greet();
        System.out.println("\n\t"+message+"\n");
        
    }
    static String greet(){
        // return 23; you want to return a string 
        String greeting = "How are you";
        return greeting;
    }
}
