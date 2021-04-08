package NILSUH.agriculture;

public class Employee extends Person {
    
    Payroll payroll = new Payroll();

    public Double getPay(){
        return payroll;
    }

    public String toString(){
        return payroll.toString();
    }
}