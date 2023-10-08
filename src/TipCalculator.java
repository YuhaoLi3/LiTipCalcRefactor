public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        this.totalBillBeforeTip = 0.0;
    }
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }
    public double getTipPercentage(){
        return tipPercentage;
    }
    public void addMeal(double cost){
        totalBillBeforeTip += cost;
    }
    public double tipAmount(){
        return totalBillBeforeTip * (tipPercentage/100.0);
    }
    public double totalbill(){
        return totalBillBeforeTip +tipAmount();

    }
    public double perPersonCostBeforeTip(){
        return totalBillBeforeTip/numPeople;
    }
    public double perPersonTipAmount(){
        return tipAmount()/numPeople;
    }
    public double perPersonTotalCost(){
        return totalbill()/numPeople;
    }
}
