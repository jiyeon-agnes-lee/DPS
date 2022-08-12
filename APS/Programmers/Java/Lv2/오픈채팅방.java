import java.util.HashMap;

class Solution {
    public String[] solution(String[] record) {
        // HashMap : 같은 키값일 때, put을 여러번 하면 가장 마지막 값으로 갱신된다.
        HashMap<String, String> idInfo = new HashMap();
        int len = record.length;
        // msg[] 0 : 아이디 , 1 : 메시지
        String[][] msg = new String[len][2];
        int msgCnt = 0; // 전체 출력될 메시지 개수 카운트
        for(int i = 0; i < len; i++) {
            // currMsg [] 0 : 메시지 내용 , 1 : 아이디, 2 : 닉네임 (입장과 수정에만 존재)
            String[] currMsg = record[i].split(" ");
            msg[i][0] = currMsg[1];
            switch(currMsg[0].charAt(0)) {
                case 'E':
                    msg[i][1] = "님이 들어왔습니다.";
                    msgCnt++;
                    idInfo.put(currMsg[1], currMsg[2]);
                    break;
                case 'L':
                    msg[i][1] = "님이 나갔습니다.";
                    msgCnt++;
                    break;
                case 'C':
                    msg[i][1]=""; // null값 인지를 위해
                    idInfo.put(currMsg[1], currMsg[2]);
                    break;
            }
        }
        String[] answer = new String[msgCnt];
        int idx = 0;
        // 문자열 + 하는 것보다 빠름
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < len; i++) {
            if(!msg[i][1].isEmpty()){
                answer[idx++] = sb.append(idInfo.get(msg[i][0])).append(msg[i][1]).toString();
                sb.setLength(0);
            }    
        }
        return answer;
    }
}
