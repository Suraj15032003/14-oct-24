package array;
import java.util.*;
public class leetcode350 {
public static void main(String args[]) {
	int []arr= {1,2,3,4,2};
	int []brr= {2,2};
	Arrays.sort(arr);
	Arrays.sort(brr);
	int i=0,j=0;
	ArrayList<Integer>ans=new ArrayList<>();
	
	while(i<arr.length&&j<brr.length) {
		if(arr[i]==brr[j]) {
			ans.add(arr[i]);
			i++;
			j++;
		}
		else if(arr[i]<brr[j]) 
			i++;
			else 
			j++;
		
		}
		
		int []c=new int[ans.size()];
		for(int k=0;k<ans.size();k++) {
			c[k]=ans.get(k);
		System.out.print(c[k]);	
		}
		
	
}
}
