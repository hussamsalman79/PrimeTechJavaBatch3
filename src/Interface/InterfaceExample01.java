package Interface;

public class InterfaceExample01 {
	
	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle(); 
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);
		
		System.out.println("Bicycle present state: ");
		bicycle.printStates();
		
		System.out.println("-----------------------------");
		
		Bike bike = new Bike(); 
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);
		
		System.out.println("Bike present state: ");
		bike.printStates();
			
	}

}
	interface Vehicle{
	
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}

	class Bike implements  Vehicle{
		int speed; 
		int gear;

		public void changeGear(int newGear) {
			gear = newGear;
		}

		public void speedUp(int increment) {
			speed = speed + increment;
			
		}

		public void applyBrakes(int decrement) {
			speed = speed - decrement;
		}
		public void printStates() {
			System.out.println("speed: " + speed + " gear: " + gear);
		}
		
	}
	
	class Bicycle implements Vehicle{

		int speed; 
		int gear;

		public void changeGear(int newGear) {
			gear = newGear;
		}

		public void speedUp(int increment) {
			speed = speed + increment;
		}
		
		public void applyBrakes(int decrement) {
			speed = speed - decrement;
		}
		public void printStates() {
			System.out.println("speed: " + speed + " gear: " + gear);
		}
		
		
	}