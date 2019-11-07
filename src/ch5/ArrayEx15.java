package ch5;

/**
 * 문자열(String)을 모스부호로 변환
 */
public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {
                ".-", "-...", "-.-", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."
        };

        String result = "";

        for(int i = 0; i < source.length(); i++) {
            // if) i = 0일 때, 'S' - 'A' = 83 - 65 = 18
            // morse[18] = "...";
            result += morse[source.charAt(i) - 'A'];
        }

        System.out.println("source: " + source);
        System.out.println("morse: " + result);     // morse: ...---.........-...--.
    }
}
