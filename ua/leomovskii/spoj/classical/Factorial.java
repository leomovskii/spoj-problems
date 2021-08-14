import java.util.Scanner;

// https://www.spoj.com/problems/FCTRL/

public class Factorial {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int countLines = sc.nextInt();
		int[] arr = new int[countLines];

		for (int i = 0; i < countLines; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < countLines; i++) {
			int result = 0;
			while (arr[i] > 0) {
				arr[i] /= 5;
				result += arr[i];
			}
			System.out.println(result);
		}
	}

}
