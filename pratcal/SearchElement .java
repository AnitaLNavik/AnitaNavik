package Anita;
/**
 * 
 * @Anita Navik
 */

import java.util.Scanner; 

public class SearchElement {
	public static void main(String[] args) {
		int n,x,flag=0,i=0;
		Scanner s= new Scanner(System.in);// classname =new objectname(Argument);
		System.out.println("Enter number of element you want in array:");// taking array element 
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all element:");// user has to enter the element
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			}
		System.out.println("Enter number of element you want search:");
		x=s.nextInt();
		for(i=0; i<n;i++) 
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
				
			}
		}
		if(flag==1)
		{
			System.out.println("Element found at position:"+(i+1));
		}
		else
		{
			System.out.println("Element not found ");
		}
		
		
	}

}
