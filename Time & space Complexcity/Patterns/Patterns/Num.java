public class Num {
    public static void  tri(int n){
        System.out.println("\n\t Printing  1 0 triangle \n");
        for(int i=0;i<n;i++){
            int start =0;
            if(i%2==0){
                start=start+1;
                System.out.print(start);
            }
            else{
                System.out.print(start);
            }
            for(int j=0;j<i;j++){
                System.out.print("\t ");
            }
            // start = 1-start;
            System.out.println("\n");
        }
      
}
  public static void numr(int n){
    int no=1;
    System.out.println("\n\t Number triangle \n\n");
    for(int i=0;i<n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("\t"+no);
            no=no+1;
        }
        System.out.println("\n");
    }

    }
    
}
