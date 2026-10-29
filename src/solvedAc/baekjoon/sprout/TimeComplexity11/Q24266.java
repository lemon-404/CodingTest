package solvedAc.baekjoon.sprout.TimeComplexity11;

import java.util.Scanner;

/**
 * 제목: 알고리즘 수업 - 알고리즘의; 수행시간 5
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
 * Math.pow는 double형으로 계산하고 리턴하는데,
 * 너무 큰 long 숫자는 double 형으로 표현시 오차범위가 존재.
 *
 * 
 */

public class Q24266 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        long n = sc.nextLong();
//        System.out.println(n * n * n);
//        System.out.println(3);
//        sc.close();
        long n = 9_999_999L;

        long a = n * n;
        long b = (long) Math.pow(n, 2);

        System.out.println("n * n       = " + a);
        System.out.println("Math.pow    = " + Math.pow(n, 2));
        System.out.println("(long)pow   = " + b);
        System.out.println("같은가?     = " + (a == b));
        /*
        n * n       = 99999980000001
        Math.pow    = 9.9999980000001E13
        (long)pow   = 99999980000001
        같은가?     = true
        코테에서는 문제가 생기는 듯 정수형 제곱은 n*n을 사용하는게 좋다.
         */
    }
}
