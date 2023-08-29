import java.util.*;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t Enter Radius :");
        float  radius = input.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("\n\t Area of circle : "+area);

   }
    
}
