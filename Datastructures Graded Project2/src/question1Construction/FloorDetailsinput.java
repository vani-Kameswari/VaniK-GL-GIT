package question1Construction;

import java.util.*;

public class FloorDetailsinput {

	int numoffloors;
	int[] flsize; 
	Integer[] sflsize;
	int[] sflrsize;
	
	
	public void inputFloordetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the total no of floors in the building");
 		numoffloors = sc.nextInt(); 
			
		if (numoffloors > 0 ) {
			
			flsize = new int[numoffloors];
			for (int i=0; i< numoffloors ; i++) {
				 
				System.out.println("enter the floor size given on day :" + (i+1));
				int flrsize = sc.nextInt(); 
				
				for (int l=0; l<i; l++) {
					if (flsize[l] == flrsize ){
					System.out.println("floor size should be Distint size");
					System.exit(0);						
					}
				}
				if (flrsize > 0) {
					flsize[i] = flrsize;}
				else 
					{System.out.println("invalid number of floor size entered");
					System.exit(0);}
			
			}
			
			sflsize = new Integer[numoffloors];
			int k=0;
			for (int value : flsize) {
			    sflsize[k++] = Integer.valueOf(value);
			}
			
			System.out.println(" ");
			
			// sort the floor size input values
			Arrays.sort(sflsize);
			 
			
		}
		else 
			{System.out.println("invalid number of floors entered");
			System.exit(0);}
		
				
	}
	
	
	
	public void buildFloors() {
		
		Stack<Integer> sortedStack = new Stack<Integer>();
		LinkedList<Integer> storageList = new LinkedList<Integer>(); 
		
		//keep the sorted input floor size into stack
		for(int j=0;j<numoffloors;j++) {
			sortedStack.add(sflsize[j]);
		}
	
		//push element from stack compare with the input floor size values 
		//if floor size from both not same , keep floor size into Linked list and sort linked list
		//if floor size is same print day, floor size, linked list floor size, remove linked list element
		
		for(int i=0;i<numoffloors;i++) {
			int inputFloorSize = flsize[i];
			
			if(inputFloorSize == sortedStack.peek()) {
				System.out.println(" ");
				System.out.println("Day "+(i+1)+": " );
				System.out.print(sortedStack.pop() + " ");
				
				if(storageList!=null && storageList.size()>0) {
					while(storageList.size()>0) {
						if(storageList.get(0).intValue() == sortedStack.peek().intValue()) {
							System.out.print(sortedStack.pop()+ " ");
							storageList.remove(0);
							}else {
							break;
						}
					}
				}
				
			}else {
				System.out.println(" ");
				System.out.println("Day "+(i+1)+": ");
				System.out.println(" ");
				storageList.add(inputFloorSize);
				Collections.sort(storageList, Collections.reverseOrder());
			}
		}
	}
}
