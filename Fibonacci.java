/*
**	A basic program to print Fibonacci numbers by Juan Swanepoel
*/ 
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n, n2 = 0;
		int n1 = 0; 
		
		for(int i=0; i<=x; i++){ 
			if(i==0) {
				System.out.println(0);
				n1 = i; 
			}
			else if (i==1) {
				n2 = n1;
				n2 = i; 
				System.out.println(1);
			}
			n = n1 + n2; 
			System.out.println(n);
			n2 = n1;
			n1 = n; 
		}
	}
}