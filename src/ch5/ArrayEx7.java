package ch5;

/**
 * 배열의 활용
 *
 * 섞기(shuffle): 배열의 요소의 순서를 반복해서 바꾼다. (카드섞기, 로또번호생성)
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = i;      // 배열을 0~9의 숫자로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);     // 0~9중의 한 값을 임의로 얻는다.

            // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
            // 두 컵에 담긴 내용물을 서로 바꾸려면 하나의 빈컵이 더 필요한 것처럼 두 변수에 저장된 값을 서로 바꾸려면 별도의 저장공간이 하나 더 필요하다. (tmp)
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
