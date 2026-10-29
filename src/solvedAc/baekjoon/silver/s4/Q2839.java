package solvedAc.baekjoon.silver.s4;

import java.util.Scanner;

/**
 * 제목: 설탕 배달
 * 문제 링크: https://www.acmicpc.net/problem/2839
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 21
 *
 * 1. 문제 풀이 전략
 *  최소 설탕 봉지 갯수를 출력한다.
 *  봉지 무게는 3K, 5K이다.
 *  정확히 담을 수 없는 NK라면 -1을 출력한다.
 *
 *  5K로 나눈 나머지가 3K로 나누어 지는 경우 5K로 나눈 몫과 나눈 나머지를 3K로 나눈 몫을 더하여 출력
 * 3K로만 나누어 지는 경우 3으로 나누면서 5K가 가능한지 조건문을 통해 N 나누기
 *
 *
 *
 *  1. 조건문 : N/5&3 >0
 *  2. while (N!=0)
 *  3.
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
 *  3,5K봉지를 담을 수 있으면 담을 수 있는 만큼 담은 봉지의 최소 갯수를 출력하는거고  아예 안될떄만 -1 출력이다.
 *  11k -> 5k + 3K + 3K로 된다. 단순 로직 오류
 *  한번에 봉지를 쓸어 담는 구조인데 하나씩 설탕을 봉지에 담아가며 줄인다고 생각하면 쉽다.
 *
 * 
 */

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while (n != 0) {
            if (n % 5 == 0) {
                cnt+=n/5;
                n %= 5;
                break;
            }
            if (n < 3) {
                System.out.println(-1);
                return;
            }
            n -= 3;
            cnt++;

        }

        System.out.println(cnt);

    }
}
