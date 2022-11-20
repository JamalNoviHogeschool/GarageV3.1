package jamal.autogaragev3.garagev3.Car;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(Long id) {
        super("Could not find Auto " + id);

    }
}