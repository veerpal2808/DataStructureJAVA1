import java.util.LinkedList;
import java.util.Scanner;

public class AdjListGraphhss {
	private LinkedList<Integer> arr[];
	
	public AdjListGraphhss(int v) {
		
		arr=new LinkedList[v];
		for (int i=0;i<v;i++) {
			arr[i]=new LinkedList<>();		}
	}
	
	public void insertEdge(int s,int d) {
		arr[s].add(d);
		arr[d].add(s);
	}
	
	
	
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of edges and vertices");
	int v=sc.nextInt();
	int e=sc.nextInt();
	
	AdjListGraphhss g=new AdjListGraphhss(v);
	
	System.out.println("Enter edges");
	for(int i =0;i<e;i++) {
		int s=sc.nextInt();
		int d=sc.nextInt();
		
		g.insertEdge(s,d);
	}
	
}
}
