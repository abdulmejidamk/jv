public class _6Constructor {
    public static void main(String[] args) {
        
        // Creating Objects with Constructor

        Employee_Constructors employee = new Employee_Constructors(50_000, 20);
        int wage = employee.calculateWage(10);

        System.out.println(employee.getBaseSalary());
        System.out.println(wage);
    }
    
}