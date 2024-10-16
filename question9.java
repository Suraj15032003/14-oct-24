package array;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int a[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer>l1=new ArrayList<>(n);
		//Scanner sc =new Scanner(System.in);
		for(int i=0;i<l1.size();i++) {
			//a[i]=sc.nextInt();
			l1.add(sc.nextInt());
		}
		Collections.reverse(l1);
//		for(int i=l1.length-1;i>=0;i--) {
//			System.out.print(a[i]);
//		}
		System.out.println(l1);
	}
}
