package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		double cnt = 0;
		while (true) {
			int inp = sc.nextInt();
			sum += inp;
			cnt++;
			if (inp >= 100) {
				System.out.printf("%d\n%.1f\n", sum, (sum / cnt));
				break;
			}
		}
		sc.close();
	}
}
