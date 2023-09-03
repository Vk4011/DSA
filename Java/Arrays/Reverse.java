import java.util.Scanner;

public class Reverse{
    
    
    public static void revs(int num[]){
        int first=0,last=(num.length)-1;
        while(first < last){
            int temp = num[last];
             num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }

    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Reverse array \n");
        System.out.println("\n\t Enter size of array : ");       
        int s=sc.nextInt() ;
        System.out.println("The array size : "+s);
        int arr[]= new int[s];
     
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n\n\tThe Elements in array \n");
           System.out.print("\tarr[]  =  [");
           
        for(int  element: arr){
            System.out.print("\t"+element);
            

        } 
        System.out.print("\t]\n\n");
        
        revs(arr);
        System.out.println("\n\t The Reversed array \n");
        System.out.print("\t arr[] = [");
        for(int element :arr){
            System.out.print("\t"+element);
        }
        System.out.print("\t]\n\n");
        System.out.println("\n\n\t Hence we sucessfully reversed an array .....");
    }
}


//         output:

//                  Reverse array 


//          Enter size of array : 
// 5
// The array size : 5
// 5
// 4
// 3
// 2 
// 1


//         The Elements in array

//         arr[]  =  [     5       4       3       2       1       ]


//          The Reversed array

//          arr[] = [      1       2       3       4       5       ]



//          Hence we sucessfully reversed an array .....




//