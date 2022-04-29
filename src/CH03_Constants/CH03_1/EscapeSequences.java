package CH03_Constants.CH03_1;

public class EscapeSequences { // 이스케이프 시퀀스 문자 실습예제

    // 이스케이프 시퀀스 문자 : 유니코드 문자들 중 키보드로 입력하기 어려운 문자들의 표현을 위해 사용하는 문자
    // 특정 문자 자체의 출력뿐만 아니라 문자가 아닌 화면상의 현상을 나타내는 문자들(개행, 탭 등)이 존재한다.

    public static void main(String[] args) {
        System.out.println("AB" + '\b'+ "C"); // 백스페이스 문자 '\b'
        System.out.println("AB" + '\t'+ "C"); // 탭 문자 '\t'
        System.out.println("AB" + '\n'+ "C"); // 개행 문자 '\n'
        System.out.println("AB" + '\r'+ "C"); // 캐리지 리턴() 문자 '\r'

        // 캐리지 리턴이란? 줄바꿈시 커서를 줄의 맨 앞으로 이동시키는 것
    }
}
