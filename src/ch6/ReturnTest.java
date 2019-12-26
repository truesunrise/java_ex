package ch6;

/**
 * 반환값이 있는 메서드 => 반환값이 없는 메서드
 * 메서드는 단 하나의 값만 반환할 수 있지만 이런 방법을 이용하면 여러 개의 값을 반환 받는 것 같은 효과를 얻을 수 있다.
 */
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = { 0 };      // 배열을 생성하고 result2[0]의 값을 0으로 초기화
        r.add(3, 5, result2);  // 배열을 add 메서드의 매개변수로 전달
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
    }
}
