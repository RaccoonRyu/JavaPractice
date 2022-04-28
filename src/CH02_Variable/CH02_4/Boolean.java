package CH02_Variable.CH02_4;

public class Boolean { // 논리 자료형 boolean 실습예제
    
    // boolean : 참/거짓의 표현을 목적으로 하는 논리 자료형. 1바이트의 크기
    
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        
        System.out.println(b1); // b1이 지닌 값 true 출력
        System.out.println(b2); // b2가 지닌 값 false 출력

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 < num2); // true 출력
        System.out.println(num1 > num2); // false 출력
    }
}
