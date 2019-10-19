package ch4;

/**
 * break문이 수행되면 그 밑 코드는 실행되지 않고 while문을 완전히 벗어난다.
 */
public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }   // end of while

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
