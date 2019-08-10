public class Reservation {

    private double pricePerDAy;
    private  int numberOfDay;
    private Season season;
    private Discount discount;

    public Reservation(double pricePerDAy, int numberOfDay, Season season, Discount discount) {
        this.pricePerDAy = pricePerDAy;
        this.numberOfDay = numberOfDay;
        this.season = season;
        this.discount = discount;
    }

    public double getPricePerDAy() {
        return pricePerDAy;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public Season getSeason() {
        return season;
    }

    public Discount getDiscount() {
        return discount;
    }
}
