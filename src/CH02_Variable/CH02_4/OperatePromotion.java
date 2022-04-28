package CH02_Variable.CH02_4;

public class OperatePromotion { // short 정수형 변수 선언시 예외발생 예제

    public static void main(String[] args) {
        short num1 = 11;
        short num2 = 22;
        short result = (short) (num1 + num2);
        System.out.println(result); // Java는 정수형 연산을 int형으로 진행하기 때문에 예외 발생
        // java: incompatible types: possible lossy conversion from int to short
    }
}
