import java.util.Scanner;

public class P13772 {
	static int[][] arr;
	static int N, P, sumV;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1; tc<= T; tc++) {
			N = sc.nextInt();
			P = sc.nextInt();
			sumV =0;
			arr= new int[N][N];
			for(int i =0; i<N; i++) {
				for(int j =0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int r = 0; r<N; r++) {
				for(int c = 0; c<N; c++) {
					// 최댓값 비교
					sumV = Math.max(sumV, Math.max(solvePlus(r, c), solveX(r, c)));
				}
			}
			System.out.println("#"+tc+" "+sumV);
		}

	}
	// + 형태로 폭탄이 터졌을 때의 값
	public static int solvePlus(int r, int c) {
		int plusSum = arr[r][c];
		for(int p = 1; p <= P; p++) {
			// 범위를 벗어나지 않을 때, 값을 더한다.
			if(c-p>=0) 	plusSum += arr[r][c-p];
			if(c+p<N) 	plusSum += arr[r][c+p];
			if(r-p>=0)  plusSum += arr[r-p][c];
			if(r+p<N)	plusSum += arr[r+p][c];
		}
		return plusSum;
	}
	// x 형태로 폭탄이 터졌을 때의 값
	public static int solveX(int r, int c) {
		int xSum = arr[r][c];
		for(int p = 1; p <= P; p++) {
			// 범위를 벗어나지 않을 때, 값을 더한다.
			if(r-p>=0 && c-p>=0)  xSum += arr[r-p][c-p];
			if(r+p<N && c+p<N) 	  xSum += arr[r+p][c+p];
			if(r-p>=0 && c+p <N)  xSum += arr[r-p][c+p];
			if(r+p<N && c-p>=0)	  xSum += arr[r+p][c-p];
		}
		return xSum;
	}
}
