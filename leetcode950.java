package array;
import java.util.*;
public class leetcode950 {

	public static void main(String args[]) {
		int []deck = {17,13,11,2,3,5,7};
		Arrays.sort(deck);
		Queue<Integer>q=new LinkedList<>();
		int ans[]=new int[deck.length];
		for(int i=0;i<deck.length;i++) {
			q.add(i);
			
		}
		for(int i=0;i<deck.length;i++) {
			ans[q.poll()]=deck[i];
			if(q.size()>0)
				q.add(q.poll());
		}
		System.out.println(ans.toString());
	}
	}
