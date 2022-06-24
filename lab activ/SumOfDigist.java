10. Write a Java program and compute the sum of the digits of an integer.
code :
package Anita;
/**
 * 
 * @author anita navik 
 *
 */

public class SumOfDigist {



public static void main(String[] args) {
	 SumOfDigist();

}

private static void SumOfDigist() {
	int n =255;//initializing the number
	int rem=0;//declaring variable for storing remainder value 
	int sum=0;//declaring variable for storing sum of digit
	System.out.println("Number is " +n);
	
	
	///while loop for terminating the iteration
	while(n > 0) {
		//below Calculation for sum of digit

		rem= n % 10;
        
	    sum =sum+rem;
	    n=n/10;
	
	}
	//		//printing Statement

	System.out.println("sum of digist"+sum);
}
	
}