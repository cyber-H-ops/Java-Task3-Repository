public class Student {
    String name;
    String status;
    String centre;

    {
        System.out.println("INSTANCE BLOCK: setting defaults");
        status = "PENDING";
        centre = "Not Assigned";
    }

}
