package ch4;

import java.util.*;

/**
 * 중첩 if문: if문 블럭 내에 또 다른 if문을 포함시키는 것
 * 중첩의 횟수에는 거의 제한이 없다.
 */
public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.print("점수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다. %n", score);

        if(score >= 90) {           // score가 90점 보다 크거나 같으면 A학점
            grade = 'A';
            if(score >= 98) {       // 90점 이상 중에서도 98점 이상 = A+
                opt = '+';
            } else if(score < 94) { // 90점 이상 94점 미만 = A-
                opt = '-';
            }
        } else if(score >= 80) {    // 80점 보다 크거나 같으면 B학점
            grade = 'B';
            if(score >= 88) {       // 80점 이상 중에서도 88점 이상 = B+
                opt = '+';
            } else if(score < 84) { // 80점 이상 84점 미만 = B-
                opt = '-';
            }
        } else {    // 나머지는 C학점
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}
