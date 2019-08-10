public class PriceCalculator {

   public static double calculate(Reservation resevation){

       double basePrice = resevation.getPricePerDAy() * resevation.getNumberOfDay() * resevation.getSeason().getMultiplier();
       double percent = 1 - (resevation.getDiscount().getPercentDiscount() / 100.0);
       return basePrice * percent;
   }
}
