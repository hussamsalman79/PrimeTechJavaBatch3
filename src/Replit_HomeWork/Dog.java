package Replit_HomeWork;

public class Dog {

	String breed;
	String age;
	String size;
	String color;

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return this.breed;

	}
	public void setAge (String age) {
		this.age = age; 
	}
	public String getAge() {
		return this.age; 
	}
	public void setSize(String size) {
		this.size= size; 
	}
	public String getSize() {
		return this.size; 
	}
	public void setColor(String color) {
		this.color=color; 
	}
	public String getColor() {
		return this.color; 
	}
	
	public void printDogInfo() {
		
		System.out.println("Breed: " + this.breed + ", Age: " + this.age + ", Size: " + this.size + ", Color: " + this.color);
	}
	
	

}
