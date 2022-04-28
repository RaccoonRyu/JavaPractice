package CH02_Variable.CH02_1;

public class VariableDecl { // 실수형 변수 선언 실습예제

    public static void main(String[] args) {
        
        double num1, num2; // 두 개의 변수를 동시 선언할 수 있다.
        double result;

        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1 + num2;
        System.out.println(result);
    }
}
