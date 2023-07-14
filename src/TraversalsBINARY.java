import java.util.Scanner;




public class TraversalsBINARY {
	
	static Node1 Create() {
		int data;
		Scanner sc= new Scanner(System.in);
		
		Node1 root=null;
		
		System.out.println("Enter value: ");
		data=sc.nextInt();
		if(data==-1) {
			return null;
		}
		root=new Node1(data);
		System.out.println("Enter left child of: "+ root.data);
	
		root.left=Create();
		
		System.out.println("Enter left child of: "+root.data);
		
		 root.right=Create();
		 return root;
	}
	
	static void inorder(Node1 root) {
		if(root==null)
		   return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	
   static void preorder(Node1 root) {
	   if(root==null)
		   return;
		System.out.println(root.data);

		preorder(root.left);
		postorder(root.right);
	}

   static void postorder(Node1 root) {
	   if(root==null)
		   return;
		postorder(root.left);
		postorder(root.right);
		   System.out.println(root.data);

   }
	
	
	
	
public static void main(String[] args) {
	Node1 root=Create();
	preorder(root);
	postorder(root);
	inorder(root);
}
}


class Node1{
	int data;
	Node1 left,right;
	
	public Node1(int data) {
		this.data=data;
		 left= null;
		 right=null;
		 
		
	}
}
