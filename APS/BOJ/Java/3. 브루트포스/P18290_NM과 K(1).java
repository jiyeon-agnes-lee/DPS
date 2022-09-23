import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  
    static int n, m, k;
    static int maxV;
    static int[][] map;
    static int[][] visited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        maxV = Integer.MIN_VALUE;
        
        arr = new int[k];
        visited = new int[n][m];
        map = new int[n][m];
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0);
        System.out.println(maxV);
    }
    private static void dfs(int depth) {
        if(depth == k) {
            int sumV = 0;
            for(int a : arr){
                sumV += a;
            }
            maxV = maxV > sumV ? maxV : sumV;
            return;
        }
       
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < m ; j++) {
                if(visited[i][j] > 0) continue;
                visited[i][j]++;
                if(i-1 >= 0)
                    visited[i-1][j]++;
                if(i+1 < n)
                    visited[i+1][j]++;
                if(j-1 >= 0)
                    visited[i][j-1]++;
                if(j+1 < m)
                    visited[i][j+1]++;
                arr[depth] = map[i][j];
                dfs(depth+1);
                visited[i][j]--;
                if(i-1 >= 0)
                    visited[i-1][j]--;
                if(i+1 < n)
                    visited[i+1][j]--;
                if(j-1 >= 0)
                    visited[i][j-1]--;
                if(j+1 < m)
                    visited[i][j+1]--;
            }
        }
    }
}
