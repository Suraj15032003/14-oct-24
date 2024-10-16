package array;
import java.util.*;
public class question6 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int x =sc.nextInt();
	int a[]=new int[x];
	int b[]=new int[x];
	for(int i=0;i<x;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<x;i++) {
		b[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<x;i++) {
		if(a[i]*2<b[i]||b[i]*2<a[i]) {
			continue;
		}
		else {
			count++;
		}
	}
	System.out.println(count);
}
}
