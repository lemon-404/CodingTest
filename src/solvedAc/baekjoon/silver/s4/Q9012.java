package solvedAc.baekjoon.silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 제목: 괄호
 * 문제 링크: https://www.acmicpc.net/problem/9012
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 30
 *
 * 1. 문제 풀이 전략
 * 괄호가 VPS인지 알아야 한다.
 * stack을 써야될듯?
 * stack에 "("일떄 push하고 ")"일떄 pop하면 될듯
 *
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

public class Q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Deque stack = new ArrayDeque();
        for (int i = 0; i < t; i++) {
            boolean isVfs = true;
            String[] split = br.readLine().split("");


            for (int j = 0; j < split.length; j++) {
                String key = split[j];

                if (key.equals("(")) {
                    stack.add(key);
                } else if (stack.isEmpty()) {
                    isVfs = false;
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty() && isVfs) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();

        }

    }
}
