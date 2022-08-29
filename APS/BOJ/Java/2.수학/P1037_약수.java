import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
    int[] inputs = new int[T]; 
		for(int i = 0 ; i < T; i++){
      inputs[i] = Integer.parseInt(st.nextToken());
    }
    // 1과 N을 제외한 약수이므로, 약수를 정렬하여 제일 작은 수와 제일 큰 수를 곱하면 구하고자 하는 N이 된다.    
    Arrays.sort(inputs); 
    System.out.println(inputs[0] * inputs[T-1]);
	}
 
}
