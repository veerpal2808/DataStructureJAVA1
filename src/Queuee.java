
public class Queuee {
	
        int front;
		int rear;
		int arr[];
		int capacity;
		
		public Queuee(int capacity){
			this.capacity=capacity;
			rear=front=0;
			this.arr= new int[capacity];
			
		}
		
		public void enqueue(int data) {
			if(capacity==rear) {
				System.out.println("You are not able to enqueue items your queue is already full");
				
			}
			else {
				arr[rear]=data;
				rear++;
			}
		}
		public void dequeue() {
			if(front ==rear) {
				System.out.println("You are not able to dequeue items your queue is already empty");
				
			}
			else {
				for(int i=0;i<rear-1;i++) {
					arr[i]=arr[i+1];
					
					if (rear<capacity) {
						arr[rear]=0;
						rear--;
						
					}
				}
			}
		}
	
	   public void display() {
		   int i;
		   if(front==rear) {
				System.out.println("EMPTY QUEUE");
				
		   }
		   
		   else {
			   for( i=front;i<rear;i++) {
					System.out.println(arr[i]);

			   }
		   }
		   
	   }
	
public static void main(String [] args) {
	Queuee q= new Queuee(4);
	q.enqueue(64);
	q.enqueue(4);
	q.enqueue(6);
	q.enqueue(69);
	
	
	
	q.dequeue();
	q.dequeue();
	
	q.display();
	
}
}
