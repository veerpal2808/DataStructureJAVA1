
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFs {
	private LinkedList<Integer> arr[];
	
	public BFs(int v) {
		
		arr=new LinkedList[v];
		for (int i=0;i<v;i++) {
			arr[i]=new LinkedList<>();		}
	}
	
	public void insertEdge(int s,int d) {
		arr[s].add(d);
		arr[d].add(s);
//		System.out.println(d);
//		System.out.println(s);

		
	}
	
	
	public void bfs(int source) {
		boolean visited_nodes[]=new boolean[arr.length];
		int parent_node[]=new int[arr.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		
		visited_nodes[source]=true;
		parent_node[source]=-1;
		
		while(!q.isEmpty()) {
			int m=q.poll();
			System.out.print(m);
			
			for( int i:arr[m]) {
				if(visited_nodes[i]!=true) {
					visited_nodes[i]=true;
					q.add(i);
					parent_node[i]=m;
				}
			}}
		}
	
	
	
	
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of Vertices & Edges");
	int v=sc.nextInt();
	int e=sc.nextInt();
	
	BFs g=new BFs(v);
	
	System.out.println("Enter edges");
	for(int i =0;i<e;i++) {
		int s=sc.nextInt();
		int d=sc.nextInt();
		
		g.insertEdge(s,d);
	}
	
	System.out.println("Enter the source for Bfs order: ");
	int source=sc.nextInt();
	g.bfs(source);
	
}
}
