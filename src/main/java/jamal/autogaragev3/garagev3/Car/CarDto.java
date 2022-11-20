package jamal.autogaragev3.garagev3.Car;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CarDto {
    private int id;
    private String Brand;
    private String Model;
    private String licensePlate;
    private int versionYear;



}
