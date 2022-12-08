package Abstract;

	abstract class Sales{
		abstract void Employee(String name, String jobTitle, String area, int stores ); 
		
		abstract void printInfo1(); 
		abstract void printInfo2();
		abstract void printInfo3(); 
}
	 class D13Team extends Sales{
		 	String name; 
			String jobTitle; 
			int stores; 
			String area; 

		void Employee(String name, String jobTitle, String area, int stores) {
			this.name= name;
			this.jobTitle=jobTitle;
			this.area=area;
			this.stores=stores;
		}
		void printInfo1() {
				System.out.println("Rep 1 Name: " + name);
				System.out.println("Job Title: " + jobTitle);
				System.out.println("Area: " + area);
				System.out.println("Stroes covered: " + stores);
		}
		@Override
		void printInfo2() {
			System.out.println("Rep 2 Name: " + name);
			System.out.println("Job Title: " + jobTitle);
			System.out.println("Area: " + area);
			System.out.println("Stroes covered: " + stores);
			
		}
		@Override
		void printInfo3() {
			System.out.println("Rep 3 Name: " + name);
			System.out.println("Job Title: " + jobTitle);
			System.out.println("Area: " + area);
			System.out.println("Stroes covered: " + stores);
		}
	
	 }
public class Scotts_SalesTeam {
	public static void main(String[] args) {
		
		Sales sm1 = new D13Team(); 
		sm1.Employee("Sam Karmah", "Area Manager", "Gainsville VA", 11);
		sm1.printInfo1();
		System.out.println("-------------------------------");
		Sales sm2 = new D13Team(); 
		sm2.Employee("Dilan Kareem", "Area Manager", "Winchester VA", 17);
		sm2.printInfo2();
		System.out.println("-------------------------------");
		Sales sm3 = new D13Team(); 
		sm3.Employee("Nick Arthur", "Area Manager", "Washington DC", 8);
		sm3.printInfo3();
	}
	
	
}


