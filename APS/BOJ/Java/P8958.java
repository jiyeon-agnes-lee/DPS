import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] input = new String[n];
		int[] ans = new int[n];
		
		for(int i=0;i<n;i++) {
			input[i] = sc.next();
			char[] arr = input[i].toCharArray();
			int score = 0;
			for(int j =0; j < arr.length; j++) {
				if(arr[j] == 'O') {
					score ++;
				}else {
					score = 0;
				}
				ans[i] += score;
			}
			System.out.println(ans[i]);
		}
	}
}
