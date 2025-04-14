// Bubble sort is a simple sorting algorithm that arranges a list of elements
//  in ascending or descending order by repeatedly comparing 
//  adjacent elements and swapping them if they are in the wrong order. 
//  This process continues until no more swaps are needed, indicating that the list is sorted. 
//  The algorithm is named "bubble sort" because larger
// elements "bubble" to the end of the list with each pass, while smaller elements move towards the beginning.



public class BubbleSort {
    public static void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
}

//                         Array  [2,1,5,3,4]
//                                 0 1 2 3 4
//                         a[j] > a [j+1]  = swap()
 
//                         j=0  to j < 5-1-0  => = 0 to 4 

//                         0 < 4 means 0,1,2,3 = 4 iterations where  first turn is i=0;
                       
//  inner loop 1st iteration j=0

//         a[0] > a[0+1] = 2 > 1; 
//          [1,2,5,3,4]

//  inner loop 2nd iteration j=1
//         array : [1,2,5,3,4];
// a[1] > a[1+1] =  a[1] > a[2] 
//               =  2 >  5  = condition check fail then no swap()
              
//               no modified array : [1,2,5,3,4]

//  inner loop 3rd iteration j=2

//         [1,2,5,3,4]

//         a[2] > a[2+1] = 5 > 3 condition is sucess then swap();

//                         [1,2,3,5,4];

// inner loop 4th iteration j=3

//                     [1,2,3,5,4]

//                     a[j] > a[j+1] = a[3] > a[3+1]

//                             a[3] > a[4]  =>  5 > 4 

//                             condition sucess then swap()

//                             new array = [1,2,3,4,5];



//                                 O ( n(n-1)/2) = O (n*n)



//                                 Second turn i=1;

//                                 then j = 0 ; j < 5 - 1 -1; j++

//                                 0 to 3

//                                 a[0],a[1]   <  3 = a[2] iterations

//             first iteration j=0

//                    [1,2,3,4,5]; => a[0] > a[1] = 1 > 2 no swap failed 

//             second iteration j=1
//                    [1,2,3,4,5]; => a[1] > a[1+1] = 2 > 3 no swap failed 


//                    Turn i=2 => j = 0 < n-1-i
//                    j=0 < 5 - 1 -2 

//                    0 to 2;     [1,2,3,4,5];

//                    then  1(a[0]) < 2(a[1])

//                    if(a[0]>a[0+1]){
//                     => check failed no swap()
//                    }

//             Turn 3 i = 3 
//             then j=0;j<n-1-i => 0 to 5-1-3 => 0 to 1

//             a[0] = 1 the condition is sucees loop is stoped 






