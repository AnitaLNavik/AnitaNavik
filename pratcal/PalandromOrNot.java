
package ANITA;

import java.util.Scanner;

public class PalandromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = 121;
		int rem = 0;
		int sum = 0;
		int temp = s;
		while(s>0) {
			rem = s%10;
			sum = (sum * 10) + rem;
			s=s/10;
		}
		if(sum == temp) {
			System.out.println(sum + " it is palandrom");
		}
		else{
			System.out.println(sum +" not palandrom");
			}
		}

}


program 2 :


package ROHITRATHOD;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0 ,n2 = 1,n3 = 0;
		System.out.print(n1 + " " + n2);    
		for(int i  = 0 ; i <= 10 ; i++ ) {
			n3=n1+n2;    
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;    
			
		}
		

	}

}
