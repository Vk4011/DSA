public class Oops{
    public static void main(String args[]){
        System.out.println("\n\t Oops  \n");
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println("\n\t "+p1.getColor());

    }
}

class Pen{
     String color;
     int tip;
    String getColor(){
        return this.color;

    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = new color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}