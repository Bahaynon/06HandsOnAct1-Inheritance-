package angel;
import java.util.*;
	
	public class CollegeList {
	public static void main(String[] args) {
		Scanner scs =  new Scanner(System.in);
		System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
		String str = scs.nextLine();
		Person ps = new Person();
		Employee psa = new Employee();
		Student sdt = new Student();
		Faculty fcl = new Faculty();
		
		if(str.equalsIgnoreCase("E")) {
			System.out.println("Type Employee's Name, Contact Number, Salary, and Department.");
			System.out.println("Press Enter after every input. ");
			String name = scs.nextLine();
			ps.setName(name);
			String num = scs.nextLine();
			ps.setContactNum(num);
			double sal = scs.nextDouble();
			psa.setSalary(sal);
			String reg = scs.next();
			psa.setDepartment(reg);
			
			System.out.println("------------------------------------------------------------ ");
			System.out.println("Name: "+ ps.getName());
			System.out.println("Contact Number: "+ ps.getContactNum());
			System.out.println("Salary: "+ psa.getSalary());
			System.out.println("Department: "+ psa.getDepartment());
			
		}
		else if(str.equalsIgnoreCase("F")) {
			System.out.println("Type Faculty's Name, Contact Number, Salary, Department, and Status.");
			System.out.println("Press Enter after every input. ");
			String name = scs.nextLine();
			ps.setName(name);
			String num = scs.nextLine();
			ps.setContactNum(num);
			double sal = scs.nextDouble();
			psa.setSalary(sal);
			String reg = scs.next();
			psa.setDepartment(reg);
			System.out.print("Press Y if the faculty is regular/tenured or N if not: ");
			String ss = scs.next();
			
			if(ss.equalsIgnoreCase("Y") == fcl.isRegular() ) {
				System.out.println("------------------------------------------------------------ ");
				System.out.println("Name: "+ ps.getName());
				System.out.println("Contact Number: "+ ps.getContactNum());
				System.out.println("Salary: "+ psa.getSalary());
				System.out.println("Department: "+ psa.getDepartment());
				System.out.println("Status: "+ "Regular");
			}
			else if(ss.equalsIgnoreCase("N") == fcl.isRegular() ) {
				System.out.println("------------------------------------------------------------ ");
				System.out.println("Name: "+ ps.getName());
				System.out.println("Contact Number: "+ ps.getContactNum());
				System.out.println("Salary: "+ psa.getSalary());
				System.out.println("Department: "+ psa.getDepartment());
				System.out.println("Status: "+ "Not Regular");
			}
			
			else {
				System.out.print("Please select between Y and N!");
			}
		
		}
		else if(str.equalsIgnoreCase("S")) {
			System.out.println("Type Student's Name, Contact Number, Program and Year Level.");
			System.out.println("Press Enter after every input. ");
			String name = scs.nextLine();
			ps.setName(name);
			String num = scs.nextLine();
			ps.setContactNum(num);
			String pro = scs.nextLine();
			sdt.setProgram(pro);
			String yr = scs.next();
			sdt.setYearLevel(yr);
			System.out.println("------------------------------------------------------------ ");
			System.out.println("Name: "+ ps.getName());
			System.out.println("Contact Number: "+ ps.getContactNum());
			System.out.println("Program: "+ sdt.getProgram());
			System.out.println("Year Level: "+ sdt.getYearLevel());
		}
		else {
			System.out.println("Invalid Input (Please choose between E, F, or S)");
		}
		
	}

}
