package ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("당신의 점수를 입력하세요. (1~100)>");

        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();    // return type: String
        score = Integer.parseInt(tmp);      // 입력 받은 문자열 (tmp)를 숫자로 변환

        switch(score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }   // end of switch

        System.out.println("당신의 학점은 " + grade + "입니다.");

    }
}
