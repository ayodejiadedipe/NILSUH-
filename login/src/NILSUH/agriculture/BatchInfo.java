package NILSUH.construction;

public class BatchInfo {

    protected date entryDate;
    protected int mortality, remain, amount;
    protected date slaughterDate;
    protected Double feedCost, medicineCost;
    

    public void updateMortality(int mort){
        mortality = mort;
        remain = remain - mort;
    }

    public int getMortality(){
        return mortality;
    }

    public int getRemain(){
        return remain;
    }

    public int setAmount(int amount){
        this.amount = amount;
    }

    public date getSlaughterDate(){
        return slaughterDate;
    }

    public void updateMedCost(Double cost){
        medicineCost = medicineCost + cost;
    }

    public void updateFeedCost(Double cost){
        feedCost = feedCost + cost;
    }

    

    

    
}