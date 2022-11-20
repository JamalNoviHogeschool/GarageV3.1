package jamal.autogaragev3.garagev3.CarPart;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarPartDto {

    private Long id;
    private String name;
    private String model;
    private String versionYear;
    private String brand;
    private double price;
    private int stock;


}
