package array;
import java.util.*;
public class infoys_ques1 {
public static void main(String args[]) {
	int curr=1;
	int arr []= {1,4,3};
	ArrayList<Integer> al=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		al.add(arr[i]);
	}
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]==curr) {
			curr++;
		}
		else {
			al.remove(i);
		}
	}
	
}
}
