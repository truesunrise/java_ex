package ch5;

/**
 * 커맨드 라인을 통해 입력받기
 *
 * - 화면을 통해 사용자로부터 값을 입력받을 수 있는 방법 중 하나
 * - 프로그램을 실행할 때, 클래스 이름 뒤에 여러 개의 문자열을 프로그램에 전달 할 수 있다.
 *      ex) main 메서드가 담긴 클래스 이름이 ArrayEx16 가정 => java ArrayEx16 abc 123
 *      커맨드라인을 통해 입력된 두 문자열은 String 배열에 담겨서 ArrayEx16 클래스의 main 메서드의 매개변수(args)에 전달된다.
 *      main 메서드에서 args[0], args[1]와 같은 방식으로 문자열에 접근할 수 있다.
 */
public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수: " + args.length);
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
