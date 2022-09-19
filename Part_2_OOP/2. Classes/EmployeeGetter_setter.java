public class EmployeeGetter_setter {
    private int baseSalary;
    private int hourlyRate;

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary Cant be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Invalid Hourly rate");
       this.hourlyRate = hourlyRate;
    }

}
