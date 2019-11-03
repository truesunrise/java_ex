package ch5;

/**
 * String 배열
 */
public class ArrayEx12 {
    public static void main(String[] args) {
        // 1. String 타입의 값 3개를 저장할 수 있는 배열의 참조변수를 저장하기 위한 공간이 마련
        // 2. 참조형 변수의 기본값은 null이므로 각 요소의 값은 null로 초기화
        // # null: 어떠한 객체도 가리키고 있지 않다는 뜻
        String[] name1 = new String[3];

        // 특별히 String class만 "Kim"과 같이 큰따옴표만으로 간략히 표현하는 것이 허용되지만
        // 원래 String은 class이므로 new 연산자를 통해 객체를 생성해야한다.
        String[] name2 = new String[] {"Kim", "Park", "Yi"};
        String[] name3 = {"Kim", "Park", "Yi"};

        // 기본형 배열이 아니고 참조형 배열(객체 배열)인 경우 배열에 저장되는 것은 객체의 주소이다.
        // 참조형 변수에는 객체가 메모리에 저장된 주소인 4byte의 정수 값(0x0~0xffffffff) or null이 저장

        String[] names = {"Kim", "Park", "Yi"};

        for(int i = 0; i < names.length; i++)
            System.out.println("names[" + i + "]: " + names[i]);

        String tmp = names[2];      // 배열 names의 세번째 요소를 tmp에 저장
        System.out.println("tmp: " + tmp);
        names[0] = "Yu";    // 배열 names의 첫번째 요소를 "Yu"로 변경

        for(String str : names)     // 향상된 for문
            System.out.println(str);
    }
}
