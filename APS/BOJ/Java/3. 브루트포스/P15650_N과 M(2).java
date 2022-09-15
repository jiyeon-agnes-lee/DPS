import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        visited = new boolean[n];
        arr = new int[m];
        // 재귀
        dfs(1, 0);
        // 모든 출력값 모아서 한 번에 출력함.
        System.out.println(sb);
    }
    private static void dfs(int start, int depth){
        // 원하는 개수 만큼 뽑았으면 출력
        if(depth == m){
            for(int a : arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        // 중복 없음.
        for(int i = start ; i <= n ; i++) {
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}