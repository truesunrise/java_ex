package ch5;

/**
 * 배열의 복사
 *
 * 1. 배열은 한번 생성하면 그 길이를 변경할 수 없다.
 *    더 많은 저장공간이 필요하면 큰 배열을 새로 만들고 이전 배열로부터 내용을 복사
 * 2. 배열 복사 방법
 *    2-1. for문
 *    2-2. System.arraycopy()
 */
public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 배열 arr에 1~5를 저장한다,
        for(int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        System.out.println("[변경전]");
        System.out.println("arr.length: " + arr.length);

        for(int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "]: " + arr[i]);

        int[] tmp = new int[arr.length*2];

        // 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
        for(int i = 0; i < arr.length; i++)
            tmp[i] = arr[i];

        // tmp에 저장된 값을 arr에 저장한다.
        // 결국 참조변수 arr과 tmp는 같은 배열을 가리키게 된다. => 배열 arr과 배열 tmp는 이름만 다를 뿐 동일한 배열
        // arr이 그 전에 가리키던 배열은 더 이상 사용할 수 없다.
        // 배열은 참조변수를 통해서만 접근 가능 => 자신을 가리키는 참조변수가 없는 배열은 사용불가 => 이렇게 쓸모없는 배열은 JVM의 가비지 컬렉터에 의해 자동적으로 메모리에서 제거
        arr = tmp;

        System.out.println("[변경후]");
        System.out.println("arr.length: " + arr.length);

        for(int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "]: " + arr[i]);
    }
}
