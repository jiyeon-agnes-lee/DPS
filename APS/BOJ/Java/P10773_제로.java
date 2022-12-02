import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int ans = 0;
		for (int i = 0; i < K; i++) {
			int num = sc.nextInt();
			if (num == 0) {
				if (stack.isEmpty()) {
					stack.add(0);
				} else {
					ans -= stack.pop();		
				}
			} else {
				ans += num;
				stack.add(num);
			}
		}
		System.out.println(ans);
	}
}
