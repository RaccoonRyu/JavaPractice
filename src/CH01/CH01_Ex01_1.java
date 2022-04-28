package CH01;

public class CH01_Ex01_1 {

    // 문제 1 : JavaProgram.java를 컴파일하면 JavaProgram.class가 생성된다.
    // 이 때, 컴파일 시 생성되는 클래스 파일명을 SimpleJavaProgram.class로 변경하고 싶을 때 무엇을 수정해야 하는가?

    // 정답 :  JavaProgram.java를 SimpleJavaProgram.java로 파일명 변경(수정)한다.

    public static void main(String[] args)
    {
        // 문제 2 : 출력 결과를 확인하는 프로그램 작성
        System.out.println("2 + 5 = "+ 2 + 5); // 결과는 2 + 5 = 25
        System.out.println("2 + 5 = "+ (2 + 5)); // 결과는 2 + 5 = 7

        // 문제 3 : 숫자 12를 총 5회 출력하는 프로그램을 작성하되 매 출력마다 방법을 달리하여 출력.
        System.out.println(12);
        System.out.println("12");
        System.out.println("1"+2);
        System.out.println(1+"2");
        System.out.println(7+5);
    }
}
