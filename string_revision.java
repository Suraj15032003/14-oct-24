package array;
import java.util.*;
public class string_revision {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	//String s=sc.nextLine();
//	for(int i=0;i<s.length();i++) {
//		char[]cha=s.toCharArray();
//		// cha =s.charAt(s.indexOf(i));
//		
//		System.out.println(cha[i]);
//		
//	}
//	System.out.println(s.indexOf("a"));
//	
//	String a ="abcd";
//	String b="abcd";
//	System.out.println(a.equals(b));
//	
	
	//+++++++++++++++++
//	Substring
	
	String ac =sc.next();
//	for(int i=0;i<ac.length();i++) {
//		for(int j=i+1;j<ac.length()+1;j++) {
//		System.out.print(ac.substring(i,j)+" ");
//		}
//	}
//	for(int i=ac.length()-1;i>=0;i--) {
//		System.out.print(ac.charAt(i));
//	}
	
	
	//========toggle words===========
	
//String str=" PriORIty";
	
StringBuilder sb =new StringBuilder(sc.next());
for(int i=0;i<sb.length()-1;i++) {
	boolean flag=true;
	char ch=sb.charAt(i);
	if(ch==' ')continue;
	int asci=(int)ch;
	if(asci>=97)flag=false;
	if(flag==true) {
		asci+=32;
		char dh =(char)asci;
		sb.setCharAt(i,dh);
	}
	else {
		asci-=32;
		char dh=(char)asci;
		sb.setCharAt(i, dh);
	}
	System.out.println(sb);
}
}
}
