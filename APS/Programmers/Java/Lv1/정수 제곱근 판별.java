class Solution {
    public long solution(long n) {
        long answer = -1;
        if(Math.sqrt(n)*10%10 == 0){
            long num = Double.valueOf(Math.sqrt(n)+1).longValue();
            answer = num*num;
        }
        return answer;
    }
}
