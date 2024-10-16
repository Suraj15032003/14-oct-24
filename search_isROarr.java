package array;
import java.util.*;
public class search_isROarr {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int target=3;
	int ans = search(arr, target);
	System.out.println(ans);
}
public static int search(int[] arr, int target) {
    int count=-1;
    for(int i=0; i<arr.length;i++){
        
        if(target==arr[i]){
          count =i;
        }
    }
     return count;
}
}
