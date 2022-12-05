import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
    }

    public String Body(Rental aRental){
        return aRental.getMovie().getTitle()+ ": " +
        String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    public String Tail(Customer aCustomer){
        return "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n"
        + "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
    }
}