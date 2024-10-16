package array;
import java.util.*;
public class question2 {
public static void main(String[]args) {
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	//ArrayList<String>st=new ArrayList(n);
	String arr[]=new String[n];
	for(int i=0;i<n;i++) {
//st.add(sc.next());
		arr[i]=sc.next();
	}
	String search=sc.next();
	ArrayList<String>al=new ArrayList<>();
	for(int i=0;i<n;i++) {
		int x=arr[i].compareTo(search);
		if(x>0) {
			al.add(arr[i]);
		}
	}
	System.out.print(al);
	
}

}

