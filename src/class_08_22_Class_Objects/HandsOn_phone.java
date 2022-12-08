package class_08_22_Class_Objects;

public class HandsOn_phone {

	public static void main(String[] args) {
		
		Phone myPhone = new Phone(); 
		
		myPhone.brand = "Iphone"; 
		myPhone.color = "Blue"; 
		myPhone.model = "13"; 
		System.out.println("---------- Iphone--------");
		System.out.println("Cellphone Brand :" + myPhone.brand);
		System.out.println("Cellphone Color :" + myPhone.color);
		System.out.println("Cellphone Model :" + myPhone.model);
		
		
		Phone myPhone2 = new Phone(); 
		myPhone.brand = "Samsung"; 
		myPhone.color = "Black"; 
		myPhone.model = "S21"; 
		System.out.println("---------- SAMSUNG--------");
		System.out.println("2nd Cellphone Brand :" + myPhone.brand);
		System.out.println("2nd Cellphone Color :" + myPhone.color);
		System.out.println("2nd Cellphone Model :" + myPhone.model);
		
		myPhone.musicPhone();
		myPhone.socialPhone();
		myPhone.streamPhone();
		
	}

}
