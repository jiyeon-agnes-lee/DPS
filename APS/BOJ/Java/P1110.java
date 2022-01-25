import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {
		// 정수 N 입력 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt =0; // 사이클의 길이
		int finalN = N; // 최종 N의 값 = 시작 입력 값 N으로 선언과 동시에 초기화
		int firstN; // 10의 자리
		int secondN; //1의 자리 
		do {
			// 10의 자리는, 10으로 나눈 몫
			firstN = finalN/10;
			// 1의 자리는 최종 N의 값을 10으로 나눈 나머지 
			secondN = finalN%10;
			// 새로운 최종 N의 값은 1의 자리가 새로운 N의 10의 자리가 되고, 
			// 10의 자리와 1의자리의 합의 1의 자리가 새로운 N의 1의 자리가 된다.
			finalN = secondN *10 + (firstN+secondN)%10;
			// 사이클을 하나 증가 시킨다.
			cnt++;
		// 최종 N이 기존의 N과 동일해지면 사이클 중단(반복 중단)
		}while(finalN != N);
		// 사이클 길이 출력
		System.out.println(cnt);
	}

}
