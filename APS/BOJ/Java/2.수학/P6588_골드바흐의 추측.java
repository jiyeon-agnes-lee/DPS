import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        boolean[] isNotPrime = new boolean[1000001];
        isNotPrime[0] = isNotPrime[1] = true;
        for(int i = 2; i < 1000001; i++){
            if(!isNotPrime[i]){
                for(int j = i*2; j < 1000001; j+= i){
                    isNotPrime[j] = true;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int t = sc.nextInt();
            if(t == 0) {
                System.out.println(sb.toString());
                break;
            }
            boolean isProve = false;
            for(int a = 3; a <= t/2; a+=2) {
                int b = t-a;
                if(b%2 != 0 && !isNotPrime[a] && !isNotPrime[b]){
                    sb.append(t).append(" = ").append(a).append(" + ").append(b).append("\n");
                    isProve = true;
                    break;
                }
            }
            if(!isProve) {
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }
        }
    }
}
