package CH04_Operators.CH04_1;

public class ArithOp { // 대입, 산술연산자 실습예제

    // 대입 연산자 : 연산자 오른쪽에 있는 값을 연산자 왼쪽에 있는 변수에 대입하는 연산자 (=)
    // 산술 연산자 : 두 피연산자들 간의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산하는 연산자 (+,-,*,/,%)

    public static void main (String[] args) {

        int num1 = 7;
        int num2 = 3;

        System.out.println("num1 + num2 = " + (num1 + num2)); // 덧셈 연산자
        System.out.println("num1 - num2 = " + (num1 - num2)); // 뺄셈 연산자
        System.out.println("num1 * num2 = " + (num1 * num2)); // 곱셈 연산자
        System.out.println("num1 / num2 = " + (num1 / num2)); // 나눗셈 연산자. 몫이 출력된다.
        System.out.println("num1 % num2 = " + (num1 % num2)); // 나머지 연산자. 나눗셈의 나머지가 출력된다.
    }
}
