package solvedAc.baekjoon.sprout.TimeComplexity11;

import java.util.Scanner;

/**
 * 제목: 알고리즘 수업 - 알고리즘의; 수행시간 4
 * 문제 링크: https://www.acmicpc.net/problem/24265
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 
 *
 * 1. 문제 풀이 전략
 *
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

public class Q24265 {
    public static void main(String[] args) {
        /*
        // i= 1~6에 따라 j가 6~1번의 수행 홧수가 생긴다. 1~n-1까지의 합은 등차수열 합공식 n(n+1)/2
        //이 문제에 대입하면 (n-1)((n-1)+1)/2 => n(n-1)/2
        for (int i = 0; i < 7; i++) { //0~6 6 loop
            for (int j = i+1; j < 7; j++) { // i+1~7 6~1 loop
            }
        }
         */
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.println(n*(n-1)/2);
        System.out.println(2);
        sc.close();
    }
}
