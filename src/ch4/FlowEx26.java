package ch4;

public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 4;

        // sum += ++i
        // sum <= 100
        while((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
