package array;
import java.util.*;
public class leetcode136 {
public static void main(String args[]) {
//	int []arr= {2,2,1};
//	int count =1;
//	int ans=0;
//	int n=arr[0];
//	Arrays.sort(arr);
//	if(arr.length>1) {
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]!=arr[j]) {
//				ans=arr[j];
//			}
//		}
//		
//	}
//	System.out.println(ans);
//	}
//	if(arr.length<1)System.out.println(n);
//	
	int []arr= {2,2,3};
	int xor=0;
	for(int i=0;i<arr.length;i++) {
		xor=xor^arr[i];
	}
	System.out.println(xor);
	
}
}
