package ch4;

public class FlowEX21 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == j) {
                    System.out.printf("[%d, %d]", i, j);
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
        // 결과값:
        // [1, 1]
        //      [2, 2]
        //          [3, 3]
        //              [4, 4]
        //                  [5, 5]
    }
}
