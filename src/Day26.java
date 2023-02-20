import Day23.NetworkInterfaceTest.NetworkInterfaceTest;

public class Day26 {
    private String secret = "비공개";
    String s = "외부";

    class MemberClass {
        String s = "내부";

        public void show1() {
            System.out.println("내부 클래스");
            System.out.println(secret);

            System.out.println(s);

            System.out.println(Day26.this.s);
        }

        // static String s3 = "정적 멤버 필드";
        // static void show2() {}
    }

    public static void main(String[] args) {
        Day26 m = new Day26();
        Day26.MemberClass m1 = m.new MemberClass();

        System.out.println(m1.s);
        m1.show1();
    }
}