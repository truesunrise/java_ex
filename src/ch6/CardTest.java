package ch6;

public class CardTest {
    public static void main(String args[]) {
        // 클래스 변수(static 변수)는 객체 생성 없이 '클래스명.클래스변수'로 직접 사용 가능하다.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        // 인스턴스 변수의 값을 변경
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println(
            "c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height +")"
        );
        System.out.println(
            "c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height +")"
        );

        // 클래스 변수의 값을 변경
        // Card.width, c1.width, c2.width 는 모두 같은 저장공간을 참조하므로 항상 같은 값을 갖게된다.
        // 참조변수 c1, c2를 통해서도 클래스 변수를 사용할 수 있지만 이렇게 하면 클래스 변수를 인스턴스 변수로 오해하기 쉽기 때문에 '클래스명.클래스변수'의 형태로 사용하는 것이 좋다.
        c1.width = 50;
        c1.height = 80;

        System.out.println(
                "c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height +")"
        );
        System.out.println(
                "c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height +")"
        );
    }
}


class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}