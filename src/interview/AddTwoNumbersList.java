package interview;

class Node{
	 int val;
	 Node next;
	 
	 Node (int val){
		this.val = val;
		//this.next = next;
	 }

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
}



public class AddTwoNumbersList {

	public static Node addTwoNumbers(Node l1, Node l2) {
        int carryOver = 0;
		Node newNode = null;
		int sum = 0;
		Node root = null;
		Node node = null;
		while (l1 !=  null || l2 != null){
			
			int addval = 0;
			sum = 0;
			
			if (l1 == null){
				sum = addval + l2.val+carryOver;
				l2 = l2.next;
			}
			else if (l2 == null){
				sum = addval + l1.val+carryOver;
				l1 = l1.next;
			}
			else{
				sum = l1.val+l2.val+carryOver;
				l1 = l1.next;
			    l2 = l2.next;
			}
			
			if (sum > 0){
				carryOver = sum/10;
				sum = sum % 10;	
			}
			newNode = new Node (sum);
			
			if (root == null){
			    root = newNode;
			    node = root;
			}
			else{
			    node.next = newNode;
			    node = node.next;
			}
		//	previousNode = node;
		}
		if (carryOver > 0){
			newNode = new Node (carryOver);
			if (root == null){
			    root = newNode;
			}
			else{
			    node.next = newNode;
			}    
			//previousNode = node;
		}
		//Node sum = new Node (num1.a+num2.a,null);
		
		return root;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root1 = new Node (5,null);
		root1.next = new Node (8, null);
		
		Node root2 = new Node (5,null);
		root2.next = new Node (6, new Node (4,null));
		
		Node result = addTwoNumbers(root1, root2);
		StringBuilder resultInString = new StringBuilder();
		while(result != null){
			resultInString.append(result.val);
			result = result.next;
		}
		System.out.println(resultInString);
		
	}

}
