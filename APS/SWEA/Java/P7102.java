import java.util.Scanner;

public class P7102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			// 카드번호 == 카드 값
			// 자주 나오는 값은 작은 배열의 크기 +1 ~ 큰 배열의 크기 +1
			// 작은 배열의 크기를  N, 큰 크기를 M이라 두겠다.
			if(N > M) {
				int tmp = N;
				N = M;
				M = tmp;
			}
			System.out.print("#"+tc);
			for(int i=N+1; i<= M+1; i++) System.out.print(" "+i);
			System.out.println();
		}
	}

}
