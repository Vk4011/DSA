


public class charAt {
    public static void main(String[] args) {
        System.out.println("\n\t Character of index \n");
        String string = "Vikram ram";
        System.out.println("\n\t String is : "+string+"\n\n");
        index_Values(string);
        
        System.out.println("\n\t0 based  index value : "+string.charAt(0));
           
        System.out.println("\n\t Length  of String : "+string.length());
        
        System.out.println("\n\tcharacter at 10 index : "+string.charAt(9));
        System.out.println("\n\n\tstring ");

    }
    public static void index_Values(String str){
        for(int i=0;i<str.length();i++){
            System.out.print("\t "+str.charAt(i));
        }
        System.out.println("\n ");
    }


}

        //     output 

        //     Character of index


        //  String is : Vikram ram


        //  V       i       k       r       a       m               r       a       m


        // 0 based  index value : V

        //  Length  of String : 10

        // character at 10 index : m


        // string

