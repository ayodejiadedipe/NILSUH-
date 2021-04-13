package agriculture;
import java.util.ArrayList;


public class Client extends Person {
	 	private int id;
	 	static ArrayList<Client> cList = new ArrayList<Client>();
	   

	    public Client(String name,Gender gender, String address, String email, String phoneNumber, String loginStatus, int id)
	    {
	        
	        super(name, gender, address, email, phoneNumber, loginStatus);
	        	this.id = id;
	        	
	        
	    }

	    /**
		 * 
		 * @return the ID that was assigned to the client 
		 */
	    public int getId(){
	        return this.id;
	    }

	 	/**
		  * 
		  * @param newId sets the ID of the client 
		  */
	    public void setIdNumber(int newId){
	        this.id = newId;
	    }
	    
		/**
		 * @return the client information as a single string 
		 */
	    public String toString() 
	    { 
	        return (super.toString()+ 
	                "\nClient#: "+"\n"+id+"\n"); 
	    } 
	    
	
	    
	    
	    public static void main(String[] args){
	        
	        
	       // ArrayList<Client> clientList = new ArrayList<Client>();
	      Client c1 = new Client("Roy Brown",Gender.MALE, "London Way, Kinston 5", "roy123@gmail.com","876-453-0026","Non-Active",22003);
	      //String name,Gender gender, String address, String email, String phoneNumber, String loginStatus,int id
	        cList.add(c1);
	        //c1.getId();
	        
	        //System.out.println();
	        System.out.println("Client list\n"+cList);
	       // clientList.addClient(new (Client("Roy Brown",Gender.MALE, "London Way, Kinston 5", "roy123@gmail.com","876-453-0026","Non-Active",22003));
	       // System.out.println(clientList.addClient(2000,Gender.MALE, "London Way, Kinston 5", "roy123@gmail.com","876-453-0026","Non-Active",22003););
	    }
	    
	   

}
