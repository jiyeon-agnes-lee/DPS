class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] cArr = s.toCharArray();
        int idx = 0;
        for(int i = 0; i < cArr.length;i++) {
            if(cArr[i] == ' '){
                sb.append(" ");
                idx = 0;
                continue; 
            }
            if(idx % 2 == 0)
                sb.append(Character.toUpperCase(cArr[i]));
            else 
                sb.append(Character.toLowerCase(cArr[i]));
            idx++;
        }
        answer = sb.toString();
        return answer;
    }
}
