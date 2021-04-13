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
	private int purpose;
	private int quanNum;
	private double quanPound;
	private String source;
	private String destination;
	private String Description;
	private int status;
	private String dateOpen;
	private String dateClose;

	// the Transaction constructor

	public Transaction(String transtype, String paytype, double amount, double remain,
			int purpose, int quanNum, double quanPound, String source, String destination, String Description,
			int status, String dateOpen, String dateClose) {
		
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
	public int getPurpose() {
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
	public int getStatus() {
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
		result = "'" + ", type='" + getTransType() + "'"+ getPaymentType() + "'" + ", transNum='" + getTransNum() + "'"
				+ ", date='" + getEntryDate() + "'" + ", amount='" + fmt.format(getAmount()) + "'" + ", remain='"
				+ fmt.format(getRemain()) + "'" + ", purpose='" + getPurpose() + "'" + ", quanNum='" + getQuanNum()
				+ "'" + ", quanPound='" + getQuanPound() + "'" + ", source='" + getSource() + "'" + ", destination='"
				+ getDestination() + "'" + ", Description='" + getDescription() + "'" + ", status='" + getStatus() + "'"
				+ ", dateOpen='" + getDateOpen() + "'" + ", dateClose='" + getDateClose() + "'";
		return result;
	}

}
