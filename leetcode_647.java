package array;
import java.util.*;
public class leetcode_647 {

	//palindromic substring.
	
	public static int countEvenpss(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			
			int l=i;
			int r=i+1;
			while(l>=0 &&r<s.length()&&s.charAt(l)==s.charAt(r)) {
				count++;
				l--;
				r++;
			}
		}
		return count;
	}
	
	public static int countOddpss(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
			int l=i-1;
			int r=i+1;
			while(l>=0 &&r<s.length()&&s.charAt(l)==s.charAt(r)) {
				count++;
				l--;
				r++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abc";
//		String str[];
//		for(int i=0;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//			System.out.println(s.substring(i, j+1));	
//			}
//		}
		//int n=countOddpss( s);
		System.out.println(countOddpss(s)+countEvenpss(s));
	}
}
