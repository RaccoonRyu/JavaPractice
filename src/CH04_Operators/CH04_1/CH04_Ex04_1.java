package CH04_Operators.CH04_1;

public class CH04_Ex04_1 { // CH4 문제04-1

    public static void main(String[] args) {

        // 문제 1
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        num1 = num2 = num3;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3); // 전부 30 저장됨

        // 문제 2
        // result = ((num1 += 10) < 0) && ((num2 += 10) > 0); 부분을
        // num1 += 10; num2 += 10; result = (num1 < 0) && (num2 > 0); 으로 나눠서 작성

        // 문제 3 -> Java에서는 연산 순위를 높여줄 때 소괄호를 사용한다.
        System.out.println("{(25 x 5) +(36 - 4) - 72}/5 = " +((25 * 5)+(36 - 4) - 72) / 5);

        // 문제 4
        System.out.println("3 + 6 = "+ (3 + 6));
        System.out.println("3 + 6 + 9 = "+ (3 + 6 + 9));
        System.out.println("3 + 6 + 9 + 12 = "+ (3 + 6 + 9 + 12));

        int result = 3 + 6;
        System.out.println("3 + 6 = "+ result);

        result += 9;
        System.out.println("3 + 6 + 9 = "+ result);

        result += 12;
        System.out.println("3 + 6 + 9 + 12 = "+ result);

        // 문제 5
        int n1 = ((25 + 5) + (36 / 4) - 72) * 5;
        int n2 = ((25 * 5) + (36 - 4) + 71) / 4;
        int n3 = (128 / 4) * 2;

        System.out.println(n1 + " " + n2 + " " +n3);
        boolean boolResult = (n1 > n2) && (n2 > n3);
        System.out.println(boolResult);
    }
}
