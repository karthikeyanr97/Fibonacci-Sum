import java.util.Scanner;

public class FibonacciSum extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of series:");
		int number = scanner.nextInt();

		int result = getSumOfNfibos(number);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static int getSumOfNfibos(int number) {

		int first = 0, second = 1;
		int sum = 0;

		for (int i = 0; i < number; i++) {

			int third = first + second;
			sum += first;
			first = second;
			second = third;

		}

		return sum;

	}

}
