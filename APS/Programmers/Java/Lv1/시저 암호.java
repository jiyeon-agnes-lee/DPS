class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 소문자
            if(Character.isLowerCase(c))
                // 알파벳 개수 26
                c = (char) ((c - 'a' + n) % 26 + 'a');
            // 대문자 (공백 거르기 위해)
            else if(Character.isUpperCase(c))
                c = (char) ((c - 'A' + n) % 26 + 'A');
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}
