public class Employee_Static {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    // Creating Constructor to Construct Employee
    // Constructors can be overloaded 

    public Employee_Static(int baseSalary, int hourlyRate){
        /* this.baseSalary = baseSalary;
         this.hourlyRate = hourlyRate;

         >> but this cant throw exceptions  so we call the setter and 
         getter
          */
        
          setBaseSalary(baseSalary);
          setHourlyRate(hourlyRate);
          numberOfEmployees++;
          
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
        /* in static method eventhough we are in employee class 
           we cant access calculateWage method
           >> to do that we have to make Employee object of that method 
        */

        new Employee_Static(5, 12);
       
    }



    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary Cant be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    
    public int calculateWage(){
        return baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Invalid Hourly rate");
       this.hourlyRate = hourlyRate;
    }
    
}



