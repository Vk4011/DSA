package Encapsulation;

public class Encapsulation {
      public static void main(String[] args) {
       B b = new B("ruksana", "chandu");
        System.out.println("\n\t parent name: "+b.getParName());
        System.out.println("\n\t child name: "+b.getChildName());
      
      b.setParentName("namratha");
      b.setchildName("srinandan");
      
      System.out.println("\n\t parent name: "+b.getParName());
      System.out.println("\n\t child name: "+b.getChildName());

      G g = new G("nagraju", "charan");
       System.out.println("\n\t parent name: "+g.getParName());
        System.out.println("\n\t child name: "+g.getGName());
      
       g.setParentName("balaji");
      g.setGName("hari");
      
      System.out.println("\n\t parent name: "+g.getParName());
      System.out.println("\n\t child name: "+g.getGName());
      
    }
}
class Parent{
    private int property;
    private String parentName;
  
    Parent(String parentName){
      this.parentName = parentName;
    }
    
    public void displayParInfo(){
      System.out.println("Parent name is : "+parentName);
    }  

    public String getParName(){
      return parentName;
    }
    public void setParentName(String n){
      this.parentName = n;
    }
}
class B extends Parent{
    private String childName;
    B(String childName, String parentName){
      super(parentName);
      this.childName = childName;
    }
    public void childParInfo(){
      System.out.println("child name is : "+childName);
    } 
     public String getChildName(){
      return childName;
    }
    public void setchildName(String childName){
      this.childName = childName;
    }
}
class G extends Parent{
    private String GName;
    G(String childName, String parentName){
      super(parentName);
      this.GName = childName;
    }
    public void childParInfo(){
      System.out.println("Gchild name is : "+GName);
    } 
    public String getGName(){
      return GName;
    }
    public void setGName(String n){
      this.GName = n;
    }
}
