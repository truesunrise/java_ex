package ch6;

/**
 * 객체 배열: 객체를 배열로 다루는 것
 *
 * - 객체 배열 안에 객체가 저장되는 것은 아니고, 객체의 주소가 저장
 * - 참조변수들을 하나로 묶은 참조변수 배열인 것
 * - 각 요소는 참조변수의 기본값인 null로 자동 초기화
 */
public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];     // 길이가 3인 Tv 객체 배열

        // Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;      // tvArr[i]의 channel에 i+10을 저장
        }

        for(int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();       // tvArr[i]의 메서드를 호출 (채널이 1 증가)
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
        }
    }
}
