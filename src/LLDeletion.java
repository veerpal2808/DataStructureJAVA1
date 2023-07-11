
import java.util.Scanner;

public class LLDeletion {
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
			System.out.println("LL is empty ");

		}
		
		else {
			System.out.println("Enter 1 to delete in beginning, Enter 2 to delete in the end and enter 3 to delete in between");
			m=sc.nextInt();
			switch(m) {
			case 1:
				Node temp=head;
				temp=temp.next;
				head=temp;
				break;
				
				
			case 2:
				Node temp1,ptr1;
				temp1=head;
				ptr1=temp1.next;
				while(ptr1 !=null) {
					temp1=ptr1;
					ptr1=ptr1.next;
				}
				temp1.next=null;
				break;
				
				
				
			case 3:
				System.out.println("Enter the position in which you want to delete the node");
                int p=sc.nextInt();
                Node temp2, ptr2;
                temp2=head;
                ptr2=temp2.next;
                for(int i=0;i<p-2;i++) {
                	temp2=ptr2;
                	ptr2=ptr2.next;
                }
                temp2.next=ptr2.next;
				break;
			}
		}
		System.out.println("Do you want to delete more data. if yes press 1.. ");
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
	LLDeletion l1=new LLDeletion();
	l1.Creation();
	l1.traverse();
}
}
