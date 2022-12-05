import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = Title(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += Body(each);
        }
        //add footer lines
        result += Tail(aCustomer);
        return result;
    }

    public String Title(Customer aCustomer){
        return "Rental Record for " + aCustomer.getName() +
        "\n";
    }

    public String Body(Rental aRental){
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
        String.valueOf(aRental.getCharge()) + "\n";
    }

    public String Tail(Customer aCustomer){
        return "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n"
        + "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
    }
}