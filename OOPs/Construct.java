
class Construct{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
   Construct(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Construct(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Construct s1 = new Construct(111,"Karan");  
    Construct s2 = new  Construct(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  