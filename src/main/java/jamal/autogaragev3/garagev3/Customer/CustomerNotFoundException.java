package jamal.autogaragev3.garagev3.Customer;

public class CustomerNotFoundException  extends RuntimeException{

    public CustomerNotFoundException(Long id) {
        super("Could not find customer " + id);
    }

}
