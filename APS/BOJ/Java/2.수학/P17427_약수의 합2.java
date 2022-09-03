import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        long[] fx = new long[1000001];
        long[] gx = new longa[1000001];
        
        for(int i = 0; i < 1000001; i++){
            fx[i] = 1;
        }
        
        for(int i = 2 ; i < 1000001; i++) {
            for(int j = 1; j*i < 1000001; j++){
                fx[j*i] += i;
            }
        }
        
        for(int i = 1; i < 1000001; i++){
            gx[i] = gx[i-1] + fx[i];
        }
        int t = Integer.parseInt(br.readLine());
        System.out.println(gx[t]);
    }
}
