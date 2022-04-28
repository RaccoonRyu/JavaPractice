package CH02_Variable.CH02_4;

public class CharTypeUnicode { // 문자 자료형 char 실습예제(유니코드)
    
    public static void main(String[] args) {

        // char : 자바에서 문자의 저장을 위한 자료형. 자바는 유니코드를 기반으로 문자를 처리한다.
        // 문자는 작은따옴표('')로 묶어서 표현하고, 문자를 char형 변수에 저장할 때 실제 저장되는 것은 해당 문자의 유니코드 값이다.
        
        char ch1 = '헐';
        char ch2 = '확'; // ch1, ch2에 각 문자의 유니코드 값 저장 -> 문자들이 유니코드 값으로 치환됨
        
        char ch3 = 54736; // 문자 '헐'의 유니코드 값
        char ch4 = 54869; // 문자 '확'의 유니코드 값
        
        char ch5 = 0xD5D0; // 문자 '헐'의 유니코드 값을 16진수로 표현
        char ch6 = 0xD655; // 문자 '확'의 유니코드 값을 16진수로 표현

        System.out.println(ch1+" "+ch2);
        System.out.println(ch3+" "+ch4);
        System.out.println(ch5+" "+ch6); // 18~20라인) 전부 헐 확 동일하게 출력
    }
}
