package CurrencyDenominations;

import java.util.*;


public class DenominationsCalculation {
	
	public void calculateDenom(ArrayList<Integer> denomlist) {
		
		ArrayList<Integer> denominationlist = denomlist; 
				
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter the amount you want to pay");
		int currentamount = input.nextInt();
				
		int numofnotes = 0;		
		TreeMap<Integer,Integer> currencyresult=new TreeMap<Integer,Integer>();
			
		for (int i=0; i<denominationlist.size(); i++)
		{
			if (currentamount == 0 ) break;
			
			else if (currentamount >= denominationlist.get(i))
			{	
				numofnotes = currentamount / denominationlist.get(i);
				currencyresult.put(denominationlist.get(i), numofnotes);
				int tempamount = currentamount % denominationlist.get(i);
				currentamount = tempamount;
			}
		
		} 
		
		NavigableMap<Integer, Integer> resultorder = currencyresult.descendingMap();
		for (NavigableMap.Entry<Integer, Integer> entry : resultorder.entrySet()) {
		        System.out.println(entry.getKey() + ":" + entry.getValue());
		    }
		
		if (currentamount != 0)
			System.out.println ("Sorry! Can't make exact payment");
		
			
		input.close();
		
	}

}
