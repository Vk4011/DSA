import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Matrix ");
        int Matrix[][] = new int[3][3];
        int n=Matrix.length,m=Matrix[0].length;
        System.out.println("\n\t Enter the values : \n");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n\t Output :");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print( Matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        search(Matrix, 5);


    }

    public static boolean search(int martix[][],int key){
         for(int i =0;i<martix.length;i++){
            for(int j=0;j<martix[0].length;j++){
                if(martix[i][j] == key ){
                    System.out.println("\n\t found at cell ("+i+","+j+")");
                    return true;
                }

            }
            System.out.println("\n");
        }
        System.out.println("\n\t Key not found");
        return false;
        
    }
}
                     Matrix

         Enter the values :

1
2
3
4
5
6
7
8
9

         Output :
1 2 3

4 5 6

7 8 9




         found at cell (1,1)




         