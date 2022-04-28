package CH01.CH01_4;

public class LineComment { // 행(line) 단위 주석 실습예제

    // 파일명 : LineComment.java
    // 작성자명 : 류라쿤
    // 작성일 : 2022-04-28
    // 목적 : System.out.println 메서드의 기능 테스트
    
    // 행 단위 주석 : 주석 처리해야 할 문장이 하나 or 둘일 경우 사용
    
    public static void main(String[] args)
    {
        // 아래는 단순한 정수의 출력
        System.out.println(7);

        // 아래는 실수의 출력 및 +를 사용한 결합 출력
        System.out.println(3.15);
        System.out.println("3 + 5 = "+8);
        System.out.println(3.15+" 는 실수입니다.");
        System.out.println("3 + 5"+ " 의 연산 결과는 8입니다.");

        // 아래는 덧셉 결과의 출력
        System.out.println(3 + 5);
    }
}
