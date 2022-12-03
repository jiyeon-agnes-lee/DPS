import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
 
        Queue<Integer> queue = new LinkedList<>();
        
        // 1부터 N까지 숫자 큐에 입력
        for (int i = 1; i <= N; i++) {
        	queue.offer(i);
        }
        
        StringBuilder sb = new StringBuilder();
        // 시작 괄호 넣기
        sb.append("<");
        
        // Queue 안에 하나만 남기고 다 출력1
        while(queue.size() > 1) {
            // K - 1번째까지 반복하며 맨 앞의 값을 빼서 맨 뒤로 다시 넣는다.
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            // K번째 값은 뺀 후 출력
            sb.append(queue.poll() + ", ");
        }
        
        // Queue의 마지막 값은 출력만 하고 , 가 아닌 > 를 함께 출력.
        sb.append(queue.poll() + ">");
        System.out.println(sb.toString());
        sc.close();
    }

}
