package CH04_Operators.CH04_1;

public class RelationalOp { // 관계 연산자 실습예제

    // 관계 연산자 : 두 피연산자 사이에서 크기 및 동등 관계를 따져주는 이항 연산자.
    // 연산에 결과에 따라서 true나 false를 반환한다.
    // 두 피연산자의 값을 비교하기 떄문에 '비교 연산자'라고도 한다.


    public static void main(String[] arg) {

        System.out.println("3 >= 2 : " + (3 >= 2));
        System.out.println("3 <= 2 : " + (3 <= 2));
        System.out.println("7.0 == 7 : " + (7.0 == 7)); // 실수 7.0과 정수 7은 다르지만
        System.out.println("7.0 != 7 : " + (7.0 != 7)); // 비교 연산을 위해 자동 형변환이 일어난다.

    }
}
