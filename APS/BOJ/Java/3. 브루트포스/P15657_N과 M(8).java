import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
  
    static int n, m;
    static int[] arr;
    static int[] nums;
    static StringBuilder sb = new StringBuilder();
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
      
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
      
        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
      
        arr = new int[m];
        dfs(0, 0);
        System.out.println(sb);
    }
    private static void dfs(int start, int depth) {
        if(depth == m) {
            for(int a : arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
       
        for(int i = start ; i < n ; i++) {
            arr[depth] = nums[i];
            dfs(i, depth+1);
        }
    }
}
