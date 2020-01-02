package ch6;

/**
 * 참조형 반환타입
 *
 * - 반환타입이 '참조형' = 메서드가 '객체의 주소'를 반환한다는 것을 의미
 * - copy 메서드에서 생성한 객체를 main 메서드에서 사용할 수 있으려면 생성한 객체의 주소를 반환해줘야 한다.
 *   그렇지 않으면, copy 메서드가 종료되면서 새로운 객체의 참조가 사라지기 때문에 더 이상 이 객체를 사용할 수 없다.
 */
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        // 1. copy 메서드를 호출 => 참조변수 d의 값(객체 주소)이 매개변수 d에 복사된다.
        // 3. copy 메서드가 종료 => 반환된 tmp의 값이 참조변수 d2에 저장된다.
        // 4. copy 메서드가 종료되어 tmp가 사라졌지만, d2에 저장된 값으로 새로운 객체를 다룰 수 있다.
        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d) {
        // 2. 새로운 객체를 생성 후, d.x에 저장된 값을 tmp.x에 복사한다.
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
