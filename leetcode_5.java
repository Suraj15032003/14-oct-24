package array;
import java.util.*;
public class leetcode_5 {
		public static void main(String[] args)
		    {
		        String s[]
		            = "i like this program very much".split(" ");
		        String ans = "";
		        for (int i = s.length - 1; i >= 0; i--) {
		            ans += s[i] + ".";
		        }
		        
		        System.out.println(
		            ans.substring(0, ans.length() - 1));
		    
		

	}
}
