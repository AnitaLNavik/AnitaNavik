package Anita;
/**
 * 
 * @author Anita Navik
 *
 */

import java.util.Scanner;

public class SimpleAddition {
	
	public  static void main(String[] args)
	{
		// classname objectname= new classname(Arguments);
		Scanner Anita = new Scanner(System.in);
		//objectname.methodename();
		int num1, num2, res;
		System.out.println("Enter the number");
		num1=Anita.nextInt();
		System.out.println("Enter the num2");
		
	
		num2=Anita.nextInt();
		res=num1+num2;
		System.out.println("sum of two number is:"+res);

		Anita.close();

		
	}

}
