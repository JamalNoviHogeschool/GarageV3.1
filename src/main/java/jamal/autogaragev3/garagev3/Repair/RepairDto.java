package jamal.autogaragev3.garagev3.Repair;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RepairDto {

    private Long id;
    private String name;
    private double damage;
    private double price;

    public RepairDto(String name, double damage,double price) {
        this.name = name;
        this.damage = damage;
        this.price = price;
    }
}
