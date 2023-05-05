package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cinp = sc.next().charAt(0);
		int inp = sc.nextInt();
		sc.close();

		if (cinp == 'M' && inp >= 18) {
			System.out.println("MAN");
		} else if (cinp == 'M' && inp < 18) {
			System.out.println("BOY");
		} else if (cinp == 'F' && inp >= 18) {
			System.out.println("WOMAN");
		} else {
			System.out.println("GIRL");
		}

	}

}
