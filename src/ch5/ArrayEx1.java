package ch5;

/**
 * 배열 : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
 *
 * 1. int[] score;
 *      int형 배열 참조변수 score를 선언 (데이터를 저장할 수 있는 공간은 아직 마련 X)
 * 2. score = new int[5]
 *      2-1. 연산자 'new'에 의해서 메모리의 빈 공간에 5개의 int형 데이터를 저장할 수 있는 공간이 마련
 *      2-2. 각 배열요소는 자동적으로 int의 기본값인 0으로 초기화
 *      2-3. 대입 연산자 '='에 의해 배열의 주소가 int형 배열 참조변수 score에 저장
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;    // score[2] = 70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];    // int tmp = score[3] + score[4]

        for(int i = 0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }

        System.out.printf("tmp:%d%n", tmp);

        // index의 범위를 벗어난 값
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 7
        System.out.printf("score[%d]:%d%n", 7, score[7]);
    }
}
