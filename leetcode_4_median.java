package array;
import java.util.*;
public class leetcode_4_median {
public static void main(String args[]) {
	int []a= {1,2};
	int []b= {3,2};
	System.out.println(findMedianSortedArrays(a,b));
	

//	int n =a.length;
//	int m =b.length;
//	int []c=new int[m+n];
//	int i=0, j=0,k=0;
//	while(i<m && j<n) {
//		if(a[i]<b[j]) {
//			c[k]=a[i];
//			i++;
//		}
//		else {
//			c[k]=b[j];
//			j++;
//		}
//		k++;
//	}
//	while(i<m) {
//		c[k]=a[i];
//		i++;
//		k++;
//	}
//	while(j<n) {
//		c[k]=b[j];
//		j++;
//		k++;
//	}
//	if((m+n)%2!=0){
//		return c[(m+n)/2];
//	}
//	else {
//		int x=(m+n)/2;
//		double p =c[x];
//		double q=a[x-1];
//		return (p+q)/2;
//	}
	
}
public static double findMedianSortedArrays(int[] a, int[] b) {
	int n =a.length;
	int m =b.length;
	int []c=new int[m+n];
	int i=0, j=0,k=0;
	while(i<m && j<n) {
		if(a[i]<b[j]) {
			c[k]=a[i];
			i++;
		}
		else {
			c[k]=b[j];
			j++;
		}
		k++;
	}
	while(i<m) {
		c[k]=a[i];
		i++;
		k++;
	}
	while(j<n) {
		c[k]=b[j];
		j++;
		k++;
	}
	if((m+n)%2!=0){
		return c[(m+n)/2];
	}
	else {
		int x=(m+n)/2;
		double p =c[x];
		double q=a[x-1];
		return (p+q)/2;
	}  
}
}
