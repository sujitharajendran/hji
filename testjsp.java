package test;
import java.util.*;
public class testjsp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println( "Enter the array elements : " );
		int n=s.nextInt();
		int arr [] = new int[n];
		for( int i = 0 ; i<n ; i++ ){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println( " The 4th tallest Student " + arr[arr.length-4]);
		System.out.println( "Enter the k value" );
		int k = s.nextInt();
		System.out.println( "The kth tallest Student" + arr[arr.length-k] );
		s.close();
	}

}