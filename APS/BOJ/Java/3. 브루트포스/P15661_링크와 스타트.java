import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[][] s;
    static int n;
    static int minV;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        minV = Integer.MAX_VALUE;
        n = Integer.parseInt(st.nextToken());
        s = new int[n][n];
        for(int i = 0; i < n ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < n ; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean[n];
        for(int i = 1; i < n/2+1; i++) {
            dfs(0, 0, i);
        }
        System.out.println(minV);
    }
    
    public static void dfs(int idx, int depth, int cnt) {
        if(depth == cnt) {
            int startTeam = 0;
            int linkTeam = 0;
            for(int i = 0 ; i < n-1; i++) {
                for(int j = i+1; j < n; j++) {
                    if(visited[i] && visited[j]){
                        startTeam += s[i][j];
                        startTeam += s[j][i];
                    }
                    else if(!visited[i] && !visited[j]) {
                        linkTeam += s[i][j];
                        linkTeam += s[j][i];
                    }
                }
            }
            int diff = Math.abs(startTeam-linkTeam);
            if(diff==0){
                System.out.println(0);
                System.exit(0);
            }
            minV = Math.min(minV, diff);
            return;
        }
        for(int i = idx; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(i+1, depth+1, cnt);
                visited[i] = false;
            }
        }
    }
}
