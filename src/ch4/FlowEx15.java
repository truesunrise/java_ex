package ch4;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*1 \t 2*1-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("----------------------------------------------");

        // 2*1(짝수), 2*1-1(홀수), 11-i(역순), i%3(순환), i/3(반복)
        // %(나머지 연산자)를 사용하면 특정 범위의 값들이 순환하면서 반복되는 결과를 얻을 수 있다.
        // /(나누기 연산자)는 같은 값이 연속적으로 반복되게 할 수 있다.
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",
                    i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
        }
    }
}
