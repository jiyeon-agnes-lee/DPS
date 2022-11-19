import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static StringBuilder sb;
    static boolean[] visited;
    static int[] nums;
 
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        nums = new int[N];
        sb = new StringBuilder();
        permutation(0);
        System.out.println(sb.toString());
    }
 
    private static void permutation(int depth) {
        if(depth == N) {
            for(int i = 0; i < N; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                nums[depth] = i; 
                permutation(depth+1);
                visited[i] = false;
            }
        }
    }
}
