package class_08_22_Class_Objects;

public class Class_HandsOn {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.make = "Mercedes Benz";
		myCar.model = "C300";
		myCar.color = "Dark Blue";
		myCar.year = "2015";
		myCar.Breaks();
		System.out.println("---------------");
		myCar.drive();
		System.out.println("---------------");
		String carInfo = myCar.carInfo();
		System.out.println(carInfo);
		System.out.println("---------------");
		int carYear = myCar.carYear(); 
		System.out.println("Year of Manufacture: " + carYear);
		System.out.println("---------------");
		 int price = myCar.carPrice(); 
		 System.out.println("Price is: $" + price);
		 System.out.println("---------------");
		 myCar.carTax(3000);
		 System.out.println("---------------");
		 myCar.printTotalPrice(25000, 0.06);
		 System.out.println("---------------");
		 myCar.printTotalPrice(10000, 0.04);
//		
//		System.out.println("Make :" + MB.make);
//		System.out.println("Model :" + MB.model);
//		System.out.println("Color :" + MB.year);
//		System.out.println("Color :" + MB.color);
//		MB.model = "Ford"; 
//		System.out.println("After modification :" + MB.model);
//		
	}

}
