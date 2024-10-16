package array;
import java.util.*;
public class arrays {
public static void main(String args[]) {
	int []arr= {1,2,3,4,5,6,8,7};
	boolean dupli=false;
//	for(int i=1;i<arr.length;i++) {
//		int n=arr[0];
//		if(n==arr[i]) {
//			dupli=true;
//		}
//	}
//	System.out.println(dupli);
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				dupli=true;
			}
		}
	}
	System.out.println(dupli);
}
}
