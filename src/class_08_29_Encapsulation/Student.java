package class_08_29_Encapsulation;

public class Student {
	
	private long ssn; 
	private String name; 
	
	 
	public void setSSN(long ssn) {
		//converting integer ssn into String ssn
		String ssnStr = String.valueOf(ssn);
		
		if(ssnStr.length() == 9) {
			this.ssn = ssn;
		}else {
			System.out.println("Invalid SSN");
		}
	}
	
	public long getSSN() {
		return ssn;
	}
	
	public void setName(String name) {
		if(name.length()<=50 && name.length()>2) {
			this.name = name;
		}else {
			System.out.println("Invalid name");
		}
	}
	
	public String getName() {
		return name;

		
	}
	

}
