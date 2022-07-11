package PayMoney;

import java.util.*;


public class DailyTransactions {

	public void DailyTransactionscalc() {
		
		Scanner input = new Scanner(System.in);
			
		System.out.println ("Enter the size of transaction array");
		int numtrans = input.nextInt();
		
		ArrayList<Integer> transarray = new ArrayList<Integer>(numtrans);
		
		System.out.println ("Enter the values of array");		
		for (int i=0; i<numtrans; i++)
		{
			int numtemp = input.nextInt();
			transarray.add(numtemp);
			
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numtarget = input.nextInt();
		
		for (int k=0; k<numtarget; k++) {
		System.out.println("Enter the value of target");
		int numtargetvalue = input.nextInt();
		
		int transtotal = 0;
		int j;
		for (j=0; j<numtrans; j++)
		{
			transtotal = transtotal+transarray.get(j);
			
			if (transtotal >= numtargetvalue)
				{
				j++;
				System.out.println("Target achieved after " + j + " transactions" );
				break ;
				}
			
		}
		
		if ( transtotal < numtargetvalue)
			System.out.println("Given target is not achieved");

		
		}
		input.close();
		
	}

	
}
