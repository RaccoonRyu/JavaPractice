package CH04_Operators.CH04_1;

public class CompAssignOp { // 복합 대입 연산자 실습예제

    // 복합 대입 연산자 : 대입 연산자가 다른 연산자와 묶여서 정의된 형태의 연산자.
    // 보통 산술 연산자와 묶여서 산술 연산의 결과를 대입하는 방식으로 사용한다.

    public static void main(String[] args) {

        short num = 10;
        num = (short)(num +77L); // short로 형변환 하지 않으면 컴파일 오류 발생

        int rate = 3;
        rate = (int)(rate *3.5); // int로 형변환 하지 않으면 컴파일 오류 발생

        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L; // 복합 대입 연산자 사용시 컴파일러가 자동 형변환 해줘 명시적 형변환 필요하지 않음.

        rate = 3;
        rate *= 3.5; // 복합 대입 연산자 사용시 컴파일러가 자동 형변환 해줘 명시적 형변환 필요하지 않음.

        System.out.println(num);
        System.out.println(rate);

    }
}
