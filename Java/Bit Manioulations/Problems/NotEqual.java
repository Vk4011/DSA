public class NotEqual {
    
    public static void main(String[] args) {
        System.out.println("\n\t Not equal != \n");
        int b = 5; // You can set any initial value for b
        
        while (b != 0) {
            // Inside this loop, you can perform any desired operations.
            // For example, you can print a message.
            System.out.println("\n\t b is not zero. Current value: " + b);
            
            // You can also modify the value of b during each iteration.
            // For simplicity, we decrement it here.
            b--;
        }
        
        // When the loop exits (b becomes 0), you can do any post-loop operations.
        System.out.println("\n\t b is now equal to zero b: "+b);
    }
}
                
         Not equal != 


         b is not zero. Current value: 5

         b is not zero. Current value: 4

         b is not zero. Current value: 3

         b is not zero. Current value: 2

         b is not zero. Current value: 1

         b is now equal to zero b: 0