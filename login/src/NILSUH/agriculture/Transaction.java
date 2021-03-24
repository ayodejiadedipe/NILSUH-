import java.sql.Date;
import java.text.NumberFormat;

//instance of variables
public class Transaction {
	private String name;
	private String type;
	private int transNum;
	private Date entryDate;
	private double amount;
	private double remain;
	private String purpose;
	private int quanNum;
	private double quanPound;
	private String source;
	private String destination;
	private String Description;
	private int status;
	private Date dateOpen;
	private Date dateClose;

	// the Transaction constructor

	public Transaction(String name, String type, int transNum, Date entryDate, double amount, double remain,
			String purpose, int quanNum, double quanPound, String source, String destination, String Description,
			int status, Date dateOpen, Date dateClose) {
		this.name = name;
		this.type = type;
		this.transNum = transNum;
		this.entryDate = entryDate;
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

	public Transaction(String name2, String type2, int transNum2, int i, double amount2, double remain2,
			String purpose2, int quanNum2, double quanPound2, String source2, String destination2, String description2,
			int status2, int j, int k) {
	}

	// getters and setters
	String getName() {
		return name;
	}

	String getType() {
		return type;
	}

	double getAmount() {
		return amount;
	}

	void setType(String newtype) {
		this.type = newtype;
	}

	void setAmount(Double amount) {
		this.amount = amount;
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
	public Date getEntryDate() {
		return entryDate;
	}

	/**
	 * date the date to set
	 */
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	/**
	 * double return the remain
	 */
	public double getRemain() {
		return remain;
	}

	/**
	 * remain the remain to set
	 */
	public void setRemain(double remain) {
		this.remain = remain;
	}

	/**
	 * String return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	/**
	 * int return the quantity Numbers
	 */
	public int getQuanNum() {
		return quanNum;
	}

	/**
	 * quantity Number the quantity Number to set
	 */
	public void setQuanNum(int quanNum) {
		this.quanNum = quanNum;
	}

	/**
	 * double return the quanPound
	 */
	public double getQuanPound() {
		return quanPound;
	}

	/**
	 * quanPound the quanPound to set
	 */
	public void setQuanPound(double quanPound) {
		this.quanPound = quanPound;
	}

	/**
	 * String return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * String return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * String return the Description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * Description the Description to set
	 */
	public void setDescription(String Description) {
		this.Description = Description;
	}

	/**
	 * boolean return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Date return the dateOpen
	 */
	public Date getDateOpen() {
		return dateOpen;
	}

	/**
	 * dateOpen the dateOpen to set
	 */
	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}

	/**
	 * Date return the dateClose
	 */
	public Date getDateClose() {
		return dateClose;
	}

	/**
	 * dateClose the dateClose to set
	 */
	public void setDateClose(Date dateClose) {
		this.dateClose = dateClose;
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
		result = "name='" + getName() + "'" + ", type='" + getType() + "'" + ", transNum='" + getTransNum() + "'"
				+ ", date='" + getEntryDate() + "'" + ", amount='" + fmt.format(getAmount()) + "'" + ", remain='"
				+ fmt.format(getRemain()) + "'" + ", purpose='" + getPurpose() + "'" + ", quanNum='" + getQuanNum()
				+ "'" + ", quanPound='" + getQuanPound() + "'" + ", source='" + getSource() + "'" + ", destination='"
				+ getDestination() + "'" + ", Description='" + getDescription() + "'" + ", status='" + getStatus() + "'"
				+ ", dateOpen='" + getDateOpen() + "'" + ", dateClose='" + getDateClose() + "'";
		return result;
	}

}
