package agriculture;
import java.sql.Date;

public class Employee extends Person {
    Payroll payroll ;
    private int id;
    private String position;
    private String start;
    private String end;
    private String username;
    private String password;

    public Employee (String name,Gender gender, String address, String email, String phoneNumber, String loginStatus, String position, String start, String end){
        
        super(name, gender, address, email, phoneNumber, loginStatus);
        this.position=position;
        this.start=start;
        this.end=end;
    }

    public void setIdNumber(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getPosition(){
        return this.position;
    }
    
    public String getStartdate(){
        return this.start;
    }

    public String getEnddate(){
        return this.end;
    }

    public Double getPay(){
        return payroll.calcPay(); 
    }

    public String toString(){
        return null; //payroll.toString();
    }

    public void setHrs(double hrs){
        this.payroll.sethrs(hrs);
    }
	
	
	//Combine manager
	public void setUsername(String newUsername) 
	{
		this.username = newUsername;
	}
	
	public void setPassword(String newPwd) 
	{
		this.password = newPwd;
	}

    public String getUsername() 
	{
		return this.username;
	}
	
	public String getPassword() 
	{
		return this.password;
	}
}