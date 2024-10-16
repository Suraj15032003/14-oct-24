package array;
import java.util.*;
public class arr_reverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int arr[]=new int [m];
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=00;i--){
			System.out.print(arr[i]);
		}
	}
}
