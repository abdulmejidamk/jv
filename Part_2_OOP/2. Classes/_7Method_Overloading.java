public class _7Method_Overloading {
    public static void main(String[] args) {
        var employee = new Employee_Constructors(50_000,10);
        int wage = employee.calculateWage();
        int wage2 = employee.calculateWage(0);

        System.out.println(employee.getHourlyRate());
        System.out.println(wage);
        System.out.println(wage2);

    }
}
