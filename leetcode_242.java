package array;

import java.util.Arrays;

public class leetcode_242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="anagram";
		String t="nagaram";
//		String []str=new String[s.length()];
//		String []gtr=new String[t.length()];
//		
		char[] str = s.toCharArray();
		char[] gtr = t.toCharArray();
		boolean n=false;
		Arrays.sort(str);
		Arrays.sort(gtr);
		if(str.length==gtr.length) {
		for(int i=0;i<str.length;i++) {
//			if(str.equals(gtr))System.out.print("it is a annagrram");
//			else {
//				System.out.println("it is not a annagram");
//			}
			 n = str.equals(gtr);
			System.out.println(n);
			break;
		}	
		}
	}

}
