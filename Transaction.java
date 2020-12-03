public class Transaction {

	private String name;
	private long amount;

	   Transaction(String name, long amount)
	   {
	      this.name = name;
	      this.amount = amount;
	   }

	   
	   String getName()
	   {
	      return name;
	   }

	   long getAmount()
	   {
	      return amount;
	   }
	   
	   void setName(String newName) 
	   {
		   this.name = newName;
	   }

	   void setAmount(long amount)
	   {
	      this.amount = amount;
	   }
	   
	   void deposit(long amount)
	   {
	      this.amount += amount;
	   }
	   
	
}
