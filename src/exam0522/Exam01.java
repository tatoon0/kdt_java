package exam0522;

public class Exam01 {
    public static void main(String[] args) {
        long a = 10L;
        int b = (int)a; // 강제 타입변환

        double num = Math.random();
        System.out.println((int)(num * 6) + 1);
    }
}
