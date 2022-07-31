package question2MNCTransactions;

import java.util.*;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}

public class BSTtoSkewTree {
	
		Node root;
		Stack<Integer> tempstack = new Stack<Integer>();
		
		  void findPreorder(Node node)
		    {
		        if (node == null) {  
		            return;
		        }
		   
		     //   System.out.print(node.data + " ");
		        tempstack.add(node.data);
		  
		        findPreorder(node.left);
		
		        findPreorder(node.right);
		        
		    }
		
	
		public void convert() {
			
			    
			Collections.sort(tempstack, Collections.reverseOrder());
						
			if (!tempstack.isEmpty()) {
			
				//assign root		
				Node newroot = new Node(tempstack.pop());
				System.out.print(newroot.data + " ");
			
				//right skew following nodes
				while (!tempstack.isEmpty()) {
					newroot.right = new Node(tempstack.pop());	
					newroot = newroot.right;
					System.out.print(newroot.data + " ");
			
				}
			}
			else
				return;		
			
}
	

	public static void main(String[] args) {
	
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left= new Node(55);
		
		BSTtoSkewTree bsttoskewtree = new BSTtoSkewTree();
		bsttoskewtree.findPreorder(root);
		bsttoskewtree.convert();
		
		
		
	}

}
