package class_08_30_Constructor;

public class Main_House {
	public static void main(String[] args) {
		
		
		House H1 = new House (4, "Ashburn"); 
		
		H1.setType("Single House");
		H1.setValue(600000);
		
		H1.printIfo();
		
		House H2 = new House (3,"Sterling"); 
		H2.setType("Town Home");
		H2.setValue(500000);
		
		System.out.println("---------------");
		
		H2.printIfo();
		
		
		
	}

}
