package ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");
        while(i-- != 0) {
            System.out.println(i);

            // 매 출력마다 약간의 시간을 지연 시키기위한 반복문
            // 2,000,000,000번 반복
            // 아무런 내용도 없는 빈 문장
            for(int j = 0; j < 2_000_000_000; j++) {
                ;
            }
        }
        System.out.println("GAME OVER");
    }
}
