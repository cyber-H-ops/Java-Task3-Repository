public class Student {
    String name;
    String status;
    String centre;

    {
        System.out.println("INSTANCE BLOCK: setting defaults");
        status = "PENDING";
        centre = "Not Assigned";
    }

    Student(String name) {
        System.out.println("CONSTRUCTOR: " + name);
    }

    }
