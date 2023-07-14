import java.util.Scanner;


class Node{
	int data;
	Node left,right;
	
	public Node(int data) {
		this.data=data;
		 left= null;
		 right=null;
		 
		
	}
}


public class LinkedRepBINARY {
	
	static Node Create() {
		int data;
		Scanner sc= new Scanner(System.in);
		
		Node root=null;
		
		System.out.println("Enter value: ");
		data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		
		
		
		root=new Node(data);
		System.out.println("Enter left child of: "+ root.data);
	
		root.left=Create();
		
		System.out.println("Enter left child of: "+root.data);
		
		 root.right=Create();
		 return root;
	}
public static void main(String[] args) {
	Node root=Create();
}
}
