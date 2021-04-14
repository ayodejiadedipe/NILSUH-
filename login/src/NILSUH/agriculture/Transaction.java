package agriculture;
import java.text.NumberFormat;

//instance of variables
public class Transaction {
	private int transNum;
	private String transtype;
	private String paytype;
	private String entryDate;
	private double amount;
	private double remain;
	private String purpose;
	private int quanNum;
	private double quanPound;
	private String source;
	private String destination;
	private String Description;
	private String status;
	private String dateOpen;
	private String dateClose;

	// the Transaction constructor

	public Transaction(String transtype, String paytype, double amount, double remain,
			String purpose, int quanNum, double quanPound, String source, String destination, String Description,
			String status, String dateOpen, String dateClose) {
		
		this.transtype = transtype;
		this.paytype = paytype;
		this.amount = amount;
		this.remain = remain;
		this.purpose = purpose;
		this.quanNum = quanNum;
		this.quanPound = quanPound;
		this.source = source;
		this.destination = destination;
		this.Description = Description;
		this.status = status;
		this.dateOpen = dateOpen;
		this.dateClose = dateClose;
	}



	/**
	 * 
	 * @return string of the type of transaction done 
	 */
	public String getTransType() {
		return transtype;
	}

	/**
	 * 
	 * @return string of the payment type used for transaction 
	 */
	public String getPaymentType() {
		return paytype;
	}

	/**
	 * @return double value of the amount used in transaction 
	 */
	public double getAmount() {
		return amount;
	}


	/**
	 *@return int of the transaction number that was assigned 
	 */
	public int getTransNum() {
		return transNum;
	}

	/**
	 *@param int tNum that is to be assigned to the transaction 
	 */
	public void setTransNum(int tNum) {
		this.transNum = tNum;
	}

	/**
	 * @return string of the entry date of the log 
	 */
	public String getEntryDate() {
		return entryDate;
	}
	
	/**
	 * 
	 * @param entryDate sets the entry date of the log
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate=entryDate;
	}


	/**
	 *@return double of the balance left in the account 
	 */
	public double getRemain() {
		return remain;
	}


	/**
	 *@return int of the purpose of the transaction 
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * 
	 */
	public int getQuanNum() {
		return quanNum;
	}


	/**
	 * double return the quanPound
	 */
	public double getQuanPound() {
		return quanPound;
	}


	/**
	 * String return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * String return the destination
	 */
	public String getDestination() {
		return destination;
	}


	/**
	 * String return the Description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * boolean return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Date return the dateOpen
	 */
	public String getDateOpen() {
		return dateOpen;
	}


	/**
	 * @return string fo the  the date close
	 */
	public String getDateClose() {
		return dateClose;
	}


	// This Method is to deposit a specified amount into the account
	void deposit(Double balance) {
		this.amount = amount + balance;
	}

	// This Method is to withdraw a specified amount from the account
	void withdrawal(Double balance) {
		this.amount = amount - balance;
	}

	@Override
	public String toString() {
		String result = "";
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		result = "Type: " + "\n" + getTransType() + "\n" + "Payment Type: " + getPaymentType() + "\n" + "Transaction ID#: '" + getTransNum() + "\n"
				+ "Date: '" + getEntryDate() + "\n" + "Amount: '" + fmt.format(getAmount()) + "\n" + "Remain: '"
				+ fmt.format(getRemain()) + "\n" + "Purpose: '" + getPurpose() + "\n" + "Quantity Number: '" + getQuanNum()
				+ "\n" + "Quantity Pound: '" + getQuanPound() + "\n" + "Source: '" + getSource() + "\n" + "Destination: '"
				+ getDestination() + "\n" + "Description: '" + getDescription() + "\n" + "Status: '" + getStatus() + "\n"
				+ "Date Open: " + getDateOpen() + "\n" + "Date Close: " + getDateClose() + "\n\n";
		return result;
	}

}
