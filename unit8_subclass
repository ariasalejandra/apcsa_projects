public class farmInfo
{
    private String crop;
    private double peracre;
    private double anacre;
    private int days;
    private boolean goodCrops;
    public farmInfo(String crop, double perAcre, double anAcre, int days, boolean good){
        this.crop = crop;
        peracre = perAcre;
        anacre = anAcre;
        this.days = days;
        good = goodCrops;
    }
    public farmInfo(){
        crop = "No Crops";
        peracre = 0;
        anacre = 0;
        days = 0;
        goodCrops = false;
    }
    public String getCrop(){
      return crop;
    }
    public double getSell(){
        return peracre;
    }
    public double getCost(){
        return anacre;
    }
    public int getDays(){
        return days;
    }
    public void changeCrop(String newCrop){
        crop = newCrop;
    }
    public void changeSell(double sell){
        peracre = sell;
    }
    public void changeCost(double cost){
        anacre = cost;
    }
    public void changeDays(int newDay){
        days = newDay;
    }
    public void changeBool(boolean change){
        goodCrops = change;
    }
    public int enoughDays(int day){
        int bool;
        if (day > days){
            if (days == 0){
                bool = 0;
            } else {
                bool = 1;
            }
        } else {
            bool = 0;
        }
        return bool;
    }
    public int income(){
        int inc = (int)(peracre - anacre);
        return inc;
    }
    public double income(double numDays){
        int profit = (int)(peracre - anacre);
        int division = 0;
        if (days != 0){
            division = (int)(numDays / days);
        } else {
            division = 0;
        }
        double total = (double)(profit * division);
        return total;
    }
    public String toString(){
        if (goodCrops == true){
        return "Crop: "+crop+"\tSell Price: "+peracre+"\tCost: "+anacre+"\tDays to Harvest: "+days;
        } else {
        return crop;
        }
     }
}

