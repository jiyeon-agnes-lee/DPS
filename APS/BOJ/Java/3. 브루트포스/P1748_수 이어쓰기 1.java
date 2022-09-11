import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        // 자릿수
        int cnt = Integer.toString(n).length();
        int answer = 0;
        int min = 1;
        int max = 9;
        for(int i = 1; i <= cnt; i++) {
            if(i == cnt) {
                answer += (n-min+1) * i;
                break;
            }
            answer += (max - min+1) * i;
            max = max*10 +9;
            min *= 10;
        }
        System.out.println(answer);
    } 
}
