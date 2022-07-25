package PairSum;

import java.util.*;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}

public class FindPairofSumBST {

	ArrayList<Integer> converttoList(Node node, ArrayList<Integer> listform) {

		if (node == null)
			return listform;

		converttoList(node.left, listform);
		listform.add(node.data);
		converttoList(node.right, listform);

		return listform;
	}

	public void idenitfyPair(int sum, ArrayList<Integer> tolist) {

		boolean flag = false;

		for (int i = 0; i < tolist.size(); i++) {
			for (int j = i + 1; j < tolist.size(); j++) {
				if (tolist.get(i) + tolist.get(j) == sum) {
					System.out.println("Pair is (" + tolist.get(i) + "," + tolist.get(j) + ")");
					flag = true;
					return;
				}
			}

		}

		if (flag == false)
			System.out.println("nodes are not found");
	}

	public static void main(String[] args) {

		Node root = new Node(40);
		root.left = new Node(20);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right = new Node(60);
		root.right.left = new Node(50);
		root.right.right = new Node(70);

		// ***** change the input Sum value here ***
		int sum = 130;

		FindPairofSumBST findpairofsumBST = new FindPairofSumBST();

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> resultlist = findpairofsumBST.converttoList(root, list1);
		// System.out.println(resultlist);

		findpairofsumBST.idenitfyPair(sum, resultlist);

	}

}
