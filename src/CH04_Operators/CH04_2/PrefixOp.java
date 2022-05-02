package CH04_Operators.CH04_2;

public class PrefixOp { // 전치 증감연산자 실습예제

    // 변수에 저장된 값을 하나 증가 또는 감소시키는 기능의 연산자
    // 해당 연산자는 증가 및 감소된 값을 단순히 반환하는 것이 아니라 실제 변수에 저장된 값을 변화시킨다.
    // 피연산자의 앞부분(왼쪽)에 붙는 연산자라 하여 전치(prefix) 연산자라고 한다.

    public static void main(String[] args) {
        int num = 7;
        System.out.println(++num); // num의 값 1 증가 후 출력 7 -> 8
        System.out.println(++num); // num의 값 1 증가 후 출력 8 -> 9
        System.out.println(--num); // num의 값 1 감소 후 출력 9 -> 8
        System.out.println(num); // 8
    }
}
