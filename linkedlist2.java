package array;
import java.util.*;
public class linkedlist2 {
public static void main(String args[]) {
	int target=3;
	LinkedList<Integer>l2=new LinkedList();
	l2.add(1);
	l2.add(2);
	l2.add(3);
	l2.add(4);
	l2.add(5);
	ArrayList<Integer>li=new ArrayList<>(l2);
	for(int i=0;i<li.size();i++) {
		if(li.contains(target)) {
			System.out.println("its present");
			break;
		}
		else {
			System.out.println("not present");
		}
	}
}
}
