package ch5;

/**
 * 배열의 활용
 *
 * - 버블정렬 알고리즘을 통해 크기순으로 정렬
 * - 버블정렬: 서로 인접한 두 원소를 비교하여 크기가 순서대로 되어 있지 않으면 값을 교환한다.
 * - 버블정렬은 비효율적이지만 가장 간단
 */
public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        // 비교횟수(numArr.length - 1): 배열의  길이보다 1이 작은 값
        // ex) 배열의 길이가 5라면, 4번만 비교하면 된다는 뜻
        for(int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;    // 자리바꿈이 발생했는지를 체크한다.

            // for문을 반복할수록 비교해야하는 범위는 하나씩 줄어든다.
            for(int j = 0; j < numArr.length -1 - i; j++) {
                if(numArr[j] > numArr[j+1]) {       // 오른쪽 값이 작으면 서로 바꾼다.
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;     // 자리 바꿈이 발생했으니 changed를 true로 바꾼다.
                }
            } // end for j

            if(!changed)  break;    // 자리 바꿈이 없으면 반복문을 벗어난다. => 부분 정렬 완료

            for(int k = 0; k < numArr.length; k++)
                System.out.print(numArr[k]);    // 정렬된 결과를 출력한다.
            System.out.println();
        }   // end for i
    }   // main 끝
}
