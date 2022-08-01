class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int len = str.length();
        int[] answer = new int[len];
        for(int i = len-1;i >= 0;i--){
           answer[len-i-1] = str.charAt(i)-'0';
}
       
        return answer;
    }
}
