package jamal.autogaragev3.garagev3.User;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException() {
        super("custom error thrown");
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
}