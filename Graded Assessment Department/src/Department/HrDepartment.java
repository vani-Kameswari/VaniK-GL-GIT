package Department;


public class HrDepartment extends SuperDepartment{
	
	
	public HrDepartment() {
		
		departmentName = "HR Department";
		todaysWork = "Fill today’s worksheet and mark your attendance";
		workDeadline = "Complete by EOD";
		todayAHoliday = "Today is not a holiday"; 
	}
	
	
	public String doActivity() {
		
			return "team Lunch";
	}
	
	
}
