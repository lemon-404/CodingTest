package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//이전에 푼 문제인데도 33분 걸림
/**
 * 제목: 그룹 단어 체커
 * 문제 링크: https://www.acmicpc.net/problem/1316
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 33
 *
 * 1. 문제 풀이 전략
 *  그룹 단어를 어떻게 판단할까?
 *  1. base char 를 먼저 뽑는다. (단, 중복되지 않은 char여야 한다.)
 *  2. base와 똑같으면 pass  후 count++
 *  3. base와 다른 문자가 나오면 base change 후 before base char는 배열에 저장
 *  4. 종복된 문자열 나올 시 count 출력 후 종료
 *
 *  => 알파벳 배열을 선언하여 알파벳이 바뀌는 순간 boolean[c] 를 true 선언하고 boolean[c]==true이면 그룹 단어가 아니다.
 *2
 *  예외 케이스
 *
 *  반례
 *
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 *
 *
 */

public class Q1316 {
    public static void main(String[] args) throws IOException {

/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count=N;

        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[26];
            String str = br.readLine();
            char prev = str.charAt(0);
            check[prev - 'a'] = true;

            for (int j = 1; j < str.length(); j++) {
                char now = str.charAt(j);

                if (now != prev) {

                    if (check[now - 97] == false) {
                        check[now - 97] = true;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);*/

        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());
        int cnt=0;
        for (int i = 0; i < t; i++) {
            String s = bufferedReader.readLine();
            if (isGroupString(s)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    private static boolean isGroupString(String s) {
        boolean[] booleans = new boolean[26];
        char prev = s.charAt(0);
        for (int j = 1; j < s.length(); j++) {
            char now = s.charAt(j);
            if (now != prev) {
                if (!booleans[now - 'a']) {
                    booleans[prev - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
