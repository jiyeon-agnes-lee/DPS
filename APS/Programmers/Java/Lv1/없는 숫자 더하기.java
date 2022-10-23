class Solution {
    public int solution(int[] numbers) {
        // 0-9 까지의 합
        int answer = 45;
        for(int i : numbers)
            answer -= i;
        return answer;
    }
}
