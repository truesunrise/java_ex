package ch4;

import java.util.Scanner;

/**
 * do - while문
 *
 * do { 조건식의 연산결과가 참일 때 수행될 문장들을 적는다. } while (조건식);
 * 끝에 ';'를 잊지 않도록 주의
 */
public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        // 1~100 사이 임의의 수를 저장
        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input != answer);

        System.out.println("정답입니다.");
    }
}
