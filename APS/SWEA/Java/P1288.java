import java.util.HashSet;
import java.util.Scanner;

public class P1288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		// 테스트 케이스 반복
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			// 10개의 숫자를 세기 위한 셋(중복 안됨)
			HashSet<Character> set = new HashSet<Character>();
			// 몇번 째 숫자인지 확인하기 위한 변수 
			int num = 0;
			// 중복되지 않은 숫자가 들어왔는지 확인하고자 하는 셋 사이즈
			int size = 0;
			// num번째 숫자
			String nowN = "";
			while(size < 10) {
				if(size == 10) break;
				// 반복 1번하면 ++
				num++;
				// 현재 숫자
				nowN = String.valueOf(num * N);
				// 각 자리의 숫자 추가
				for(int i =0; i < nowN.length(); i++) {
					set.add(nowN.charAt(i));
				}	
				// 중복은 알아서 제거되므로, 크기 변동을 확인해서 반복문을 멈추도록 한다.
				size = set.size();	
			}
			System.out.println("#"+tc+" "+nowN);
		}
		sc.close();
	}
}
