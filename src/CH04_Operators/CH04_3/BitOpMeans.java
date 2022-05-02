package CH04_Operators.CH04_3;

public class BitOpMeans { // 비트 연산자 실습예제

    // 비트 연산자 : 각각의 비트를 대상으로 연산을 진행하는 연산자
    // 피연산자는 반드시 정수이어야 한다. (실수를 대상으로 하는 비트 연산은 의미가 없어 자바가 지원하지 않음)

    public static void main(String[] args) {
        byte n1 = 13;
        byte n2 = 7;
        byte n3 = (byte)(n1 & n2); // 비트 연산의 & 결과는 int형 연산을 하기 때문에 int형이므로 형변환 필요함
        System.out.println(n3); // 연산 결과는 5 출력
    }

}
