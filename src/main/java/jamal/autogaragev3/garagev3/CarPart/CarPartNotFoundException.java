package jamal.autogaragev3.garagev3.CarPart;

public class CarPartNotFoundException extends RuntimeException {
    public CarPartNotFoundException(Long id) { super("Could not find CarPart with id: "); }
}
