package ch4;

import java.util.Arrays;

/**
 * 향상된 for문
 *
 * for( 타입 변수명 : 배열 또는 컬렉션 ) { 반복할 문장 }
 *
 *  - 타입: 배열 또는 컬렉션 요소의 타입이어야 한다.
 *  - 일반 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다.
 */
public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
        System.out.println();

        for(int tmp : arr) {
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum=" + sum);

        System.out.println("arr: " + Arrays.toString(arr));
        // 결과 => arr: [10, 20, 30]
    }
}
