

public class QuickkSort {
public static void main(String args[]) {
	
	int a[]= {15,9,7,13,12,16,4,18,11};
	int l=a.length;
	QuickkSort m= new QuickkSort();
	m.recursion(a, 0, a.length-1);
	m.printArr(a);
	
}

	
	int par(int a[], int low, int high)
	{
		int pivot=a[(low+high)/2];
		
		while(low<=high) {
			while(low<pivot) {
				low++;
			}
			while(a[high]>pivot) {
				high--;
			}
			if(a[low]<=a[high]) {
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
				
				low++;
				high--;
				
			}
		}
		return low;
}
	void recursion(int a[],int low , int high){
		int p=par(a, low, high);
		if(low<p-1) {
			recursion(a, low, p-1);
		}
		if(p<high) {
			recursion(a, p, high);
		}
	}
	void printArr(int []a){
	for(int i:a) {
		System.out.println(i);
	}
	
}}
