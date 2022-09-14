import java.io.BufferdReader;
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
        dfs(0);
        // 모든 출력값 모아서 한 번에 출력함.
        System.out.println(sb);
    }
    private static void dfs(int depth){
        // 원하는 개수 만큼 뽑았으면 출력
        if(depth == m){
            for(int a : arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        // 아직 덜 뽑았으면 순차적으로 방문처리
        for(int i = 0 ; i < n ; i++) {
            // 해당 노드 방문 X
            if(!visited[i]) {
                visited[i] = true; // 방문처리
                arr[depth] = i+1; // 뽑은 수 저장(인덱스의 시작이 0인 이유로 +1)
                dfs(depth+1); // 다음 자식 노드 방문을 위해 뽑은 개수++ 후 재귀 호출
                visited[i] = false // 다시 미방문 처리  
            }
        }
    }
}
