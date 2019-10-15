package ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        // 1. 'i--'가 후위형이므로 조건식이 평가된 후에 i의 값이 감소된다.
        while(i-- != 0) {
            System.out.println(i + " - I can do it !");
        }

        // 위 반복문을 풀어쓰면
        // while(i != 0) {
        //     i--;
        //     System.out.println(i);
        // }

        // 2. '--i'와 같은 전위형은 감소 연산자가 조건식에서 분리되면 while문을 벗어남
        while(--i != 0) {
            System.out.println(i);
        }

        // 위 반복문을 풀어쓰면
        // --i;
        // while(i != 0) {
        //     System.out.println(i);
        // }

    }
}
