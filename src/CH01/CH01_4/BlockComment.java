package CH01.CH01_4;

public class BlockComment { // 블록(block) 단위 주석 실습 예제

    // 주석 : 컴파일의 대상에서 제외되는 문장을 의미.
    // 따라서 주석 처리를 통해 코드에 대한 설명 및 기록을 메모의 형태로 남겨둘 수 있다.

    /*
     파일명 : BlockComment.java
     작성자명 : 류라쿤
     작성일 : 2022-04-28
     목적 : System.out.println 메서드의 기능 테스트
     */

     /* 블록 단위 주석 */

     public static void main(String[] args)
     {
         // 아래는 단순한 정수의 출력
         System.out.println(7);

         // 아래는 실수, 문자열 결합 출력
         System.out.println(3.15);
         System.out.println("3 + 5 = "+8);
         System.out.println(3.15 +"는 실수입니다.");
         System.out.println("3 + 5" +" 의 연산 결과는 8입니다.");

         // 아래는 덧셈 결과의 출력
         System.out.println(3+5);
     }
} // 해당 소스를 실행시 주석은 프로그램에 아무런 영향을 미치지 않음을 확인할 수 있다.
