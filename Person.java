package angel;

class Person{
	private String name;
	private String contactNum;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setContactNum(String c) {
		contactNum = c;
	}
	public String getContactNum() {
		return contactNum;
	}
}

class Employee extends Person{
	private double salary;
	private String department;
	
	public void setSalary(double s) {
		salary = s;
		
	}
	public double getSalary(){
		return salary;
	}
	public void setDepartment(String d) {
		department = d;
	}
	public String getDepartment(){
		return department;
	}
}

class Student extends Person{
	private String program;
	private int yearLevel;
	
	public void setProgram(String p) {
		program = p;
	}
	public String getProgram() {
		return program;
	}
	public void setYearLevel(String y) {
		yearLevel = Integer.parseInt(y);
	}
	public int getYearLevel() {
		return yearLevel;
	}
}

class Faculty extends Employee{
	private boolean status;
	
	public boolean isRegular(){
		status = true;
		return status;
	}
}