import java.util.Scanner;

public class P1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		// 테스트 케이스 반복
		for(int tc = 1; tc<=T; tc++) {
			// 현 속도
			int speed = 0;
			// 이동 거리
			int distance = 0;
			// 테스트 케이스 별 명령어개수
			int N = sc.nextInt();
			for(int n = 0; n< N; n++) {
				// 명령어 별 실행
				int cmd = sc.nextInt();
				if(cmd == 1) {
					speed += sc.nextInt();
				}else if(cmd == 2) {
					speed -= sc.nextInt();
					if(speed < 0) speed = 0;
				}
				// 거리 += 속도
				distance += speed;
			}
			// 출력
			System.out.println("#"+tc+ " "+distance);
		}	
	}
}
