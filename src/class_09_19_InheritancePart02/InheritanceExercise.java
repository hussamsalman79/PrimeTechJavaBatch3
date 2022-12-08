package class_09_19_InheritancePart02;

public class InheritanceExercise {
	
	public static void main(String[] args) {
		
		employee emp1 =new programmer(); 
		
		emp1.salary(13, 77);
		
		
	}

}

abstract class employee{
	
	abstract void salary(int RatePerHour, int  BiWeeklyHoursrs); 
	abstract void bonus(); 
	abstract void workingHours(int BiWeeklyHours); 
	
}

class programmer extends employee {
	
	
	
	int PayCheck; 
	
	void salary(int RatePerHour, int BiWeeklyHours){
		
		PayCheck = RatePerHour * BiWeeklyHours;
		
		System.out.println("Total Pay Check bi-weekly: $"  + PayCheck);
	}
	
	void bonus () {
		
		double monthlyBonus = PayCheck * 0.1; 

		System.out.println("Bonus is : "  + monthlyBonus);
	}
	
	void workingHours(int BiWeeklyHours) {
		System.out.println("Hours per Week: " +  BiWeeklyHours);
	}
	
}