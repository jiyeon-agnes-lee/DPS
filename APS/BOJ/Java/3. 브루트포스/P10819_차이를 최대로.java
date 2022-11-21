import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] visited;
    static int[] nums;
    static int max;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nums = new int[N];
        visited = new boolean[N];
        max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
		System.out.println(max);
        
	}
    public static void dfs(int depth) {
        if(depth == N) {
            int sum = 0;
            for(int i = 0; i < N-1; i++) {
                sum += Math.abs(nums[i] - nums[i+1]);
            }
            max = max > sum ? max : sum;
            return;
        }
        for(int i = 0; i < N ; i++) {
            if(!visited[i]) {
                visited[i] = true;
                nums[depth] = arr[i];
                dfs(depth+1);
                visited[i] = false;
            }
        }
    } 
}
