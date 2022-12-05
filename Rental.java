public class Rental {

   private Movie _movie;
   private int _daysRented;

   public double getCharge(){
      return _movie.getCharge(_daysRented);
   }

   public int getFrequentRenterPoints() {

      // add bonus for a two day new release rental for a total of 2 points
      if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
      getDaysRented() > 1) return 2;

      // 1 point per renting
      return 1;
   }

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
}