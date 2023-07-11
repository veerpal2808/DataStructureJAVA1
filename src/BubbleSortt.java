
public class BubbleSortt {
public static void main(String[] args) {
	
	int arr[]= {8,65,43,66,22,99,86};
	int temp = 0;
	System.out.println("non sorted ");

	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				
			}
		}

	}
	System.out.println("Sorted ");

	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
