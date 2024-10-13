public class Recursion {

	// Part 1: complete
	public static int sum(int n){
		if (n==0)
			return 0;
		else
			return n*(n+1)/2; // sum of n positive integers till n
	}

	// Part 1 complete
	public static int multiply(int m, int n){
		if (n==0)
			return 0;
		else if (n > 0)
			return m + multiply(m, n-1);
		else
			return -multiply(m, -n);
	}
	
	// Part 1: complete
	public static int Fibonacci (int n){
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
			return Fibonacci (n-1) + Fibonacci (n-2); //Fibonacci sequence 
	
	}
}
