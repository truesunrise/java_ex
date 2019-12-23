package ch6;

/**
 * 기본형 매개변수 & 참조형 매개변수
 *
 * - 메서드 호출할 때, 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다.
 * - 매개변수의 타입
 *      - 기본형 : 기본형 값이 복사 / 변수의 값을 읽기만 할 수 있다.
 *      - 참조형 : 인스턴스의 주소가 복사 / 변수의 값을 읽고 변경할 수 있다.
 */
public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // 1. change 메서드가 호출되면서 'd.x'가 change 메서드의 매개변수 x에 복사됨
        change(d.x);

        // 3. change 메서드가 종료되면서 매개변수 x는 스택에서 제거됨
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {     // 기본형 매개변수
        // 2. change 메서드에서 x의 값을 1000으로 변경
        // d.x 값이 변경된 것이 아니라, change 메서드의 매개변수 x의 값이 변경된 것
        // 즉, 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한다.
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}

class Data { int x; }
