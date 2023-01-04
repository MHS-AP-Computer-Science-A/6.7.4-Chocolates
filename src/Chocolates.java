import java.util.Arrays;

public class Chocolates {

	public static void main(String[] args) {
		int[] test1 = { 7, 3, 2, 4, 9, 12, 56 };
		int m1 = 3;

		int[] test2 = { 3, 4, 1, 9, 56, 7, 9, 12 };
		int m2 = 5;

		int[] test3 = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
		int m3 = 7;
		
		int[] test4 = { 7, 3, 2, 4, 9, 12, 56 };
		int m4 = 0;
		
		int[] test5 = { 7, 3, 2, 4, 9, 12, 56 };
		int m5 = 7;
		
		int[] test6 = { 7, 3, 2, 4, 9, 12, 56 };
		int m6 = 8;
		
		int[] test7 = { 12, 5, 6, 19, 45, 6, 3, 7, 46, 48, 19, 11, 56};
		int m7 = 7;
		

		System.out.println("Minimum Difference for Test 1: " + distribute(test1, m1));
		System.out.println("Minimum Difference for Test 2: " + distribute(test2, m2));
		System.out.println("Minimum Difference for Test 3: " + distribute(test3, m3));
		System.out.println("Minimum Difference for Test 4: " + distribute(test4, m4));
		System.out.println("Minimum Difference for Test 5: " + distribute(test5, m5));
		System.out.println("Minimum Difference for Test 6: " + distribute(test6, m6));
		System.out.println("Minimum Difference for Test 7: " + distribute(test7, m7));
		

	}

	// Post: Returns the minimum difference of distributing the chocolates or -1 if
	// the boxes cannot be distributed
	public static int distribute(int[] arr, int m) {
		//TODO

		return 0;
	}

}
