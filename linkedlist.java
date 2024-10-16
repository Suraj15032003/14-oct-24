package array;
import java.util.*;

public class linkedlist {
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	LinkedList<String > linkedList = new LinkedList();

	//add items
//	linkedList.add("A");
//	linkedList.add("B");
//	linkedList.add("C");
//	linkedList.add("D");
//	
	for(int i=0;i<n;i++) {
		linkedList.add(sc.next());
	}
	ArrayList<String> arrayList = new ArrayList<>(linkedList);
	
	System.out.println(arrayList);
	Collections.reverse(arrayList);
	System.out.println(arrayList);
	
}
}
