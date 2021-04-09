import java.text.NumberFormat;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;

//instance of variables
public class Transaction {
	private String type;
	private int transNum;
	private Double remain;
	private LocalDate entryDate;
	private String dateOpen;
	private String dateClose;
	private int status;
	private Double  amount;
	private int purpose;
	private Double quanPound;
	private int quanNum;
	private String fr;
	private String t_o;
	private String description;


	// the Transaction constructor

	public Transaction(String type, Double amount, int purpose, Double quanPound, int quanNum, String fr, String t_o, String description) {
		this.type = type;
		this.transNum = transNum;
		this.purpose = purpose;

		if(purpose == 0 || purpose == 5){
			this.remain = amount + remain;
		}
		else{
			this.remain = remain - amount;
		}

		this.entryDate = java.time.LocalDate.now();
		this.status = 0;
		this.amount = amount;
		this.quanPound = quanPound;
		this.quanNum = quanNum;
		this.fr = fr;
		this.t_o = t_o;
		this.description = description;
	}

	// get type of transaction
	public String getType() {
		return type;
	}

	//get transaction ID#
	public int getId(){
		return transNum;
	}

	//get remaining balance 
	public Double getBalance(){
		return remain;
	}

	//get date recorded
	public LocalDate getEntryDate(){
		return entryDate;
	}

	//sets the open date of the transaction
	public void setOpenDate(String op){
		try{
			int d = Integer.parseInt(op);
			
		}
		catch(Exception e){
			System.out.println("Invalid format or values. Please enter in the format MM/DD/YYY");
		}
	}

	//get the date the transaction was done
	public String getDateOpen(){
		return dateOpen;
	}

	//set the closing date of transaction
	public void setCloseDate(String cl){
		SimpleDateFormat close = new SimpleDateFormat("MM/dd/yyyy");
		LocalDate test = null;
		try{
			dateClose = new SimpleDateFormat("MM/dd/yyyy").parse(cl);
		}
		catch(Exception e){
			System.out.println("Invalid format. Please put in the format MM/DD/YY");
		}
	}

	//get the date the transaction was completed and closed 
	public String getDateClose(){
		return dateClose;
	}

	//set the status of the transaction whether it is open or closed
	public void setStatus(int st){
		status = st;
	}

	//gets the status of the transaction whether it is open or closed
	public String getStatus(){
		String status_1 = "Open";
		String status_2 = "Closed";
		if(status==0){
			return status_1;
		}
		else{
			return status_2;
		}
	}

	//get the amount in questions for the transaction
	public Double getAmount(){
		return amount;
	}

	//set the purpose of transaction 
	public void setPurpose(int p){
		purpose = p;
	}

	//get the purpose of the transaction 
	public String getPurpose(){
		if(purpose == 0){
			return "Sale";
		}
		else if(purpose==1){
			return "Loan";
		}
		else if(purpose==2){
			return "Credit";
		}
		else if(purpose==3){
			return "Loss";
		}
		else if(purpose==4){
			return "Investment";
		}
		else if(purpose==5){
			return "Loan Repayment";
		}
		else if(purpose==6){
			return "Miscellaneous Fees";
		}
		else if(purpose==7){
			return "Allocation for Banker";
		}
		else{
			return "Unknown purpose";
		}
	}

	//set quantity in pound
	public void setQuanPound(Double pound){
		quanPound = pound;
	}

	//gets the quantity in pound 
	public Double getQuanPound(){
		return quanPound;
	}

	//sets the number of chicken sold 
	public int getQuanNum(){
		return quanNum;
	}

	//sets where the transaction source is 
	public void setSource(String f){
		fr = f;
	}

	//gets the source of the transaction 
	public String getSource(){
		return fr;
	}

	//sets the destination of the transaction 
	public void setTransDestination(String t){
		t_o = t;
	}

	//get the destination of the transaction ]
	public String getDestination(){
		return t_o;
	}

	//sets the description of transaction 
	public void  setDescription(String des){
		description = des;
	}

	//get the transaction description 
	public String getDescription(){
		return description;
	}

	//to string method to get the details of the transaction 
	public String toString(){
		String trans = "Type: " +  getType() + "\n" + "Transaction ID#: " + getId() + "\n" + "Balance: " + getBalance() + "\n" + "Recorded Date: " + getEntryDate() +  "\n" +
		"Date Open: " + getDateOpen() + "Date Close: " + getDateClose() + "Status: " + getStatus() + "\n" + "Amount: " + getAmount() + "\n" + 
		"Purpose: " + getPurpose() + "\n" + "Quantity in Pound(s): " + getQuanPound() + "\n" + "Number of chickes sold: " + getQuanNum() + "\n" + 
		"Coming From: " + getSource() + "\n" + "Going To: " + getDestination() + "\n" + "Description: " + "\n";
	}

}
