public class _2Procedural {
    public static void main(String[] args) {
        // Wage of Employees

        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;
        int Wage =  calculateWage(baseSalary, extraHours, hourlyRate);
        
       System.out.println(Wage);
    }
    public static int calculateWage(
        int baseSalary,
        int extraHours,
        int hourlyRate
        )
        {
        return baseSalary + (extraHours * hourlyRate);
        }
}
