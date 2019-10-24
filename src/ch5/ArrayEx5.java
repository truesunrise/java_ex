package ch5;

/**
 * 배열의 활용
 *
 * 총합과 평균: 배열의 모든 요소를 더해서 총합과 평균을 구한다.
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;            // 총점을 저장하기 위한 변수
        float average = 0f;     // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        // int와 int간의 연산은 int를 결과로 얻기 때문에 정확한 평균값을 얻지 못함 => score.length를 float로 변환하여 나눗셈
        // int와 int간의 연산: 478 / 5 = 95 (int)
        // int와 float간의 연산: 478 / 5.0f => 478.0f / 5.0f = 95.6f (float)
        average = sum / (float) score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
    }
}
