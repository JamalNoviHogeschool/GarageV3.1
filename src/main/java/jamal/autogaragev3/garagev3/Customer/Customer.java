package jamal.autogaragev3.garagev3.Customer;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "customerName")
    String customerName;

    @Column(name = "customerLastName")
    String customerLastName;

    @Column( name = "phoneNumber")
    Long phoneNumber;

    @Column(name = "customerEmail")
    String customerEmail;

    @Column(name = "customerAddress")
    String customerAddress;

    public Customer() {
    }

    public Customer(Long id, String customerName, String customerLastName, Long phoneNumber, String customerEmail, String customerAddress) {
        this.id = id;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.phoneNumber = phoneNumber;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Customer))
            return false;
        Customer customer = (Customer) o;
        return Objects.equals(this.id, customer.id) && Objects.equals(this.customerName, customer.customerName) && Objects.equals(this.customerLastName, customer.customerLastName)
                && Objects.equals(this.customerEmail, customer.customerEmail) && Objects.equals(this.phoneNumber, customer.phoneNumber) && Objects.equals(this.customerAddress, customer.customerAddress);
        }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.customerName, this.customerLastName, this.phoneNumber, this.customerEmail, this.customerAddress);
    }

}
