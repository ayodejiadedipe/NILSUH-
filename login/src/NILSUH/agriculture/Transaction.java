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



	// getters and setters
	public String getTransType() {
		return transtype;
	}

	public String getPaymentType() {
		return paytype;
	}

	public double getAmount() {
		return amount;
	}


	/**
	 * int return the transfer number
	 */
	public int getTransNum() {
		return transNum;
	}

	/**
	 * transNum the transNum to set
	 */
	public void setTransNum(int transNum) {
		this.transNum = transNum;
	}

	/**
	 * Date return the date
	 */
	public String getEntryDate() {
		return entryDate;
	}
	
	public void setEntryDate(String entryDate) {
		this.entryDate=entryDate;
	}


	/**
	 * double return the remain
	 */
	public double getRemain() {
		return remain;
	}


	/**
	 * String return the purpose
	 */
	public int getPurpose() {
		return purpose;
	}

	/**
	 * int return the quantity Numbers
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
	 * Date return the dateClose
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
