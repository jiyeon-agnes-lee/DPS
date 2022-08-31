import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
class Main {	
    public static void main(String[] args) throws Exception { 		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());		
        int maxV = 1;
        long fx[] = new long[1000001]; // 해당 자연수의 모든 약수를 더한 변수.		
        long gx[] = new long[1000001]; // 해당 자연수 이하의 모든 fx값을 더한 변수.				
        for(int i = 1; i < 1000001; i++){
            fx[i] = 1;
        }
        // 테스트 케이스의 효율성을 위해 미리 모든 n의 약수의 합을 구하자 !
        // 1은 약수가 1 뿐이니 2부터 !
        for(int i = 2; i < 1000001; i++) {
          for(int j = 1; j*i < 1000001; j++) { 
            // 배수 = i를 약수로 갖고있는 값
            //만약 약수(i)가 2라면, 2의 배수인 2 4 6...이 약수(i) 2를 가지고 있다.
            //배수 값들을 구하기 위해 약수를 1부터 곱해준다. 
            //그럼 각 인덱스에 약수들이 더해져서 f(1...N)이 될 것이다.
            fx[j*i] += i; 
          }
        }
        // 약수의 합을 누적합으로 !
        // f(1...N)을 누적하여 덧셈한 값을 sum의 각 인덱스에 할당한다.
        for(int i = 1; i < 1000001; i++){
          // 이전 누적 값 + 현재 값의 약수의 합
          gx[i] = gx[i-1] + fx[i];      
        }
        // 테스트 케이스 수만큼 반복해서 g(N)을 출력한다.
        while(t-- > 0) {
          int n = Integer.parseInt(br.readLine());
          bw.write(gx[n]+"\n");
        }
        //buffer에 저장했다가 한번에 stream에 출력.
        bw.flush();
    }
}
