package ch5;

/**
 * 커맨드 라인을 통해 입력받기 2
 *
 * - 컴파일 오류
 *     ◆ javac ArrayEx17.java
 *          오류: unmappable character for encoding MS949
 *          해결: javac ArrayEx17.java -encoding UTF-8
 * - 실행 오류
 *     ◆ java ArrayEx17 10 + 10
 *          오류: 기본 클래스 Array17을(를) 찾거나 로드할 수 없습니다.
 *          해결: java 프로그램에서는 패키지 이름이 모두 포함된 full class name을 가지고 클래스 파일들을 찾기 때문에 상위 디렉터리(또는 패키지의 루트 디렉터리)에서 실행
 *               ch5의 parent directory로 이동 => java ch5.ArrayEx17 10 + 10
 */
public class ArrayEx17 {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);   // 문자열을 숫자로 변환 (커맨드라인으로부터 입력받은 데이터는 모두 문자열)
        char op = args[1].charAt(0);            // 문자열을 문자(char)로 변환
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        // switch문의 수식으로 char타입의 변수도 가능
        switch(op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("지원되지 않는 연산입니다.");
        }

        System.out.println("결과: " + result);
    }
}
