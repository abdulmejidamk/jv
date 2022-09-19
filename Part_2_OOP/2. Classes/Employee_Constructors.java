public class Employee_Constructors {
    private int baseSalary;
    private int hourlyRate;

    // Creating Constructor to Construct Employee
    // Constructors can be overloaded 

    public Employee_Constructors(int baseSalary, int hourlyRate){
        /* this.baseSalary = baseSalary;
         this.hourlyRate = hourlyRate;

         >> but this cant throw exceptions  so we call the setter and 
         getter
          */
        
          setBaseSalary(baseSalary);
          setHourlyRate(hourlyRate);
          
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
