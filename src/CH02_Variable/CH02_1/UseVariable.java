package CH02_Variable.CH02_1;

public class UseVariable { // 변수 선언 실습예제

    // 변수 선언 : 특정 자료형을 저장하기 위한 메모리 공간을 할당하고, 할당한 공간에 접근하기 위해 이름을 붙이는 행위.

    public static void main(String[] args) {

        int num1; // 정수형 변수 num1의 선언
        num1 = 10; // 변수 num1에 10 저장

        int num2 = 20; // 정수형 변수 num2 선언과 동시에 20으로 초기화
        int num3 = num1 + num2; // 두 변수 값을 대상으로 덧셈한 결과를 num3에 저장
        System.out.println(num1+" + "+num2+" = "+num3);

    }

}
