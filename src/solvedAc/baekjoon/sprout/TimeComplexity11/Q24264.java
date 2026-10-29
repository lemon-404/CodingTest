package solvedAc.baekjoon.sprout.TimeComplexity11;

import java.util.Scanner;

/**
 * 제목: 알고리즘 수업 - 알고리즘의; 수행시간 3
 * 문제 링크: https://www.acmicpc.net/problem/24264
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

public class Q24264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        System.out.println((int) Math.pow(n, 2));
        System.out.println(2);
        sc.close();
    }
}
