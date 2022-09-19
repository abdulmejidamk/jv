public class _8Static {
    public static void main(String[] args) {
        var employee = new Employee_Static(50_000, 20);
        Employee_Static.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
