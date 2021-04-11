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


    public void setId(int id){
        this.batch_id= id;
    }
    
    public void setEntryDate(String date){
        this.entryDate=date;
    }
    
    public int getAmount(){
        return amount;
    }

    public int getMortality(){
        return mortality;
    }

    public int getRemain(){
        return remain;
    }

    public String getSlaughterDate(){
        return slaughterDate;
    }

    public double getFeedCost(){
        return feedCost;
    }

    public double getMedicineCost(){
        return medicineCost;
    }

}
