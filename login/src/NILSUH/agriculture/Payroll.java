package agriculture;

public class Payroll {

    private double hrs;
    private double rate;
    private double pay;

    public Payroll(double hrs, double rate){
        this.hrs = hrs;
        this.rate = rate;
    }
    

    public double gethrs(){
        return this.hrs;
    }

    public void sethrs(double hrs){
        this.hrs = hrs;
    }

    public double getRate(){
        return this.rate;
    }

    public double calcPay(){
        return rate*hrs;
    }

}
