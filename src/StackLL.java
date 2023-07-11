import java.util.Scanner;

class Stack12{
	
	static class Node{
		int data;
        Node next;
        
        Node(int data){
        	this.data=data;
        	this.next=next;
        	
        }}
        
        Node top=null;
        
         void push(Scanner sc) {
        	System.out.println("Enter data");
        	int data=sc.nextInt();
        	
        	Node new_node=new Node(data);
        	
        	if(top==null) {
        		top=new_node;
        	}
        	else {
        		new_node.next=top;
        		top=new_node;
        	}
        	
        }
        
         void pop() {
//        	Node temp=top;
        	if(top==null) {
            	System.out.println("Stack is EMPTY");

        	}
        	else {
        		top=top.next;
        	}
        	
        }
        
         void display() {
        	Node temp1=top;
        	while(temp1!=null) {
            	System.out.println(temp1.data);

        		temp1=temp1.next;

        	}
        }
        
	

	}
	

	

public class StackLL  {
public static void main(String[] args) {
	
	int d;
	Scanner sc=new Scanner(System.in);
	
	Stack12 st=new Stack12();
	int l;

	do 
	{
	System.out.println("Press 1 to PUSH");
	System.out.println("Press 2 to POP");
	System.out.println("Press 3 to DISPLAY");
	System.out.println("Enter your Choice");

	d=sc.nextInt();
	switch(d) {
	case 1:{
		st.push(sc);
		break;}
	
	case 2:{
		st.pop();
		break;}
		
	case 3:{
		st.display();
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


