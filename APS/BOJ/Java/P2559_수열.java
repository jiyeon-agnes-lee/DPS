import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] temp = new int[N];
		for(int i =0; i<N; i++) {
			temp[i] = sc.nextInt();
		}
        // 음수가 있으므로, 정수의 최솟값으로 초기화
		int maxV = Integer.MIN_VALUE;
		// 뒤에 K-1개만큼 더 뽑아야 하므로, N-(K-1)
		for(int i = 0; i<N+1-K; i++) {
			int sumV = 0;
			for(int j = 0; j < K; j++) {
				sumV += temp[i+j];
			}
			if(sumV > maxV) maxV = sumV;
		}	
		System.out.println(maxV);
		sc.close();
	}
}