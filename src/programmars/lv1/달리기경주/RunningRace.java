package programmars.lv1.달리기경주;

import java.util.HashMap;
import java.util.Map;
class RunningRace {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        // 선수 이름과 인덱스 저장
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        // 추월 처리
        for (int i = 0; i < callings.length; i++) {
            String s = callings[i];

            int j = map.get(s);
            String temp = players[j - 1];

            // HashMap 인덱스 변경
            map.put(s, j - 1);
            map.put(temp, j);

            // players 배열 순서 변경
            players[j - 1] = s;
            players[j] = temp;
        }

        // HashMap의 Value를 인덱스로 사용
        String[] answer = new String[players.length];

        for (String key : map.keySet()) {
            int index = map.get(key);
            answer[index] = key;
        }

        return answer;
    }
}
