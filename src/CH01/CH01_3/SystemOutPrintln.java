package CH01.CH01_3;

public class SystemOutPrintln { // 콘솔 화면 출력 예제
    public static void main(String[] args)
    {
        System.out.println(7);
        System.out.println(3.15); // 6~7라인) 숫자만 출력할 때엔 큰따옴표 필요하지 않음
        System.out.println("3 + 5 = "+ 8);
        System.out.println(3.15 + "는 실수입니다.");
        System.out.println("3 + 5" + " 의 연산 결과는 8입니다."); // 8~10라인) 함께 이어서 출력할 대상을 + 기호로 묶음
        System.out.println(3 + 5); // 11라인) 수를 대상으로 하는 + 기호는 덧셈을 수행함
    }
}
