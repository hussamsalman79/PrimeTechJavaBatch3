package class_08_30_Constructor;

public class Main_Car {

	public static void main(String[] args) {
		
		Car car1 = new Car("FORD", "Escape", "Blue", 2021); 
		Car car2 = new Car("Mercedes Benz", "C300", "Dark Grey", 2015);
		Car car3 = new Car ("VolksWagen","Passat", "Black", 2012 );
		
		car1.pringCarInfo();
		System.out.println("-----------------");
		car2.pringCarInfo();
		System.out.println("-----------------");
		car3.pringCarInfo();

	}

}
