import java.util.Scanner;

public class OddSelection {

	public static void main(String[] hadouken) {
		final Scanner in = new Scanner(System.in);
		final int l1 = in.nextInt();

		int j, p;

		for (int i = 0; i < l1; i++) {
			int n = in.nextInt();
			int x = in.nextInt();
			int odd = 0;
			int even = 0;

			if (l1 > 100) {
				break;
			} else if (n > 1000 || x >= 1000) {
				break;
			}

			int[] arr = new int[n];

			for (j = 0; j < n; j++) {
				int el = in.nextInt();
				if (el > 1000) {
					break;
				} else {
					arr[j] = el;
					if (arr[j] % 2 == 0) {
						even++;
					} else {
						odd++;
					}
				}
			}

			int flag = 0;
			for (j = 1; j <= x; j += 2) {
				p = x - j;

				if (j <= odd && p <= even) {
					flag = 1;
					break;
				}
			}

			if (flag == 1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		in.close();
	}
}