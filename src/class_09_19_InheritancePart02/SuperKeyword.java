//package class_09_19_InheritancePart02;
//
//public class SuperKeyword {
//	public static void main(String[] args) {
////		
////		child myChild = new child("Hello I am child");
////		myChild.printInfo();
////		myChild.appendText();
//		
//		Sub mySub = new Sub(2323); 
//		
//		
//	}
//}
//
//class Super{
//	public Super(int num) {
//		System.out.println(num);
//	}
//	
//}
//
//
//class Sub extends Super{
//	public Sub(int num) {
//		super(num);
//	}
//}
//
//
//
//
//
//class Parent {
//	String text;
//	public Parent(String text) {
//		this.text = text; 
//		
//	}
//}
//
//class child extends Parent{
//	public child(String text) {
//		super(text);// will pass to parent class constructor
//	}
//	public void printInfo() {
//		System.out.println(text);
//	}
//	public void appendText() {
//		System.out.println(text + " LOL ");
//	}
//}
//
//class child2 extends Parent{
//	public child2(String text) {
//		super(text);
//	}
//	public void printInfo() {
//		System.out.println(text);
//	}
//}
//
//class car{
//	//Parent Class:
//	public car() {
//		
//		System.out.println("Parent class constructor is called");
//	}
//	public void printCarInfo() {
//		System.out.println("Printing Car info!!");
//	}
//	
//}
//
//class BMW extends car{
//	// child class:
//	public BMW() {
//		super();
//		System.out.println("BMW constructor is called ");
//		
//	}
//	public void printCarInfo() {
//		System.out.println("Printing BMW info!!");
//	}
//	
//	public void callParentMethod() {
//		super.printCarInfo();// will call the parent method
//		printCarInfo();// will call the child method
//		
//
//	}
//
//}
