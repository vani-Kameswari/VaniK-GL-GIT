package CurrencyDenominations;

import java.util.*;


public class DenominationsOrder {

	public ArrayList<Integer> Sortdenominations() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter the size of currency denominations");
		int numdenom = input.nextInt();
		
		ArrayList<Integer> denominationsinput = new ArrayList<Integer>(numdenom);
		
		System.out.println ("Enter the currency denominations value");		
		for (int i=0; i<numdenom; i++)
		{
			int numtemp = input.nextInt();
			denominationsinput.add(numtemp);
			
		}
		
		Collections.sort(denominationsinput, Collections.reverseOrder());   
		
	//	System.out.println ("sorted denominations:" + denominationsinput);
		
		return(denominationsinput);
		
		
	
	}

	
}
