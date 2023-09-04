public class Largest {
    public static void main(String[] args) {
        System.out.println("\n\tLexicographic  largest string \n");
        String fruits[] = {"apple","mango","banana"};
        
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
        }
    }
        System.out.println("\n\t Largest string : "+largest);
    
    }
    
}
                    output :


         Lexicographic  largest string


         Largest string : mango




         //