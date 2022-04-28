package CH03_Constants.CH03_1;

public class Constants { // 일반적인 상수 선언/할당 실습예제

    // 상수 : 값이 변하지 않는 수. 자바에서는 한번 그 값이 정해지면 이후로는 변경이 불가능한 변수도 상수라고 한다.
    // 변수를 선언할 때 그 앞에 final이라는 선언을 추가하면 해당 변수는 상수가 된다.
    // 상수는 값을 딱 한 번만 할당할 수 있고, 한 번 할당된 값은 변경이 불가능하다.
    // 관례상 상수명은 모두 대문자로 작성하며, 이름이 둘 이상의 단어로 이뤄질 경우 단어 사이에 언더바를 넣는다.

    public static void main(String[] args) {
        final int MAX_SIZE = 100; // 정수형 상수에 100 할당
        final char CONST_CHAR = '상'; // 문자형 상수에 '상' 할당
        final int CONST_ASSIGNED; // 정수형 상수에 값 할당하지 않고 선언

        CONST_ASSIGNED = 12; // 할당하지 않았던 상수의 값을 할당

        System.out.println("상수 1 : " +MAX_SIZE);
        System.out.println("상수 2 : " +CONST_CHAR);
        System.out.println("상수 3 : " +CONST_ASSIGNED);
    }
}
