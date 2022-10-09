import java.util.ArrayList;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
        long num = 1;
        int idx = 0;
		for(int i = 1 ; i <= n ; i++) {
			list.add(i);
			num *= i;
		} // n! 구하기
        k--; // 0번부터 시작
        while(idx < answer.length) { // 변하지 않는 사람 수가 기준, 
        	num /= (n--);
        	int i = (int)(k/num);
        	answer[idx++] = list.get(i);
        	list.remove(i);
        	k %= num;
        }
        return answer;
    }
}
