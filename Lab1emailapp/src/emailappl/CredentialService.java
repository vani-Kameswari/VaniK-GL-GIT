package emailappl;

public class CredentialService {

	public CredentialService() {
		// TODO Auto-generated constructor stub
	}
	
		
public void generateEmailAddress(Employee1 e,int input) {
		
		String emailpart1;	
		emailpart1 = e.firstname+"."+e.lastname;
	
	
		String emailaddress=" "; 
		
		switch(input) {
		case 1:
			emailaddress = emailpart1+"@Technical.abc.com";break;
		case 2:
			emailaddress = emailpart1+"@Admin.abc.com";break;
		case 3:
			emailaddress = emailpart1+"@Humanresource.abc.com";break;
		case 4:
			emailaddress = emailpart1+"@Legal.abc.com";break;
		default:
			System.err.println("Invalid string, inut only 1/2/3/4");
			System.exit(0);
		}
		
		e.emailID = emailaddress;
}	

public void generatePassword(Employee1 e) {
	
		PasswordGenerator pwdgen = new PasswordGenerator();
		e.password = pwdgen.generatePassword();
		
	}


public void showCredentials(Employee1 e) {

	if (e.emailID != null) {
		System.out.println ("Employee emailID:"+e.emailID);
	}
	if (e.password != null) {
		System.out.println ("Employee password is:" +e.password);
	}
}


}
