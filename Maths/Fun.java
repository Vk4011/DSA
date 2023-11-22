

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fun
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        double X = 53.56;
        double Y = 3;
        int A = 45;
        int B = 20;

        // Output the absolute value of the difference of A and B
        System.out.println(Math.abs(A - B));

        // Output the remainder when A is divided by B
        System.out.println(A % B);

        // Computing the rounded number upwards to its nearest integer and printing it
        System.out.println(Math.ceil(X));

        // Computing the rounded number downwards to its nearest integer and printing it
        System.out.println(Math.floor(X));

        // Computing the value of X to the power of Y and printing it
        System.out.println(Math.pow(X, Y));
	}
}



// 25
// 5
// 54.0
// 53.0
// 153646.15801600003



