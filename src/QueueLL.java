import java.util.Scanner;



class Quick1{
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
			
		}}
		Node front=null;
		Node rear=null;
		

	
	void Enqueue(Scanner sc) {
		 System.out.println("Enter data");
		 int data=sc.nextInt();
		 Node newNode =new Node(data);
		 if(front==null) {
			 front=newNode;
			 rear=newNode;
		 }
		 else {
			 rear.next=newNode;
			 rear=newNode;
		 }
	}
	
    void Dequeue() {
		if(front==null) {
			System.out.println("UNDERFLOW");
		}
		else {
		 front=front.next;
		}
	}


    void Display() {
	Node temp=front;
	while(temp!=null) {
		System.out.println(temp.data);
        temp=temp.next;
	}
    }



public class QueueLL {
	public static void main(String[] args) {
		
		int d;
		Scanner sc=new Scanner(System.in);
		
		Quick1 q =new Quick1();
		int l;

		do 
		{
		System.out.println("Press 1 to ENQUEUE");
		System.out.println("Press 2 to DEQUEUE");
		System.out.println("Press 3 to DISPLAY");
		System.out.println("Enter your Choice");

		d=sc.nextInt();
		switch(d) {
		case 1:{
			q.Enqueue(sc);
			break;}
		
		case 2:{
			q.Dequeue();
			break;}
			
		case 3:{
			q.Display();
			break;}
		}
		
		System.out.println("Press 0 to GO to back again");
		System.out.println("Enter any key");
	    l=sc.nextInt();
		}

	while(l==0); 
		System.out.println("EXIT successfully");



	}
	}
}
