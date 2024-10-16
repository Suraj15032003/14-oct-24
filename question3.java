package array;
import java.util.*;
public class question3 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String str =sc.nextLine();
	
	int cnt =0;
	int maxi=0;
	for(int i=0;i<str.length();i++) {
		char ch =str.charAt(i);
		//System.out.print(ch);
		if(ch!=' ') {
			cnt++;
			maxi=Math.max(maxi, cnt);
		}
		else {
			cnt=0;
		}
	}
	System.out.print(maxi);
}
}
