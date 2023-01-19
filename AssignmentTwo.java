
public class AssignmentTwo {
	
	 public static int fibonacciRecursive(int n) {
			if(n <= 1) {
				return n;
			}
			return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
		}

	public static void main(String[] args) {
		int fibonacciInput = 10;
		int fibonacciOutput = fibonacciRecursive(fibonacciInput);
	
		System.out.println("The "+fibonacciInput+"th term of the Fibonacci sequence is "+ fibonacciOutput +" ");
	}

}
