class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int i = 0 ; i < s.length(); i++) {
            if(idx == 0 && s.charAt(i) != ' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
                idx++;
                continue;
            }else if(s.charAt(i) == ' '){
                sb.append(s.charAt(i));
                idx = 0;
            }else
                 sb.append(Character.toLowerCase(s.charAt(i)));
        }
        answer = sb.toString();
        return answer;
    }
}
