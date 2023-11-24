public class Convert {
    public static void main(String[] args) {
        System.out.println("\n\t Case Converter \n");
        System.out.println("\n\t The string : VikrAM \n\t After con(s) : "+con("VikrAM"));
        System.out.println("\n\t The string : VIKRam \n\t After con(s) : "+con("VIKRam"));
        System.out.println("\n\t The string : VIkram \n\t After con(s) : "+con("VIkram"));
    }
    public static String con(String s) {
        int l=0;
        int u=0;
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                l++;
            }else if(Character.isUpperCase(ch)){
                u++;
            }
        }
        if(l>u){
            return s.toLowerCase();
        }
        else    if(u>l){
            return s.toUpperCase();
        }else{
            return s;
        }
    
        
    }
}

    // Case Converter


    //      The string : VikrAM
    //      After con(s) : VikrAM

    //      The string : VIKRam
    //      After con(s) : VIKRAM

    //      The string : VIkram
    //      After con(s) : vikram




    