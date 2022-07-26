package Anita;


/**
 * 
 * @author Anita Navik
 *
 */


abstract class EPlan {
	double units;
  public abstract void getUnits();
  public void calculateBill(int rate) {
  System.out.println(rate*units);
}
}
class House extends EPlan{
	public void getUnits()
	{
		units = 100;
	}
}
class Business extends EPlan{
	public void getUnits()
	{
		units=500;
	}
}


public class EPLN {
		public static void main(String args[]) {
			House h=new House();
	        h.getUnits();
	        h.calculateBill(3);
		}
}

