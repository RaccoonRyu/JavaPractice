package CH04_Operators.CH04_2;

public class PostfixOp { // 후치 증감연산자 실습예제

    // 피연산자의 뒷부분(오른쪽)에 붙어서 사용되는 증감연산자
    // 단, 해당 연산자는 전치 연산자의 형태로 사용될 때와는 의미가 조금 다르다.
    // 기본적으로 값이 하나 증가 또는 감소하는 것은 동일하나,
    // 후치 연산자는 출력 후에 값이 증가/감소하므로, 전치 연산자와는 반영되는 시점에 차이가 있다.
    // 즉 연산이 진행된 문장이 아닌, 그 다음 문장으로 넘어가야 값이 반영된다.

    public static void main(String[] args) {
        int num = 5;
        System.out.print((num++)+ " "); // 출력 후에 값이 증가. 5 출력됨
        System.out.print((num++)+ " "); // 출력 후에 값이 증가. 6 출력됨
        System.out.print(num+ "\n"); // 7 출력됨

        System.out.print((num--)+" "); // 출력 후에 값이 감소. 7 출력됨
        System.out.print((num--)+" "); // 출력 후에 값이 감소. 6 출력됨
        System.out.print(num); // 5 출력됨
    }
}
