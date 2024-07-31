public class EmployeeDetails {
    static int eid;
    static String ename;
    static String companyName;
    public static void setEmployeeDetails(int id, String name, String company) {
        eid = id;
        ename = name;
        companyName = company;
    }
    public static void displayEmployeeDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }
    public static void main(String[] args) {
        Employee.setEmployeeDetails(401, "satya", "IBM");
        Employee.displayEmployeeDetails();
    }
}
