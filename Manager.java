public class Manager extends Person {
	private String username;
	private String password;
	

	public Manager(String name,Gender gender, String address, String email, String phoneNumber, String loginStatus,String username, String password) 
	{
	
	super(name, gender, address, email, phoneNumber, loginStatus);
		this.username = username;
		this.password = password;
	
	}
	//Getters
	
	// Returns user name
	
	public String getUsename() 
	{
		return this.username;
	}
	//Returns passwords
	public String getPassword() 
	{
		return this.password;
	}
	
	// Setters
	
	public void setUsername(String newUsername) 
	{
		this.username = newUsername;
	}
	
	public void setPassword(String newPwd) 
	{
		this.password = newPwd;
	}
}