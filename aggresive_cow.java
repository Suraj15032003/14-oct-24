package array;
import java.util.*;
public class aggresive_cow {
public static void main(String args[]) {
	int stalls[]= {1,4,2,8,9};
	int nc=3;
	Arrays.sort(stalls);
	//System.out.println(isValid(stalls, nc, 1));
	int s =1;
	int e=stalls[stalls.length-1];
	int ans=1;
	while(s<=e)
	{
		int mid=(s+e)/2;
		if(isValid(stalls,nc,mid)) {
			ans =mid;
			s=mid+1;
			
		}
		else {
			e=mid-1;
		}
	}
	System.out.println(ans);
	
}
public static boolean isValid(int[]stalls,int nc,int sol) {
	int count =1;
	int lastP=0;
	for(int i=1;i<stalls.length;i++) {
		if(stalls[i]-stalls[lastP]>=sol) {
			count++;
			lastP=i;
		}
	}
	return count>=nc;
}
}
