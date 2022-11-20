package jamal.autogaragev3.garagev3.Customer;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private Long id;

    private String customerName;

    private String customerLastName;

    private Long phoneNumber;

    private String customerEmail;

    private String customerAddress;

}
