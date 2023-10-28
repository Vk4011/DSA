import java.util.*; 
  
// Main class 
class Basic{ 
  
    // Main driver method 
    public static void main(String args[]) 
    { 
        System.out.println("\n\t Map in java \n");
        // Creating an empty HashMap 
        Map<String, Integer> hm 
            = new HashMap<String, Integer>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put("a", new Integer(100)); 
        hm.put("b", new Integer(200)); 
        hm.put("c", new Integer(300)); 
        hm.put("d", new Integer(400)); 
  
        // Traversing through Map using for-each loop 
        for (Map.Entry<String, Integer> me : 
             hm.entrySet()) { 
  
            // Printing keys 
            System.out.print("\t "+me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
    } 
}

        //     Map in java

        //  a:100
        //  b:200
        //  c:300
        //  d:400



        