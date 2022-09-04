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
            if(t == 0) break;
            boolean isProve = false;
            sb.setLength(0);
            for(int a = 3; a <= t/2; a+=2) {
                int b = t-a;
                if(b%2 != 0 && !isNotPrime[a] && !isNotPrime[b]){
                    sb.append(t).append(" = ").append(a).append(" + ").append(b);
                    System.out.println(sb.toString());
                    isProve = true;
                    break;
                }
            }
            if(!isProve) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
