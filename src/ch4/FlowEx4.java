package ch4;

import java.util.*;

public class FlowEx4 {
    public static void main(String[] args) {
        int score = 0;      // 점수를 저장하기 위한 변수
        char grade = ' ';   // 학점을 저장하기 위한 변수 (공백으로 초기화)

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);

        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            // 80 <= score && score > 90 라고 안 쓰는 이유:
            // 첫번째 조건식인 score >= 90 거짓  =>  score < 90 참
            // 현재 조건식에서 score < 90 이라는 조건을 중복해서 확인할 필요가 없다.
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("당신의 학점은 " + grade + " 입니다.");
    }
}
