package ch6;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // 1. change 메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사됨
        // 이제 매개변수 d에 저장된 주소값으로 x에 접근이 가능
        change(d);

        // 3. change 메서드가 종료되면서 매개변수 d는 스택에서 제거됨
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data d) {  // 참조형 매개변수
        // 2. change 메서드에서 매개변수 d로 x의 값을 1000으로 변경
        // change 메서드를 호출한 후에 d.x의 값이 변경되었다.
        // change 메서드의 매개변수가 참조형이라서 값이 아니라 '값이 저장된 주소'를 change 메서드에게 넘겨주었기 때문에 값을 읽어오는 것 뿐만 아니라 변경하는 것도 가능
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}