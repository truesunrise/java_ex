package ch5;

/**
 * char 배열과 String 클래스의 변환
 *
 * - String 클래스는 char 배열에 기능(메서드)을 추가한 것
 * - char 배열과 String 클래스의 차이점: String 객체(문자열)는 읽을 수만 있을 뿐 내용 변경 X
 */
public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i = 0; i < src.length(); i++) {
            // charAt: 문자열에서 저장된 index에 있는 한 문자를 가져온다.
            char ch = src.charAt(i);
            System.out.println("scr.charAt(" + i + "): " + ch);
        }

        // 문자열: 문자를 연이어 늘어놓은 것 (문자배열인 char 배열과 같은 뜻)
        // 문자열을 문자배열(char[])로 변환해서 반환한다.
        // String을 char[]로 변환
        char[] chArr = src.toCharArray();

        // char 배열 (char[])을 출력
        System.out.println(chArr);
    }
}
