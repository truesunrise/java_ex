package ch6;

class TvTest2 {
    public static void main(String[] args) {
        // 인스턴스는 참조변수를 통해서만 다룰 수 있으면, 참조변수의 타입은 인스턴스의 타입은 일치해야한다.
        // Tv t1;   t1 = new Tv(); 를 한 문장으로 가능
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다.");

        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");
    }
}