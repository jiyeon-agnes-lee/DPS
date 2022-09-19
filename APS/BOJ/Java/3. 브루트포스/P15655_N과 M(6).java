import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int[] nums;
    static int[] arr;
    static boolean[] visited;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        nums = new int[n];
        arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        dfs(0, 0);
        System.out.println(sb);
    }
    
    private static void dfs(int start, int depth) {
        if(depth == m) {
            for(int a : arr) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i = start; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[i] = nums[i];
                dfs(i, depth+1);
                visited[i] = false;
            }
        }      
    }
}
