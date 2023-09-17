public class Static {
    public static void main(String[] args) {
        System.out.println("\n\t Static \n");
        Student s1 = new Student();
        s1.schoolName = "JMV";
        Student s2 = new Student();
        System.out.println("\n\t "+s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "chirstos";
        System.out.println("\n\t "+s3.schoolName);   
        System.out.println("\n\t "+s1.schoolName);     

    }
    
}

class Student{
    String name;
    int roll;
    static String schoolName;
        void SetName (String name){
            this.name = name;
        }
        String getName(){
            return this.name;
        }
}


                output:

                     Static


         JMV

         chirstos

         chirstos