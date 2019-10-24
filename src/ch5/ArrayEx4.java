package ch5;

/**
 * System.arraycopy() 를 이용한 배열의 복사
 *
 * for문: 배열의 요소 하나하나에 접근해서 복사
 * arraycopy(): 지정된 범위의 값들을 한 번에 통째로 복사 (각 요소들이 연속적으로 저장된 배열의 특성 때문에 이렇게 처리하는 것이 가능)
 *      => 배열의 복사는 for문보다 System.arraycopy()를 사용하는게 효율적
 *
 * System.arraycopy(num, 0, newNum, 0, num.length);
 *      => num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        // 다른 배열과 달리 char 배열은 for문을 사용하지 않고도 print()나 println()으로 배열에 저장된 모든 문자를 출력할 수 있다.
        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);     // ABCD0123456789

        // 배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);    // ABCD456789

        // 배열 num의 인덱스6 위치에 배열 abc 값 3개를 복사
        System.arraycopy(abc, 0, num, 6, abc.length);
        System.out.println(num);    // ABCD45ABCD
    }
}
