public class Ternary {
    public static void main(String[] args) {
    
        String type=(5%2==0)? "even" : "odd"; 
        System.out.println("\n\t  The number : "+type); 

        int larger = (5>3)? 5:3;
        System.out.println("\n\t Larger value :"+larger);

        int marks=77;
        String status = marks>= 35? "Pass":"Fail";
        System.out.println(status);
    }
    
}

// output :
//           The number : odd

//          Larger value :5
// Pass