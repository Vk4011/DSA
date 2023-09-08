public class Multilevel {
    public static void main(String[] args) {
        System.out.println("\n\t Multi level inheritance ");
        Pet p=new Pet();
        p.name = "German shape red";
        p.a();
        p.play();
        p.e();
    }
}

class Anim{
    String name;
    public void e(){
        System.out.println("\n\t "+name+" is eating chicken ");
    }
    public void a(){
        System.out.println("\n\t "+name+" is running... ");
    }
}
class Pet extends Anim{

    public void play(){
        System.out.println("\n\t"+name+" is playing with tom ");
    }


}