package array;
import java.util.*;
public class question5 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n =sc.nextInt();
	int x=sc.nextInt();
	int []a=new int[n];
	int []b =new int[n];
	int sum=0;
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();	
			}
	for(int i=0;i<n;i++) {
		if(a[i]>=x){
			sum=sum+b[i];
		}
	}
	System.out.print(sum);
}
}
