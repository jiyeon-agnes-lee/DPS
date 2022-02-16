import java.util.Scanner;

public class P2817 {
	// 사용되었는지 여부 배열
	static boolean[] sel;
	// 입력받을 자연수 배열
	static int[] arr;
	// 부분집합의 합이 K인 경우의 수
	static int ans;
	// 입력 받을 자연수 배열의 크기 N
	static int N;
	// 입력 받을 부분집합의 합 K
	static int K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스의 개수
		int T = sc.nextInt();
		// 반복
		for(int x =1; x <= T; x++) {
			ans =0;
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[N];
			sel = new boolean[N];
			for(int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
			}
			// idx가 0인 것 부터 실행
			subsetSum(0);
			// 결과 출력
			System.out.println("#"+x+" "+ans);
		}
	}
	public static void subsetSum(int idx) {
		if(idx == N) {
			// 각 부분집합의 합을 구하기 위한 변수 선언
			int sum = 0;
			// 반복문 -> 사용되었으면 부분집합의 합에 더해준다.
			for(int i =0; i < N; i++) {
				if(sel[i]) sum += arr[i];
			}
			// 만약 그 합이 K와 같으면 경우의 수를 하나 증가시킨다.
			if(sum == K) ans++;
		}else {
			// 사용한다.
			sel[idx] = true;
			// one depth 더 들어간다.
			subsetSum(idx+1);
			// 사용하지 않는다.
			sel[idx] = false;
			// one depth 더 들어간다.
			subsetSum(idx+1);
		}
	}
}
