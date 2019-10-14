package ch4;

public class FlowEx19 {
    public static void main(String[] args) {
        // 각 반복문이 3번씩 반복하므로 모두 27번이 반복된다.
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                for(int k = 1; k <= 3; k++) {
                    // ex) "" + 1 + 2 + 3 => "1" + 2 + 3 => "12" + 3 => "123"
                    System.out.println("" + i + j + k);
                }
            }
        }
    }
}
