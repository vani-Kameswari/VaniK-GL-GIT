package Department;


public class TechDepartment extends SuperDepartment{
	
	public TechDepartment() {
		departmentName = "Tech Department ";
		todaysWork = "Complete coding of Module 1";
		workDeadline = "Complete by EOD";
		todayAHoliday = "Today is not a holiday"; 
	}
	
	
	public String getTechStackInformation() {
		//System.out.println();
		String str2 = "Core Java";
		return str2;
	}
	
	
}
