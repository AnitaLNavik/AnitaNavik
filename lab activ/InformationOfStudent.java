package Anita;
/**
 * 
 * @anita navik 
 */

class Students {
	int id;
    String name;
	String course;
	
	public void getDetails() {
		System.out.println("ID: " + id);
		System.out.println("The name is:  " + name);
		System.out.println("course: " + course);
	
	}
	public int getId() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getcourse() {
		return course;
	}
	
	

}

public class InformationOfStudent {
	public static void main(String[] args) {
		Students Anita= new Students();
		Students Sandhya= new Students();
		Students Divya= new Students();
		System.out.println("students Information");
		System.out.println();

		
		Anita.id = 01;
		Anita.name= "Anita Navik";
		Anita.course="Bsc. CS";
		
		Sandhya.id = 02;
        Sandhya.name= "Sandhya Gupta";
		Sandhya.course="Bsc. CS";
		
		Divya.id=03;
		Divya.name= "Divya Gupta";
		Divya.course="Bsc.CS";
		
		Anita.getDetails();
		System.out.println();
		Sandhya.getDetails();
		System.out.println();
		Divya.getDetails();
		System.out.println();
		
		

	}

}



