class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum=0;
        int len = arr.length;
        for(int i =0; i<len;i++){
            sum+=arr[i];
        }
        answer = Daouble.valueOf(sum);
        answer = answer/len;
        return answer;
    }
}
