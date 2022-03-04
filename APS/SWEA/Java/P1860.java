import java.util.Arrays;
import java.util.Scanner;

public class P1860 {
	static int N, M, K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		for(int x = 1; x <=T; x++) {
			sb.setLength(0);
			sb.append("#"+x+" ");
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
			// 랜덤으로 입장한 사람을 온 시간 순으로 줄 세워서 줄 수 있는지 확인하기
			int[] arr = new int[N]; 
			for(int n = 0; n <N; n++) {
				arr[n] = sc.nextInt();
			}
			Arrays.sort(arr);
			if(isPossible(arr)) sb.append("Possible");
			else sb.append("Impossible");
			System.out.println(sb.toString());
		}
	}
	
	public static boolean isPossible(int[] arr) {
		// 사람이 온 시간에 만들 수 있는 붕어빵 개수
		int bread = 0;
		// 그 전에 받아간 사람 있는지 체크하기
		int people = 0;
		// 사람이 왔을 때 만들어진 붕어빵 개수보다 온 사람 수가 많으면 불가능 
		for(int time : arr) {
			bread = time/M * K; //온 시간을 붕어빵 만드는데 걸리는 시간으로 나누어 주고 거기에 K개 곱하기
			if(bread <= people)  return false;
			people +=1; // 왔다간 사람 수 증가
		}
		return true;
	}

}
