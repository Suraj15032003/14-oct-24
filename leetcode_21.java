package array;
import java.util.*;
public class leetcode_21 {
public static void main(String args[]) {
	
	   LinkedList<Integer> linkedList = new LinkedList<>();
	   linkedList.add(1);
	   linkedList.add(2);
	   linkedList.add(3);
	   
	   System.out.println(linkedList);
	   LinkedList<Integer> linkedList2 = new LinkedList<>();
	   linkedList2.add(4);
	   linkedList2.add(2);
	   linkedList2.add(6);
	   System.out.println(linkedList2);
	   
	   ArrayList<Integer>l1=new ArrayList<>();
	   l1.addAll(linkedList);
	   l1.addAll(linkedList2);
	   
	   int []arr=new int[l1.size()];
	   for(int i=0;i<l1.size();i++) {
		   arr[i]=l1.get(i);
	   }
	   Arrays.sort(arr);
	   System.out.println(Arrays.toString(arr));
}
}
