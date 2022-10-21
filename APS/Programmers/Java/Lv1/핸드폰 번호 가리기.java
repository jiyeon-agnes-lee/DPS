class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int pnum = phone_number.length();
        String lastnum = phone_number.substring(pnum-4,pnum);
        for(int i =0;i<pnum-4;i++){
            answer += "*";
        }
        answer = answer+lastnum;
        return answer;
    }
}
