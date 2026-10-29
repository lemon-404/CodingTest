package solvedAc.baekjoon.sprout.TimeComplexity11;

import java.util.Scanner;

/**
 * 제목: 알고리즘 수업 - 알고리즘의; 수행시간 6
 * 문제 링크: https://www.acmicpc.net/problem/24267
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 
 *
 * 1. 문제 풀이 전략
 * 예제에서 35가 왜 나오지?
 *  => 조합
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

public class Q24267 {
    public static void main(String[] args) {
      /*  int n=100; //n=7
        int[] A=new int[n];
        int sum = 0;
        for (int i = 0; i < n-2; i++) { //0~5
            for (int j = i+1; j < n; j++) { //i+1~6
                for (int k = j+1; k < n; k++) { //j+1~7
                    sum += A[i] * A[j] * A[k];
                }
            }
        }*/
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((n*(n-1)*(n-2)/6));
        System.out.println(3);

    }
}
