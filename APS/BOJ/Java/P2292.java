import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int num = 1;
		while (true) {
			if(num >= N)
				break;
			num += 6 * cnt;
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}

