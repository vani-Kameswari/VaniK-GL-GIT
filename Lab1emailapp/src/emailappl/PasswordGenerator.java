package emailappl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;



public class PasswordGenerator {

	public char[] capalph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public char[] lowalph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public int[] numints = {1,2,3,4,5,6,7,8,9,0};
	public char[] splchar = {'!','@','#','$','%','^','&','*'};
	
	public String generatePassword() {
		String pwd;
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		sb.append(capalph[random.nextInt(26)]); 
		sb.append(numints[random.nextInt(10)]);
		sb.append(splchar[random.nextInt(8)]);
		
		for (int i=0; i<4; i++){		
			sb.append(lowalph[random.nextInt(26)]);
		}
		
		pwd = sb.toString();
		
		java.util.List<String> charlist=Arrays.asList(pwd.split(""));
		Collections.shuffle(charlist);
		
	    pwd=String.join("",charlist);
		
	return pwd; 
	
	}
	
	public PasswordGenerator() {
		// TODO Auto-generated constructor stub
	}

}
