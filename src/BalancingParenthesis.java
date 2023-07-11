

import java.util.Scanner;
import java.util.Stack;
public class BalancingParenthesis {
public static void main(String[] args) {
	System.out.println("Write your string here ");

	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	
	Stack<Character> st=new Stack<Character>();
	try {
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='(') {
			st.push(s1.charAt(i));
		}
		
		else if(s1.charAt(i)==')'){
			st.pop();
		}
		
		
	}
	if(st.size()==0) {
		System.out.println("Balanced");
	}
	
	else {
		System.out.println("UNBalanced");

	}
	
	
}
	catch(Exception e) {
		System.out.println("UNBalanced");

}
}
}
