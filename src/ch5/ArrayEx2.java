package ch5;

import java.util.Arrays;

/**
 * 배열의 길이
 *
 * 1. int 범위의 양의 정수(0도 포함)이어야 한다.
 * 2. int[] arr = new int[0]; : 길이가 0인 배열도 생성이 가능하다. (= 값을 저장할 수 있는 공간이 하나도 없음)
 * 3. JVM이 모든 배열의 길이를 별도로 관리 => '배열이름.length'를 통해서 배열의 길이를 알 수 있다.
 * 4. 배열은 한번 생성하면 길이를 변경할 수 없다. => '배열이름.length'는 상수 => 값을 읽을 수만 있을 뿐 변경 X
 *    ex) int[] arr = new int[5];
 *        arr.length = 10;    에러 발생, 배열의 길이는 변경 X
 *
 * 배열의 초기화
 *
 * 1. 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화
 * 2. 원하는 값을 저장하려면 다음과 같이 배열을 간단히 초기화
 *    ex) int[] score = new int[] { 50, 60, 70, 80, 90 }; => 배열의 생성과 초기화를 동시에 함
 *        int[] score = { 50, 60, 70, 80, 90 }; => new int[]를 생략할 수 있음
 * 3. 배열의 선언과 생성을 따로 하는 경우에는 'new 타입[]'을 생략할 수 없다.
 * 4. 매개변수로 int 배열을 받는 어떤 메서드를 호출해야할 경우 역시 'new 타입[]'을 생략할 수 없다.
 *    ex) int add(int[] arr) { 내용 생략 }
 *        int result = add(new int[] { 100, 90 }); => OK
 *        int result = add({ 100, 90 }); => ERROR
 * 5. {} 안에 아무 것도 넣지 않으면, 길이가 0인 배열이 생성된다.
 *    ex) int[] score = new int[] {};
 *        int[] score = new int[0];
 *        int[] score = {};
 *
 * 배열의 출력
 *
 * 1. Arrays.toString: 배열의 모든 요소를 '[1, 2, 3]'와 같은 형식의 문자열로 반환 => 배열의 내용을 쉽게 확인
 * 2. 참조변수 출력: '타입@주소' 형식
 *    ex) [I: 1차원 int 배열
 *         @ 뒤에 오는 16진수: 배열의 내부 주소 (실제 주소 X)
 * 3. char 배열을 println 메서드로 출력 => 각 요소가 구분자없이 그대로 출력 (char 배열일 때만 이렇게 동작함)
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        // int[] iArr3 = new int[] {100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i = 0; i < iArr1.length; i++) {
            // 1~10의 숫자를 순서대로 배열에 넣는다.
            iArr1[i] = i + 1;
        }

        for(int i = 0; i < iArr2.length; i++) {
            // 1~10의 값을 배열에 저장
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");          // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));     // [6, 1, 10, 6, 4, 9, 10, 10, 8, 5]
        System.out.println(Arrays.toString(iArr3));     // [100, 95, 80, 70, 60]
        System.out.println(Arrays.toString(chArr));     // [a, b, c, d]
        System.out.println(iArr3);                      // [I@4554617c
        System.out.println(chArr);                      // abcd
    }
}
