package ch4;

/**
 * 이름 붙은 반복문
 *
 * break문: 근접한 단 하나의 반복문만 벗어날 수 있다.
 *      => 여러 개의 반복문이 중첩된 경우에는 break문으로 중첩 반복문을 완전히 벗어날 수 없다.
 *      => 중첩 반복문 앞에 이름을 붙이고 break문, continue문에 이름을 지정해 줌으로써 하나 이상의 반복문을 벗어나거나 반복을 건너뛸 수 있다.
 */
public class FlowEx33 {
    public static void main(String[] args) {
        Loop1 : for(int i = 2; i <= 9; i++) {
                    for(int j = 1; j <= 9; j++) {
                        if(j == 5)
                            break Loop1;        // 2단의 4번째 줄까지 출력
                            // break;           // 2단부터 9단까지 4번째 줄까지 출력
                            // continue Loop1;  // 2단부터 9단까지 4번째 줄까지 출력
                            // continue;        // 2단부터 9단까지 5번째 줄만 빼고 모두 출력
                        System.out.println(i + "*" + j + "=" + i*j);
                    }   // end of for i
            System.out.println();
        }   // end of Loop1
    }
}
