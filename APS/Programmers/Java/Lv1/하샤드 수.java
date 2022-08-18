class Solution {
    public boolean solution(int x) {
        String xstr = Integer.toString(x);
        int sum=0;
        for (int i = 0; i < xstr.length(); i++) {
            sum += Integer.valueOf(xstr.substring(i,i+1));
        }
        return x%sum==0;
    }
}
