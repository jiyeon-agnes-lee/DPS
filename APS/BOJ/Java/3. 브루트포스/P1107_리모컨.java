import java.util.Scanner;
public class Main {
    static boolean[] broken;
    static int answer;
    static int n;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        broken = new boolean[10];
        
        if(m != 0){
            for(int i =0;i<m;i++){
                int num = sc.nextInt();
                broken[num] = true;
            }
        }
        
        if(n == 100) {
            System.out.println(0);
            return;
        }
        
        answer = Math.abs(100-n);
        
        dfs(0, "");
        
        System.out.println(answer);
    }
    public static void dfs(int len, String pushed){
        for(int i = 0; i < 10; i++){
           if(!broken[i]){
               StringBuilder sb = new StringBuilder();
               sb.append(pushed).append(i);
               String newPushed = sb.toString();
               int cnt = Math.abs(n  - Integer.parseInt(newPushed)) + newPushed.length();
               answer = answer > cnt ? cnt : answer;
               if(len < 6) dfs(len+1, sb.toString());
           }
        }
    }
}
