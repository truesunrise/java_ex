package ch5;

/**
 * 다차원 배열
 *
 * - 2차원 배열의 선언
 *      타입[][] 변수이름;    ex) int[][] score;
 *      타입 변수이름[][];    ex) int score[][];
 *      타입[] 변수이름[];    ex) int[] score[];
 *
 *      ◆ 2차원 배열은 주로 테이블 형태의 데이터를 담는데 사용
 *      ex) 4행 3열의 데이터를 담기 위한 배열을 생성 => int[][] score = new int[4][3];
 *
 *      ◆ 배열을 생성하면 배열의 각 요소에는 배열요소 타입의 기본값이 자동적으로 저장된다.
 *
 * - 2차원 배열의 index
 *      ◆ 행 index 범위: 0 ~ 행의 길이-1
 *      ◆ 열 index 범위: 0 ~ 열의 길이-1
 *      ◆ 2차원 배열의 각 요소에 접근하는 방법: 배열이름[행 index][열 index]     ex) score[0][0] => 배열 score 1행 1열의 값
 *
 * - 2차원 배열의 초기화
 *      2차원 배열도 괄호{}를 이용해서 생성과 초기화를 동시에 할 수 있다.
 *      ex) int[][] arr = {
 *                {1, 2, 3}
 *              , {4, 5, 6}
 *          };
 */
public class ArrayEx18 {
    public static void main(String[] args) {
        // 2차원 배열은 '배열의 배열'로 구성 (여러개의 1차원 배열을 묶어서 또 하나의 배열로 만듦)
        // score.length = 4    (배열 참조변수 score가 참조하고 있는 배열의 길이)
        // score[0].length = 3 (배열 참조변수 score[0]이 참조하고 있는 배열의 길이)
        int[][] score = {
                  { 100, 100, 100 }
                , { 20, 20, 20 }
                , { 30, 30, 30 }
                , { 40, 40, 40 }
        };

        int sum = 0;

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[j].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
            }
        }

        for(int[] tmp : score) {
            for(int i : tmp) {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
