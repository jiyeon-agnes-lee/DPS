import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dp = new int[11];
        dp[1] = 1; // 1은 1
		    dp[2] = 2; // 2는 1+1, 2
		    dp[3] = 4; // 3은 1+1+1, 1+2, 2+1, 3
		
		    for(int i = 4;i <= 10; i++) { // 4부터 반복
		      dp[i] = dp[i-3] + dp[i-2] + dp[i-1]; // 점화식
		    }
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t =1; t <= tc; t++){
            int n = sc.nextInt();
            System.out.println(dp[n]); 
        }
    }
}
