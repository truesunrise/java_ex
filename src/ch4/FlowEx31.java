package ch4;

/**
 * continue문
 *
 * 반복문 내에서만 사용
 * 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
 * ( break문과 달리 반복문을 벗어나지 않고, 블럭의 끝으로 이동한다. )
 * 전체 반복 중에 특정 조건을 만족하는 경우를 제외하고자 할 때 유용
 */
public class FlowEx31 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i % 3 == 0)
                continue;
             System.out.println(i);
        }
    }
}
