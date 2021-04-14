package agriculture;

/**
 * @author Orley Huslin 
 * @author Itawnya Walker
 * @author Ayodeji Adedipe
 * @author Saphrah-Ann Wint
 * @author Denzil Plummer 
 * 
 */

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
     * @return the ID that was assigned to be batch 
     */
    public int getId(){
        return batch_id;
    }
    
    /**
     * 
     * @param date the date that the log was done
     */
    public void setEntryDate(String date){
        this.entryDate=date;
    }

    /**
     * @return the string containing the entry date of the batch 
     */
    public String getEntryDate(){
        return entryDate;
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

    public String toString(){
        String s;
        s = "Batch ID#: " + getId() + "\n" + "Entry Date: " + getEntryDate() + "\n" + "Mortality: " + 
            getMortality() + "\n" + "Feed Cost: " + getFeedCost() + "\n" + "Medicine Cost: " + getMedicineCost()
            + "\n";
        return s;
    }

}
