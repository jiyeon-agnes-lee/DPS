import java.util.Scanner;

public class P2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    // 정수 N 입력받기
		int N = sc.nextInt();
    // N 개의 줄 생성
		for (int i = 0; i < N; i++) {
      // 공백은 *출력 직전까지 출력
			for (int j = 0; j < N - i - 1; j++){
				System.out.print(" ");
      }
      // *은 2*i+1개 출력
			for (int k = 0; k < 2 * i + 1; k++){
				System.out.print("*");
      }
      // 줄 바꿈
			System.out.println();
		}
		 
	}

}
