package Anita;
/**
 * 
 * @author Anita Navik
 *
 */
class Area {
	int length;
	int breadth;

	public void calculateAreaofrectangle() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area of Rectangle: " + length * breadth);

	}
}



public class AreaOfRectangle {
	public static void main(String[] args) {

		Area rectangle = new Area();

		rectangle.length = 90;
		rectangle.breadth = 120;

		rectangle.calculateAreaofrectangle();

	}

}
	
	
	
	
	
	
	
	

