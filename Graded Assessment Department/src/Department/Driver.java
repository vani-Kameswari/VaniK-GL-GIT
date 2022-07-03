package Department;

public class Driver {

	public static void main(String[] args) {
		
//creating super class object 		
		SuperDepartment department;
		
//instantiating Admin department and calling methods 
		department = new AdminDepartment();
		System.out.println("Welcome to " + department.departmentName());
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(department.isTodayAHoliday());
		

//instantiating HR department , calling methods 
		department = new HrDepartment();
		System.out.println(" ");
		System.out.println("Welcome to " + department.departmentName());		
		System.out.println(((HrDepartment)department).doActivity()); //type casting
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(department.isTodayAHoliday());

//instantiating Tech department , calling methods 
		department = new TechDepartment();
		System.out.println(" ");
		System.out.println("Welcome to " + department.departmentName());
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		System.out.println(((TechDepartment)department).getTechStackInformation());
		System.out.println(department.isTodayAHoliday());
		
	}

}
