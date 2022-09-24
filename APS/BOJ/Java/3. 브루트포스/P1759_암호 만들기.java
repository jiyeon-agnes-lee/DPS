import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static int l, c;
    static String[] alpha;
    static boolean[] visited;
    static String[] selected;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        alpha = new String[c];
        visited = new boolean[c];
        selected = new String[l]; 
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < c ; i++) {
            alpha[i] = st.nextToken();
        }
        Arrays.sort(alpha);
        dfs(0, 0);
        System.out.println(sb);
    }
    
    public static void dfs(int start, int depth) {
        if(depth == l) {
            StringBuilder tmp = new StringBuilder();
            int vowelCnt = 1;
            int consonantCnt = 2;
            for(String str : selected) {
                if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                    vowelCnt--;
                }else {
                    consonantCnt--;
                }
                tmp.append(str);
            }
            if(consonantCnt <= 0 && vowelCnt <= 0){
                sb.append(tmp.toString()).append("\n");
            }
            return;
        }
        for(int i = start; i < c; i++) {
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = alpha[i];
                dfs(i+1, depth+1);
                visited[i] = false;
            }
        }
    }
}
