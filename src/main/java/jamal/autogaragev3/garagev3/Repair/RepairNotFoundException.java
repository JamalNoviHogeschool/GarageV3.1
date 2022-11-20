package jamal.autogaragev3.garagev3.Repair;

public class RepairNotFoundException extends RuntimeException {

    public RepairNotFoundException(Long id) {super("Could not find repair " + id);}

    }
