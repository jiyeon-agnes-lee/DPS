class Solution {
    public int solution(int n) {
        if(n == 0 || n == 1)
            return n;
        int answer = 0;
        int num = 1;
        while(true){
            if(n % num == 0)
                answer += num;
            num++;
            if(num == n){
                answer += n;
                break;
            }
        } 
        return answer;
    }
}
