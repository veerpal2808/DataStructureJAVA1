//
//public class Deletion {
//public static void main(String[] args) {
//	
//	int  a[]= {10,20,30,40,50,80};
//	  int del=30;
//	  for(int i=0;i<a.length-1;i++) {
//		  if(del==a[i]) {
//			  for(int j=i;j<a.length-1;j++) {
//				  a[j]=a[j+1];
//				  
//			  }
//			  break;
//		  }
//		 
//		  }
//	  
//	  for(int i=0;i<a.length-1;i++) {
//		  System.out.println(a[i]);
//	  }
//	
//}
//
//}


public class Deletion{
	public static void main(String[] args) {
		
		int a[]= {32,4,69,71,82,43,21};
		int e=69;
		
		for(int i=0;i<=a.length-1;i++) {
			if(e==a[i]) {
				for(int j=i;j<a.length-1;j++) {
					a[j]=a[j+1];
					}}
			break;
			}
		for(int i=0;i<a.length-1;i++) {
		System.out.println(a[i]);
					  }			
				}}












