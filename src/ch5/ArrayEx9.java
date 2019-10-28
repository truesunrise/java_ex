package ch5;

import java.util.Arrays;

/**
 * 배열의 활용
 *
 * 불연속적인 임의의 값으로 배열 채우기
 *
 * - 연속적인 범위의 임의의 값으로 배열을 채우는 것은 random()만 사용하면 됨
 * - 불연속적인 범위의 값들로 배열을 채우는 것은 배열을 하나 더 사용하면 됨 (저장된 값에 상관없이 배열의 index는 항상 연속적)
 */
public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = { -4, -1, 3, 6, 11 };      // 불연속적인 값들로 구성된 배열
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            int tmp = (int) (Math.random() * code.length);
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
