package Department;

public class SuperDepartment {
    public String departmentName; 
    public String todaysWork;
    public String workDeadline;
    public String todayAHoliday;
    
	public SuperDepartment() {
		
		departmentName = "Super Department";
		todaysWork = "No Work as of now";
		workDeadline = "Nil";
		todayAHoliday = "Today is not a holiday"; 
			
	}

	
	public String departmentName() {

		return departmentName;
		
	}
	
	
	public String getTodaysWork() {
		
			return todaysWork;
	}
	
	
	public String getWorkDeadline() {
		
		return workDeadline;
	}
	
	public String isTodayAHoliday() {
		
		return todayAHoliday;
	}
	
	
}




