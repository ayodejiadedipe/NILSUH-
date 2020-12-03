import java.util.ArrayList;

public class Person {
	protected String name;
	protected Gender gender;
	protected String address;
	protected String email;
	protected String phoneNumber;
	protected String loginStatus;
	
	public Person(String name,Gender gender, String address, String email, String phoneNumber, String loginStatus) {
		this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.loginStatus = loginStatus;
		
	}
	
	// Returns Person name
    public String getName(){
        return this.name;
    }

     // Returns  Person Gender
     public Gender getGender(){
        return this.gender;
    }

    // Returns  Person Address
    public String getAddress(){
        return this.address;
    }

    //Returns  Person email address
    public String getEmail(){
        return this.email;
    }
    
    // Returns  Person Phone Number
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    // Setters
    
    // Edit Client name
    public void setName(String newName){
        this.name = newName;
    }

     // Edit  Person Gender
     public void setGender(Gender newGender){
        this.gender = newGender;
    }

    //Edit Person Address
    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    //Edit Person email address
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    // Edit Person Phone Number
    public void setPhoneNumber(String newNum){
        this.phoneNumber = newNum;
    }
    
    public void setLoginStatus(String status){
        this.loginStatus = status;
    }
    
    public String getLoginStatus() {
    	return this.loginStatus;
    }
    public String toString() {
    	return "Name: "+this.name+"\n"+"Gender: "+this.gender+"\n"+"Address: "+this.address+"\n"+"Email: "+this.email+"\n"+"Phone Number: "+this.phoneNumber+"\n"+"Status:"+this.loginStatus;
    }
    
    public static void main(String[] args){
        
        ArrayList<Person> pList = new ArrayList<Person>();
        pList.add(new Person("Roy Brown",Gender.MALE, "London Way, Kinston 5", "roy123@gmail.com","876-453-0026","Active"));
        
        //System.out.println();
        System.out.println("New Person list\n"+pList);
    }
}
