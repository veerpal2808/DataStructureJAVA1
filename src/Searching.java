
//LINEAR SEARCH

//public class Searching {
//public static void main(String[] args) {
//	
//	int a[]= {10,20,30,40,50,60};
//	int s=40;
//	for(int  i=0;i<a.length;i++) {
//		if(a[i]==s) {
//			System.out.println(s+" is found on "+i+" index");
//		}
//		
//	}  
//}
//}


//BINARY SEARCH

public class Searching{
	public static void main(String[] args) {
		int []a= {2,4,6,8,10,12,14,16,18,20,22};
		int l=0;
		int h=a.length-1;
		
		int m=(l+h)/2;
		int s=	10;																													
		
		while(l<=h) {						
		if(a[m]==s) {
			System.out.println("Element is found");
		}
		
		else if(a[m]>s){
			h=m-1;
			
		}
		else {
			l=m+1;
		}
		
		m=(l+h)/2;
		
	}
		if(l>h) {
			System.out.println("Element NOT found");

		}
}


}









