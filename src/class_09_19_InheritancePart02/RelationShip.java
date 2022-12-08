package class_09_19_InheritancePart02;

public class RelationShip {
	
	public static void main(String[] args) {
		
		fastFood meal = new fastFood(); 
		Food meal2 = new fastFood(); // we can use Food class to create fastFood object 
		
		// Relationship between Food and fastFood is one way one direction
		meal.foodType= "Beef"; 
		meal.printFood();
		meal.foodName= "Burger"; 
		meal.printName();
		
		meal2.foodType = "Chicken"; 
		meal2.printFood();
		
		
		IndianFood indFood = new IndianFood();
		
		indFood.printRecipe();
		
		
	}

}

class Food {
	public String foodType; 
	public void printFood() {
		System.out.println(foodType);
	}
	
}

class fastFood extends Food{
	public String foodName; 
	public void printName() {
		System.out.println(foodName);
	}
	
}

class IndianFood extends Food{
	public String spices; 
	public void printRecipe() {
		System.out.println("Indian food are very famous ");
	}
}