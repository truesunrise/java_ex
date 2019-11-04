package ch5;

/**
 * 16진수를 2진수로 변환하는 예제
 */
public class ArrayEx13 {
    public static void main(String[] args) {
        // 변환하고자 하는 16진수를 배열 hex에 나열한다.
        // 16진수에는 A~F까지 6개의 문자가 포함되므로 char 배열로 처리
        char[] hex = {'C', 'A', 'F', 'E'};

        // 이진수 '0000'부터 '1111'(16진수로 0~F)까지 모두 16개의 값을 문자열로 저장
        String[] binary = {
                "0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1110", "1111"
        };

        String result = "";

        // 배열 hex에 저장된 문자를 하나씩 읽어서 그에 해당하는 이진수 표현을 배열 binary에서 얻어 result에 덧붙이고 그 결과를 화면에 출력
        for(int i = 0; i < hex.length; i++) {
            if(hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i] - '0'];         // '8' - '0'의 결과는 8
            } else {
                // hex[0] = 'C'
                // 'C' - 'A' => 67 - 65 => 2
                // result += binary[2 + 10];
                // result += "1100";
                result += binary[hex[i] - 'A' + 10];    // 'C' - 'A'의 결과는 2
            }
        }

        System.out.println("hex: " + new String(hex));
        System.out.println("binary: " + result);
    }
}
