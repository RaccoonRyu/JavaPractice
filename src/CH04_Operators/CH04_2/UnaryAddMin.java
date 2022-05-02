package CH04_Operators.CH04_2;

public class UnaryAddMin { // 부호 연산자 실습 예제

    // +와 -는 단항연산자로도 사용할 수 있다.
    // 단항연산자로 사용시 수학에서의 의미와 동일하게 부호 연산자로 사용할 수 있다.

    public static void main(String[] arg) {
        short num1 = 5;
        System.out.println(+num1); // num1에 저장된 수가 5이므로 불필요한 +연산
        System.out.println(-num1); // 부호를 -로 바꿔서 얻은 결과를 출력
        
        // 자바는 기본적으로 정수형 연산을 int형으로 진행하고 결과도 int형으로 반환한다.
        short num2 = 7;
        short num3 = (short)(+num2); // 따라서 short로 형 변환하지 않으면 오류 발생
        short num4 = (short)(-num2); // 역시나 short로 형 변환하지 않으면 오류 발생
        System.out.println(num3);
        System.out.println(num4);
    }
}
