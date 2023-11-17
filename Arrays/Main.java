public class Main {
    public static void main(String[] args) {
    System.out.println("\n\t Arrays \n"); 
    int size=5;
    int marks[];
    marks=new int[size];
    System.out.print("\n\t array : [");
    for(int i=0;i<size;i++){
        System.out.print(marks[i]+" ");
    }       
    System.out.print("]\n");
    marks[0]=6;
    marks[1]=2;
    marks[2]=5;
    marks[3]=9;
    marks[4]=20;
    System.out.print("\n\t array : [");
    for(int i=0;i<size;i++){
        System.out.print(marks[i]+" ");
    }       
    System.out.print("]\n");
   

    }    
}

        //      Arrays


        //  array : [0 0 0 0 0 ]

        //  array : [6 2 5 9 20 ]


        