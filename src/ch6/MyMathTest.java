package ch6;

public class MyMathTest {
    public static void main(String args[]) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);

        // double 대신 long 값으로 호출함. 이 값은 double로 자동형변환 된다.
        // long형의 값인 5L은 double형 값인 5.0으로 자동 형변환되어 divide의 매개변수 a에 저장된다.
        double result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b;
    }

    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}
