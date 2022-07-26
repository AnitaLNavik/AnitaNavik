package Anita;
/**
 * 
 * @author Anita Navik
 *
 */

public class TaxCalculater {
	float basicSalary;
	boolean citizenship;
	public static void main(String[] args) {
		
		TaxCalculater tc =new TaxCalculater();
		
		tc.basicSalary=30000;
		tc.calculateTax();
			
	} 
	public void calculateTax() {
		
		float tax=30*basicSalary/100;
		
		System.out.println("the tax of employee for the basic Salary= "+basicSalary+" is "+tax);
	}

}
