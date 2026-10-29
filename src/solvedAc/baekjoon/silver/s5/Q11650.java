package solvedAc.baekjoon.silver.s5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 좌표 정렬하기
 * 문제 링크: https://www.acmicpc.net/problem/11650
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 17
 *
 * 1. 문제 풀이 전략
 * x내림 차순 정렬은 하는데
 *  x가 같은 시 y기준 내림 차순 정렬을 한다.
 *  정렬 알고리즘을 써야할 것 같은데
 *  1<=N <=100,000이므로 O(n^2)이하의 정렬 알고리즘을 사용해야 된다.
 *
 *  Arrays.sort()는 O(nlogn)의 최대/최소/평균 시간복잡도를 가진다.
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

public class Q11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] a = new int[t][2];
        for (int i = 0; i < t; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, (a1, a2) ->
        {
            if (a1[0] == a2[0]) {
                return a1[1] - a2[1];
            } else {
                return a1[0] - a2[0];
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(String.format("%d %d", a[i][0], a[i][1]));
        }
    }
}
