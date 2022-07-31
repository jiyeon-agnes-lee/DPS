class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        if(len == 1)
            return new int[] {-1};
        int[] answer = new int[len-1];
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < min)
                min = num;
        }
        int idx = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] != min)
                answer[idx++] = arr[i];
        }
        return answer;
    }
}
