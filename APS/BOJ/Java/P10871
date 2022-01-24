import java.util.Scanner;

public class P10871 {
// 메모리 : 39228KB, 시간 : 1040ms, 코드길이 : 938B	
	public static void main(String[] args) {
		// 정수 N, X 입력받기
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		// 정수 배열 a 는 크기가 N인 정수배열로 선언과 동시에 초기화;
		int[] a = new int[N];
		// 정답 배열 선언 및 초기화
		int[] ans = new int[N];
		// 정답 배열에 값이 저장된 만큼의 크기
		int size =0;
		// 반복문을 통해 정수 N개만큼 입력받기
		for(int i =0; i < N; i++) {
			int num = sc.nextInt();
			// X 보다 작은 숫자는 정답 배열에 순서대로 입력
			if(num < X) {
				ans[size++] = num;
			}
		}
		// 정답 배열의 크기가 값이 저장된 배열의 길이보다 길거나 같으므로, 
		// 저장해둔 size만큼 반복하여 출력문을 실행한다.
		for(int j = 0; j < size; j++) {
			System.out.printf("%d ", ans[j]);
		}
		
	}

}
