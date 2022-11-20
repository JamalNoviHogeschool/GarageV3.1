package jamal.autogaragev3.garagev3.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String Username) {
    super("No user found with username: " + Username);}
}
