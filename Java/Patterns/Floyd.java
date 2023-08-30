public class Floyd {
    
    public static void Floyds_triangle(int n){
        System.out.println("\n\t Print FLOYD'S Triangle \n");
        int counter = 1;
        //Outer loop
        for(int i=1;i<=n;i++){
            //ineer loop how many times will counter be printed
            for(int j=1;j<=i;j++){
                System.out.print(counter+"\t");
                counter=counter+1;//counter++ 

            }
            System.out.println("\n\t");
        }

    }
    
    public static void main(String[] args) {
        Floyds_triangle(5);
    }
    
}


// output:
//  Print FLOYD'S Triangle

// 1

// 2       3

// 4       5       6

// 7       8       9       10

// 11      12      13      14      15



