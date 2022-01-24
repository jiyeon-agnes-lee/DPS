import java.util.Scanner;

public class P2884 {
// 메모리 : 18528KB, 시간 : 244ms, 코드길이 : 574 B
	public static void main(String[] args) {
		// 시 분 입력 받기
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		// 45분 보다 크거나 같은 경우, H는 그대로
		if(M >= 45) {
			M = M - 45;
		// 45분 보다 작은 경우,
		}else {
			// H가 0일 경우, 23시로 변경
			if(H == 0) {
				H = 23;
			// 그 외 경우, 
			}else {
				H = H - 1;	
			}
			// M은 45분 전의 경우 -> 60 - (45-M) = 15 + M
			M = M + 15;
		}
		System.out.print(H + " " + M);
		
	}

}
