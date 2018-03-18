package homework2;

import java.util.ArrayList;
import java.util.List;

/**
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
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List<String> unique(List<String> list) {
		if (list.size() <= 1)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}

	/**
	 * 
	 * @param n the Fibonacci numbers from 1 to n
	 * @return the fibonacci number.
	 */
	public static long fibonacci(int n) {
		// the base case
		if (n <= 0)
			return n;
		if (n == 1 || n == 2)
			return 1;
		// the recursive step
		return help(0, 1, n);
	}

	/**
	 * The helper method to perform recursion.
	 * 
	 * @param start
	 * @param second
	 * @param count
	 * @return 
	 */
	private static long help(int start, int second, int count) {
		if (count <= 0) {
			return start;
		}
		return help(second, start + second, count - 1);
	}

	/**
	 * Test the programs.
	 * 
	 * @param args
	 *            not used.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("b");
		System.out.println(unique(list));
		System.out.println(fibonacci(7));
	}

}
