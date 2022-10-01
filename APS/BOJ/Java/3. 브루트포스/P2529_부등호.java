import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    static int n;
    static boolean[] visited;
    static String[] str;
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        str = new String[n];
        for(int i = 0 ; i < n ; i++) {
            str[i] = st.nextToken();
        }
        visited = new boolean[10];
        dfs("", 0);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(list.size()-1)).append("\n").append(list.get(0));
        System.out.println(sb);
    }
    
     private static boolean compare(int a, int b, String str) {
        if (str.equals("<")) return a < b;
        else return a > b;
    }
    
    public static void dfs(String num, int depth) {
        if(depth == n+1) {
            list.add(num);
            return;
        }
        for(int i = 0 ; i <= 9; i++) {
            if(depth == 0 || !visited[i] && compare(num.charAt(num.length() - 1) - '0', i, str[depth - 1])) {
                visited[i] = true;
                dfs(num+i, depth+1);
                visited[i] = false;
            }
        }
    }
}
