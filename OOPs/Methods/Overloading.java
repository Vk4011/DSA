public class Overloading extends Methods{
    public void learn(int n){
        n=n+1;
        System.out.println("\n\t CodeAndShine  Ben "+n+"\n");
        
        
    }
    public void learn(int arr[]){
        
        System.out.print("\n\t Array : [ ");
        for(int e : arr){
            e=e+2;
            System.out.print(" "+(e)+" ");
        }
        System.out.print(" ]");
        System.out.println("\n\t CodeYourOwnPath \n");
    }

    public void code(){
        System.out.println("\n\t CodeYourLegacy");
    }
}