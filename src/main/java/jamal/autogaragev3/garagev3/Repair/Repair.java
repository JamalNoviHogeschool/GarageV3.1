package jamal.autogaragev3.garagev3.Repair;

import jamal.autogaragev3.garagev3.CarPart.CarPart;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "repair")
public class Repair {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double damage;
    private double price;

    @ManyToOne
    private CarPart carPart;


    public Repair() {}
    public Repair(Long id, String name, double damage, double price) {

        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }



}
