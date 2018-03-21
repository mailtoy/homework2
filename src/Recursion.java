import java.util.ArrayList;
import java.util.List;

/**
 * Recursion class containing unique method that remove duplicate consecutive
 * items from a list and fibonacci method that have helper method.
 * 
 * @author Kanchanok Kannee
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List<String> unique(List<String> list) {
		if (list.size() <= 1)
			return list;
		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}

	/**
	 * Recursive function of Fibonacci.
	 * 
	 * @param n is sequence number that user want to know.
	 * @return the fibonacci number.
	 */
	public static long fibonacci(int n) {
		// the base case
		if (n <= 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		// the recursive step
		return helper(0, 1, n);
	}

	/**
	 * The helper method to perform recursion.
	 * 
	 * @param result is fibonacci number.
	 * @param second is sum of fibonacci number.
	 * @param count is the number of fibonacci
	 * @return fibonacci number.
	 */
	private static long helper(int result, int second, int count) {
		if (count <= 0) {
			return result;
		}
		return helper(second, result + second, count - 1);
	}

	/**
	 * Test the programs.
	 * 
	 * @param args not used.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("b");
		list.add("3");
		list.add("1");
		list.add("2");
		list.add("1");
		System.out.println(unique(list));
		System.out.println("------------------");
		System.out.print("Fibonacci : ");
		System.out.println(fibonacci(7));
	}

}
