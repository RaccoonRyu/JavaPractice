package CH03_Constants.CH03_1;

public class IntegerLiterals { // 정수 리터럴 상수의 표현 방법 실습예제

    // 변수의 자료형에 상관없이 정수 리터럴 상수는 int형으로 표현하기로 약속!
    // 정수 리터럴은 8진수, 10진수, 16진수로 표현할 수 있다.

    public static void main(String[] args){
        
        int num1 = 123; // 10진수 표현
        int num2 = 0123; // 8진수 표현
        int num3 = 0x123; // 16진수 표현

        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+num2);
        System.out.println("num3 : "+num3);

        System.out.println("11 + 22 + 33 = "+(11+22+33));
        System.out.println("011 + 022 + 033 = "+(011+022+033));
        System.out.println("0x11 + 0x22 + 0x33 = "+(0x11+0x22+0x33));
    }
}
