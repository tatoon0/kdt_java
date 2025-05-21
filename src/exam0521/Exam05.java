package exam0521;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        String name;
        int kor;
        int eng;
        int math;
        double sum;
        double avg;

        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        kor = scanner.nextInt();
        eng = scanner.nextInt();
        math = scanner.nextInt();
        sum = kor + eng + math;
        avg = sum/3;

        System.out.println(sum);
        System.out.println(avg);
    }
}
