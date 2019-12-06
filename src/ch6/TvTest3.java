package ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        // 1)
        // t1이 저장하고 있는 주소값을 t2에 저장
        // t2는 t1이 참조하고 있던 인스턴스를 같이 참조하게 된다.
        // t2가 원래 참조하고 있던 인스턴스는 더 이상 사용할 수 없게 된다.
        // 자신을 참조하고 있는 참조변수가 하나도 없는 인스턴스는 더 이상 사용되어질 수 없으므로 '가비지 컬렉터'에 의해 메모리에서 자동적으로 제거된다.

        // 2)
        // 참조변수에는 하나의 주소값만이 저장될 수 있음 => 2개 이상의 참조변수가 하나의 인스턴스를 가리키는(참조하는) 것은 가능
        // 그러나 하나의 참조변수가 여러 개의 인스턴스를 가리키는 것은 불가능능
       t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}
