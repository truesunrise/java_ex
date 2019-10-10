package ch4;

import java.util.*;

/**
 * switch문:
 *  - 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있다.
 *  - break문은 각 case문의 영역을 구분하는 역할
 *  - 만일 break문을 생략하면 case문 사이의 구분이 없어지므로 다른 break문을 만나거나 switch문 블럭의 끝을 만날 때까지 나오는 모든 문장을 수행
 *
 * if문: 조건식의 결과가 참/거짓 밖에 없기 때문에 경우의 수가 많아질수록 조건식이 많아져 복잡 => 여러 조건식을 계산해야하므로 처리시간이 많이 걸림
 *
 * 처리할 경우의 수가 많은 경우에 if문보다 switch문으로 작성하는 것이 좋다.
 * 하지만 switch문은 제약조건이 있기 때문에 경우의 수가 많아도 어쩔 수 없이 if문으로 작성해야 하는 경우가 있다.
 *
 * 제약조건
 * 1. Switch문의 조건식 결과는 정수 or 문자열
 * 2, case문의 값은 정수 상수만 가능하며 중복 X
 */
public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            default:
//            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }   // main 끝
}
