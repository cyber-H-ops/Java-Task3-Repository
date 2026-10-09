public class Main {
    public static void main(String[] args) {
        System.out.println("Year: " + Exam.examYear);
        System.out.println("Fees: " + Exam.fee);

        Student s1 = new Student("Grace");
        Student s2 = new Student("Peter");

        System.out.println(s1.name + " " + s1.status + " " + s1.centre);
        System.out.println(s2.name + " " + s2.status + " " + s2.centre);
    }
}
