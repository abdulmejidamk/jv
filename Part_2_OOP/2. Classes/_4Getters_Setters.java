public class _4Getters_Setters {
    public static void main(String[] args) {
        var employee = new EmployeeGetter_setter();
        
        // using getter
        employee.setBaseSalary(2500);
        // using setter
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(20);
        System.out.println(wage);

        
    }
}
