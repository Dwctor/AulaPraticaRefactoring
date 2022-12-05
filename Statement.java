import java.util.Enumeration;

public abstract class Statement {

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

    public abstract String Title(Customer aCustomer);

    public abstract String Body(Rental aRental);

    public abstract String Tail(Customer aCustomer);

}