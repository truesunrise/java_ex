package ch4;

/**
 * 반복문 - for, while, do-while
 *
 * 1. for문, while문에 속한 문장은 조건에 따라 한 번도 수행되지 않을 수 있다.
 * 2. do-while문에 속한 문장은 무조건 최소한 한 번은 수행될 것이 보장된다.
 * 3. for문은 주로 반복횟수를 알고 있을 때 사용
 */
public class FlowEx12 {
    public static void main(String[] args) {
        // for문 초기화
        // 반복문에 사용될 변수가 2개 이상 필요할 때는 ','(콤마)를 구분자로 변수를 초기화
        // 단, 두 변수의 타입은 같아야 한다.
        for(int i = 1, j = 0; i <= 10; i++) {
            // 반복문 로직
        }

        // for문 증감식
        // ','(콤마)를 이용해서 두 문장 이상을 하나로 연결해서 쓸 수 있다.
        for(int i = 1, j = 10; i <= 10; i *= 2, j --) {
            // i: 1부터 2의 배수로 10까지 증가
            // j: 10부터 5까지 1씩 감소
        }

        // 초기화, 조건식, 증감식 모두 생략 가능 => 조건식은 참이 된다.
        // 조건식이 생략된 경우, 참으로 간주되어 무한 반복문이 된다.
        // for(;;) {}

        for(int i = 1; i <= 5; i++)
            System.out.println(i);

        for(int i = 1; i <= 5; i++)
            System.out.print(i);    // print() 를 쓰면 가로로 출력

        System.out.println();

        // 결과값:
        // 1
        // 2
        // 3
        // 4
        // 5
        // 12345
        //
    }
}
