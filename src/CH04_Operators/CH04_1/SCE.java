package CH04_Operators.CH04_1;

public class SCE { // Short - Circuit Evaluation 실습예제

    // Short - Circuit Evaluation이란? 연산의 효율 및 속도를 높이기 위해 불필요한 연산을 생략하는 행위

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        boolean result;

        result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
        System.out.println("result : "+result); // &&의 결과는 왼쪽 조건이 false이므로 오른쪽 조건은 판단하지 않음. false
        System.out.println("num1 = "+num1); // 이 때 오른쪽 조건은 판단하지 않고 왼쪽 조건의 num1만 증가시켜 num1은 10,
        System.out.println("num2 = "+num2); // num2는 0이 출력된다.

        result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
        System.out.println("result : "+result); // ||의 결과는 왼쪽 조건이 True이므로 오른쪽 조건은 판단하지 않음. True
        System.out.println("num1 = "+num1); // 이 때 오른쪽 조건은 판단하지 않고 왼쪽 조건의 num1만 증가시켜 num1은 20,
        System.out.println("num2 = "+num2); // num2는 그대로 0이 출력된다.

        // 따라서 SCE는,
        // &&의 왼쪽 피연산자가 false이면 오른쪽 피연산자는 확인하지 않는다.
        // 그리고 ||의 왼쪽 피연산자가 true이면 오른쪽 피연산자는 확인하지 않는다.
    }
}
