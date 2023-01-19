
/**
* The Assignment Two  program implements an application that
* simply displays nTH number using fibonacci method to the standard output.
*
* @author  Bharat Katyal
* @version 1.0
* @since   2023-01-19 
*/


public class AssignmentTwo {
	
	/**
	 * Recursive implementation for nth fibonacci number
	 * Time complexity - O(n)
	 * Space complexity - O(n)
	 * 
	 * @param n
	 * @return
	 */
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
