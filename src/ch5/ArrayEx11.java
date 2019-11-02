package ch5;

/**
 * 배열의 활용
 *
 * - 빈도수 구하기
 *      1. 길이가 10인 배열을 만들고 0~9 사이의 임의의 값으로 초기화
 *      2. 이 배열에 저장된 각 숫자가 몇 번 반복해서 나타나는지를 세어 다른 배열에 담는다.
 */
public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];    // int형 배열은 생성될 때, 0으로 초기화

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);     // 0~9 사이의 임의의 수를 배열에 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i = 0; i < numArr.length; i++) {
            // 배열 numArr에 저장된 값과 일치하는 인덱스에 '해당 인덱스에 저장된 값 + 1' 한 값을 저장
            // ex) numArr[0] = 4, counter[4] = counter[4] + 1
            // 이 과정을 반복하면 배열 counter의 각 요소에 해당 인덱스 값이 몇 번 나타났는지 알 수 있다.
            counter[numArr[i]]++;
        }

        for(int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수: " + counter[i]);
        }
    }
}
