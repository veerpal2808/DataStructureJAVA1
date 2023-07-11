
import java.util.Scanner;

public class LLInsertion {
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
		int data,n,m;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter data ");
		data=sc.nextInt();
		
		Node new_node=new Node(data);
		
		if(head==null) {
			head=new_node;
		}
		
		else {
			System.out.println("Enter 1 to insert in beginning, Enter 2 to inset in the end and enter 3 to insert in between");
			m=sc.nextInt();
			switch(m) {
			case 1:
				new_node.next=head;
				head=new_node;
				break;
				
				
			case 2:
				Node temp=head;
				while(temp!=null) {
					temp=temp.next;
				}
				temp.next=head;
				break;
				
				
				
			case 3:
				System.out.println("Enter the position in which you want to insert the node");
                int p=sc.nextInt();
                Node temp1=head;
                for(int i=0;i<p-1;i++) {
                	temp1=temp1.next;
                }
                new_node.next=temp1.next;
                temp1.next=new_node;
				break;
			}
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
	LLInsertion l1=new LLInsertion();
	l1.Creation();
	l1.traverse();
}
}
