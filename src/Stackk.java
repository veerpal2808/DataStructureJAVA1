
//import java.util.Stack;
//
//public class Stackk {
//public static void main(String[] args) {
//	
//	Stack s= new Stack();
//	s.push("Muskannn");
//	s.push(238);
//	s.push(69.00);
//	
//	System.out.println(s);
//	s.pop();
//	System.out.println(s);
//	s.peek();
//	System.out.println(s);
//
//
//	
//}
//}

//IMPLEMENTATION OF STACK USING ARRAY 

public class Stackk{
	
	int size;
	int arr[];
	int top;
	
	public Stackk(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
		
		
	}
	public boolean isFull() {
		return(size-1==top);
	}
	public boolean isEmpty() {
		return(top==-1);
	}
	public int Peek() {
		return arr[top];
	}
	
	public void push(int num) {
		if(!isFull()) {
			arr[++top]=num;
			System.out.println("Element is pushed "+num);
		}
		
		else {
			System.out.println("Stack overflowed ");

		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int val=arr[top];
			top--;
			
			
			System.out.println("Element is popped "+val);
			return val;
		}
		else {
			System.out.println("Stack underflowed ");
			return -1;
		}
		
	}
	
	
	public static void main(String [] args) {
		Stackk s1=new Stackk(5);
		s1.push(2);
		s1.push(5);
		s1.push(7);
		s1.push(98);
		s1.push(3);
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		
		
		System.out.println("Peek element is: "+s1.Peek());
	}
}













