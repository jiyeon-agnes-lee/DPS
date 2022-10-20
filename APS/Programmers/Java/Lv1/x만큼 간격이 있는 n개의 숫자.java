class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long xlong = x;
        for(int i=0;i<n;i++){
            answer[i] = xlong;
            xlong += x;
        }
        return answer;
    }
}
