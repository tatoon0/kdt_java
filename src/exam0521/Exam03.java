package exam0521;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.print("주민번호를 입력해주세요 : ");
        String ssn = scanner.next();
        if (ssn.charAt(7) == '1' || ssn.charAt(7) == 3) {
            System.out.println("남자입니다");
        } else {
            System.out.println("여자입니다");
        }
    }
}
