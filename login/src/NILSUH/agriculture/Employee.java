package agriculture;
import java.sql.Date;

public class Employee extends Person {
    Payroll payroll = new Payroll();
    private int id;
    private String position;
    private String start;
    private String end;

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
        return payroll.getPay(); //payroll;
    }

    public String toString(){
        return null; //payroll.toString();
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
}