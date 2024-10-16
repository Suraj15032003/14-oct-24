package array;
import java.util.*;
public class question4 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String sb =sc.nextLine();
	String res="";
	for(int i=0;i<sb.length()-1;i++) {
		if(sb.charAt(i)!=sb.charAt(i+1)) {
			res+=sb.charAt(i);
		}
	}
	res+=sb.charAt(sb.length()-1);
	System.out.println(res);
}
}
