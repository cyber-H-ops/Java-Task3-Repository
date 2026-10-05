public class Exam {
    static int examYear;
    static int fee;

    static {
        System.out.println("STATIC: loading exam settings");
        examYear = 2026;
        fee = 25000;
    }
}
