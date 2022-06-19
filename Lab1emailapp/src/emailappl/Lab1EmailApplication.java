package emailappl;

import java.util.*;


class InputManager {
	
	int getInput()
	{
		
	System.out.println ("1.Technical");
	System.out.println ("2.Admin");
	System.out.println ("3.Human Resource");
	System.out.println ("4.Legal");
	System.out.println ("Enter department (1/2/3/4):");
	
	    Scanner in = new Scanner(System.in);
		int input = in.nextInt();	
		//System.out.println ("your desired option is" + input);	
		return input;
		
	}
	
	
}



public class Lab1EmailApplication {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee1 emp= new Employee1 ("Vani","Kameswari");
			
			InputManager imr = new InputManager();
			int input= imr.getInput();
			
			CredentialService credservice = new CredentialService();
			credservice.generateEmailAddress(emp, input);
			credservice.generatePassword(emp);
			credservice.showCredentials(emp);
						
			
	}

}
