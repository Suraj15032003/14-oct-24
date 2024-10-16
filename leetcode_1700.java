package array;
import java.util.*;
public class leetcode_1700 {
//public static void main(String args[]) {
//	int []students = {1,1,0,0};
//	int [] sandwiches = {0,1,0,1};
//	int count=0;
////	for(int i=0;i<students.length;i++) {
////		if(students[i]!=sandwiches[i]) {
////			if(students[i]==1 && sandwiches[i]==1) {
////				count++;
////			}
////		}
////	}
////	System.out.println(count);
//	
//	Stack <Integer>st=new Stack<>();
//	for(int i=0;i<students.length;i++) {
//		st.add(students[i]);
//	}
//	for(int i=0;i<st.size();i++) {
//		if(!st.equals(sandwiches[i])) {
//			st.add(st.pop());
//		}
//		else {
//			count++;
//		}
//	}
//	System.out.println(count);
//}
	
public static void main(String[] args) {
	int []students = {1,1,1,0};
	int [] sandwiches = {0,1,0,1};
	int circlesandwich=0;
	int squaresandwich=0;
	for(int choice:students) {
		if(choice==0) {
			circlesandwich++;
		}else {
			squaresandwich++;
		}
	}
	
	for(int sandwich:sandwiches) {
		if(sandwich==0 && circlesandwich==0) {
			System.out.println(squaresandwich);
		}
		if(sandwich==1 && squaresandwich==0) {
			System.out.println(circlesandwich);
		}
		if(sandwich==0) {
			circlesandwich--;
		}
		else {
			squaresandwich--;
		}
	}
	System.out.println(0);
	}
}
