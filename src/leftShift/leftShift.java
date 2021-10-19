package leftShift;

import java.util.Arrays;

public class leftShift {
	
	public static void main(String[] args) {
		
		int [] a = {10, 20, 30, 40, 50, 60};
		int index =4;
		
		for( int i=index ; i< a.length-1; i++) {
			a[i] = a[i+1];
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
