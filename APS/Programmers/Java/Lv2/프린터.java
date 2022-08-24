import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0; 
        for (int i = 0; i < priorities.length; i++)
            pq.add(priorities[i]);
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) { // 기존의 요청과 중요도가 높은 순으로 정렬한 pq의 첫번째 입력값
                    if (i == location) { // 뽑고자 하는 문서의 차례면
                        answer++; // 출력 순서 증가 후 바로 반환
                        return answer;
                    }
                    pq.poll(); // 출력완료
                    answer++; // 출력 순서 증가 
                }
            }
        }
        return answer; // 여기 도달할 일은 없음.
    }
}
