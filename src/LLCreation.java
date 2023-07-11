import java.util.Scanner;

public class LLCreation {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=next;
			
		}
	}
	
	Node head=null;
	
	public void Creation() {
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter data ");
		data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null) {
			head=new_node;
		}
		
		else {
			new_node.next=head;
			head=new_node;
		}
		System.out.println("Do you want to add more data. if yes press 1.. ");
          n=sc.nextInt();
		}
		while(n==1);
	}
	
	public void traverse() {
		
		Node temp=head;
		if(head==null) {
			System.out.println("LL doesnt exist");
		}
		
		else {
			while(temp!=null) {
				System.out.println(temp.data+" ");
				temp=temp.next;

			}
		}
	}
	
	
public static void main(String[] args) {
	LLCreation l1=new LLCreation();
	l1.Creation();
	l1.traverse();
}
}
