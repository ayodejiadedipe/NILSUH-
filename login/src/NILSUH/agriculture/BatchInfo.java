package agriculture;

public class BatchInfo {
    protected int batch_id;
    protected String entryDate;
    protected int mortality, remain, amount;
    protected String slaughterDate;
    protected double feedCost, medicineCost;
    
    public BatchInfo(int mortality, int remain, int amount, String slaughterDate, double feedCost, double medicineCost){
        this.mortality=mortality;
        this.remain = remain;
        this.amount=amount; 
        this.slaughterDate = slaughterDate;
        this.feedCost = feedCost;
        this.medicineCost = medicineCost; 
    }

    /**
     * @param id the ID# that batch shall be assigned 
     */
    public void setId(int id){
        this.batch_id= id;
    }
    
    /**
     * 
     * @param date the date that the log was done
     */
    public void setEntryDate(String date){
        this.entryDate=date;
    }
    
    /**
     * 
     * @return the amount that this batch has cost
     */
    public int getAmount(){
        return amount;
    }

    /**
     * 
     * @return the mortality of this batch 
     */
    public int getMortality(){
        return mortality;
    }

    /**
     * 
     * @return balance left in the account 
     */
    public int getRemain(){
        return remain;
    }

    /**
     * 
     * @return the expected slaughter date of the specific batch
     */
    public String getSlaughterDate(){
        return slaughterDate;
    }

    /**
     * 
     * @return the total cost that the batch has accumulated for feed
     */
    public double getFeedCost(){
        return feedCost;
    }

    /**
     * 
     * @return the total cost that the batch has accumulated for medicine 
     */
    public double getMedicineCost(){
        return medicineCost;
    }

}
