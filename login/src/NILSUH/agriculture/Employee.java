package agriculture;
import java.sql.Date;

public class Employee extends Person {
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

    /**
     * 
     * @param id the ID that the employee shall be assigned 
     */
    public void setIdNumber(int id){
        this.id = id;
    }

    /**
     * 
     * @return the ID of the employee
     */
    public int getId(){
        return this.id;
    }

    /**
     * 
     * @return the position of the employee 
     */
    public String getPosition(){
        return this.position;
    }
    
    /**
     * 
     * @return the date that the employee started working 
     */
    public String getStartdate(){
        return this.start;
    }

    /**
     * 
     * @return the date that the employee stops working 
     */
    public String getEnddate(){
        return this.end;
    }

    /**
     * @return single string of the employee information 
     */
    public String toString(){
        return null; //payroll.toString();
    }

    /**
     * 
     * @param hrs the hours that was worked for a specific time period  and to be added to the total hours
     */
    public void setHrs(double hrs){
        hours += hrs;
    }
	
	
	//Combine manager
    /**
     * @param newUsername the username that shall be assigned to the manager
     */
	public void setUsername(String newUsername) 
	{
		this.username = newUsername;
	}
	
    /**
     * 
     * @param newPwd the password that shall be assigned to the manager
     */
	public void setPassword(String newPwd) 
	{
		this.password = newPwd;
	}

    /**
     * @return the username of the employee
     */
    public String getUsername() 
	{
		return this.username;
	}
	
    /**
     * @return the password of the employee
     */
	public String getPassword() 
	{
		return this.password;
	}
}
