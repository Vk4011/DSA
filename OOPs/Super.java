public class Super {
    public static void main(String[] args) {
        System.out.println("\n\t Super keyword \n");
        Horse h = new Horse();
        System.out.println("\n\t"+h.color);
    }
    
}

class Animal {
    String color;
    Animal(){
        System.out.println("\n\t Animal Constructor is called \n");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "brown";
        System.out.println("\n\t Horse constructor is called \n");
    }
}


            out put:
            
         Super keyword


         Animal Constructor is called


         Horse constructor is called


        brown