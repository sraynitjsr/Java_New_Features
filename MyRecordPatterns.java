    record Employee(int id, String firstName, String lastName) {

    private static int empToken;

    public Employee {
        if (id < 100) {
            throw new IllegalArgumentException("Employee Id cannot be below 100.");
        }
        if (firstName.length() < 2) {
            throw new IllegalArgumentException("First name must be 2 characters or more.");
        }
    }

    public Employee(int id, String firstName) {
        this(id, firstName, null);
    }

    public void getFullName() {
        if (lastName == null)
            System.out.println(firstName());
        else
            System.out.println(firstName() + " " + lastName());
    }

    public static int generateEmployeeToken() {
        return ++empToken;
    }
}

public class MyRecordPatterns {
    public static void start() {
        System.out.println("Inside Java Record");

        Employee e1 = new Employee(1001, "Sachin", "Tendulkar");

        System.out.println(e1.id() + " " + e1.firstName() + " " + e1.lastName());

        System.out.println(e1.toString());

        Employee e2 = new Employee(1002, "Virat");

        e2.getFullName();

        System.out.println("Employee " + e2.id() + " Token = " + e2.generateEmployeeToken());

        System.out.print("Is e1 equal to e2: " + e1.equals(e2));
    }
}
