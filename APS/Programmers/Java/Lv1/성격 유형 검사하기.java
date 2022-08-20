class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] cnt = new int[8];
        int st = 0;
        int nd = 0;
        for(int i = 0; i < survey.length; i++) {
            st = searchIdx(survey[i].charAt(0));
            nd = searchIdx(survey[i].charAt(1));
            if(choices[i] < 4)
                cnt[st] += 4 - choices[i];
            else if(choices[i] > 4)
                cnt[nd] += choices[i] - 4;
        }
        for(int i = 0; i < 8; i+= 2)
            sb.append(cnt[i] >= cnt[i+1] ? types[i] : types[i+1]);
        answer = sb.toString();
        return answer;
    }
    private int searchIdx(char c) {
        int idx = 0;
        switch(c) {
            case 'R':
                idx = 0;
                break;
            case 'T':
                idx = 1;
                break;
            case 'C':
                idx = 2;
                break;
            case 'F':
                idx = 3;
                break;
            case 'J':
                idx = 4;
                break;
            case 'M':
                idx = 5;
                break;
            case 'A':
                idx = 6;
                break;
            case 'N':
                idx = 7;
                break;
        }
        return idx;
    }
}
