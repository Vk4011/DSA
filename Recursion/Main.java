//Recursion is used in advance ds trees,graphs,DP 
//Iterations ,Function 

// What is Recursion ?
// Recursion is a method of solving a computational problem where the solution depends on solutions to
// smaller instances of the same problem
// similar 
// Base case final case

// Using Math

// f(x)=x^2
// f(f(x))=(x^2)^2
// // x=2
// f(x)=4=2^2
// f(f(x))=f(4)=4^2 =16

// calling 
//Factorial
// f(n) = n * f(n-1);
// n!=n*(n-1)*(n-2)....1
// 5!=5*4*3*2*1
// 4!=4*3*2*1
//0!=1

// f(n) = n*f(n-1)

//         (n-1)*f(n-2)

//                 (n-2)*f(n-3)


//                         1*f(0)





// Top to Down towards base case


// step 1 : Base Case
// Step 2 : fun
// step 3 : inner fun call

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t Print numbers from n to 1 (Decreasing Order) \n");
        for(int i=10;i>=1;i--){
            System.out.print(" "+i+" ");
        }
    }
}

//        Print numbers from n to 1 (Decreasing Order) 

//  10  9  8  7  6  5  4  3  2  1 


