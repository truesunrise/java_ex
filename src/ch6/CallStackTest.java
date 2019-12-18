package ch6;

/**
 * JVM의 메모리 구조
 *
 * 1. 메서드 영역 (method area)
 *  - 프로그램 실행 중 어떤 클래스가 사용되면 JVM은 해당 클래스의 클래스 파일(*.class)을 읽고 클래스에 대한 정보를 이곳에 저장
 *  - 이 때, 그 클래스의 클래스 변수도 이 영역에 함께 생성
 *
 * 2. 힙 (heap)
 *  - 인스턴스가 생성되는 공간
 *  - 프로그램 실행 중 생성되는 인스턴스는 이곳에 모두 생성
 *  - 인스턴스 변수들이 생성
 *
 * 3. 호출스택 (call stack or execution stack)
 *  - 메서드가 호출되면 호출스택 안에 호출된 메서드를 위한 메모리가 할당
 *  - 이 메모리는 메서드가 작업을 수행하는 동안 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용
 *  - 메서드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워진다.
 */
public class CallStackTest {
    /*
    * * 호출스택의 특징
    *
    * - 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당 받는다.
    * - 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
    * - 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드
    * - 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드
    */
    public static void main(String[] args) {
        firstMethod();      // static 메서드는 객체 생성없이 호출 가능하다.
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}
