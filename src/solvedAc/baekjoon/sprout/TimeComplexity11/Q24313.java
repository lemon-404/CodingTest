package solvedAc.baekjoon.sprout.TimeComplexity11;

import java.util.Scanner;

/**
 * 제목: 알고리즘 수업 - 점근적 표기법
 * 문제 링크: https://www.acmicpc.net/problem/24313
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간:
 *
 * 1. 문제 풀이 전략
 * f(n) <= c * g(n)
 * a1*n + a0 <= c * n
 * a0 <= (c-a)n
 * 이므로 c>=a 여야 수식이 성립한다.
 * a1, a0은 음수일수도 있다. (절대값 범위 표현)
 *   c와 n0는 항상 양수이다.
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

public class Q24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if (a1 * n0 + a0 <= c * n0 && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
