package agriculture;

import java.sql.Date;

public class Manager extends Employee {
	private String username;
	private String password;
	

	public Manager(String name,Gender gender, String address, String email, String phoneNumber, String loginStatus,String position, Date start, Date end, String username, String password) 
	{
	
	super(name, gender, address, email, phoneNumber, loginStatus,position,start,end);
		this.username = username;
		this.password = password;
	
	}
	//Getters
	
	// Returns user name
	
	public String getUsername() 
	{
		return this.username;
	}
	//Returns passwords
	public String getPassword() 
	{
		return this.password;
	}
		

}