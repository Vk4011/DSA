
public class MissingNo {
    public static void print(int arr[]) {
        System.out.print("\n\t Arrays : [ ");
        for(int e:arr){
            System.out.print("\t"+e);
        }
        System.out.print(" ]");
        
    }
public static void main(String[] args) {
    System.out.println("\n\t Finding missing num in array \n");
    int arr[] = {1,2,3,5};
    print(arr);
    
    int n=arr.length;
    System.out.println("\n\t missing : "+n);
    int es=n*(n+1)/2;
    // System.out.println("\n\t Expected sum : "+es); 
    //  miss(arr);
    
}
private static void miss(int a[]) {
    
   
    int as=0;
    for(int v: a){
        as+=v;
    }
    System.out.println("\n\t Actual sum : "+as);
    // System.out.println("\n\t Missing num in array is : "+(es-as));
}

}
                        output:


                          Finding missing num in array


         Arrays : [     1       2       3       5 ]
         missing : 4





         