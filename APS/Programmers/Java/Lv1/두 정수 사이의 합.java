class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        for(long i = 0; i <= b-a;i++) {
            answer += a+i;
        }
        return answer;
    }
}
