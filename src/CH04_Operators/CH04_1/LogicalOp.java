package CH04_Operators.CH04_1;

public class LogicalOp { // 논리 연산자 실습예제

    // 논리 연산자 : 진리표를 따르는 연산 결과에 따라 true나 false를 반환하는 연산자

    public static void main(String[] args){

        int num1 = 11;
        int num2 = 22;
        boolean result;

        // 변수 num1에 저장된 값이 1~100 사이의 정수인가?
        result = (1 < num1) && (num1 < 100);
        System.out.println("num1은 1 초과 100 미만인가? "+result);

        // 변수 num2에 저장된 값이 2 or 3의 배수인가?
        result = ((num2 % 2)== 0) || ((num2 % 3) == 0);
        System.out.println("num2가 2 또는 3의 배수인가? "+result);

        // 변수 num1이 0인가?
        result = !(num1 != 0);
        System.out.println("num1이 0 인가? "+result);
    }
}
