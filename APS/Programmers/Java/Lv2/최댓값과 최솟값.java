import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int len = arr.length;
        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            nums[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(nums);
        sb.append(nums[0]).append(" ").append(nums[len-1]);
        answer = sb.toString();
        return answer;
    }
}
