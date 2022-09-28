import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[] ts;
    static int[] ps;
    static int n;
    static int maxV;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        ts = new int[n];
        ps = new int[n];
        maxV = 0;
        for(int i = 0 ; i < n ; i++) {
            st = new StringTokenizer(br.readLine());
            ts[i] = Integer.parseInt(st.nextToken());
            ps[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        System.out.println(maxV);
    }
    public static void dfs(int start, int payV) {
        if(start >= n) {
            maxV = maxV < payV ? payV : maxV;
            return;
        }
        if(start+ts[start] <= n)
            dfs(start+ts[start], payV + ps[start]);
        else dfs(start+ts[start], payV);
        dfs(start+1, payV);
    }
}
