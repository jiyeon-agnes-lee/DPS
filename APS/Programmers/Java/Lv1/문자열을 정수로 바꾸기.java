class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean isMinus = false;
        if(s.charAt(0) == '+')
            s = s.substring(1, s.length());
        if(s.charAt(0) == '-'){
            isMinus = true;
            s = s.substring(1, s.length());
        }
        answer = Integer.valueOf(s);
        if(isMinus)
            answer = -answer;
        return answer;
    }
}