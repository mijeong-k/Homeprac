package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] cinp = new char[10];

		for (int i = 0; i < cinp.length; i++) {
			char cinp2 = sc.next().charAt(0);
			cinp[i] = cinp2;
			if (i == cinp.length - 1) {
				System.out.print(cinp[0] + " " + cinp[3] + " " + cinp[6]);
			}
		}
		sc.close();
	}
}
