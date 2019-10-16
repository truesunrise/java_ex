package ch4;

import java.util.*;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예: 12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while(num != 0) {
            // num을 10으로 나눈 나머지를 sum에 더함
            // sum = sum + num%10
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            // num을 10으로 나눈 값을 다시 num에 저장
            // num = num / 10;
            num /= 10;
        }
        // 어떤 수를 10으로 나머지 연산하면 마지막 자리를 얻을 수 있다.
        // ex) 12345 % 10 = 5
        // 어떤 수를 10으로 나누면 마지막 한 자리가 제거 된다.
        // ex) 12345 / 10 = 1234
        System.out.println("각 자리수의 합: " + sum);
    }
}
