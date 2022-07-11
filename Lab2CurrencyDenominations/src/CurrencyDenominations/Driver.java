package CurrencyDenominations;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		DenominationsOrder denominationsorder = new DenominationsOrder();
		ArrayList<Integer> denominationssorted = denominationsorder.Sortdenominations();
		
		
		DenominationsCalculation denomcalculation = new DenominationsCalculation();
		denomcalculation.calculateDenom(denominationssorted);
		
	}

}
