
package agriculture;
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
	
	/**
     * 
     * @return the string name of the person 
     */
    public String getName(){
        return this.name;
    }

     /**
      * @return the gender of the person
      */
    public Gender getGender(){
        return this.gender;
    }

    /**
     * 
     * @return the string address of the person
     */
    public String getAddress(){
        return this.address;
    }

    /**
     * 
     * @return the string email address of the person 
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * @return the string phoneNumber 
     */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    /**
     * 
     * @return the login status of the person
     */
    public String getLoginStatus() {
    	return this.loginStatus;
    }
	
    /** 
     * @return the string of the person information 
     */
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
