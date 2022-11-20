package jamal.autogaragev3.garagev3.Car;

import jamal.autogaragev3.garagev3.Customer.Customer;

import javax.persistence.*;
    @Entity
    @Table(name = "Cars")
    public class Car {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @ManyToOne
        @JoinColumn(name = "ownerID")
        private Customer ownerID;

        @Column(name = "licensePlate")
        private String licensePlate;

        @Column(name = "Brand")
        private String brand;

        @Column(name = "Model")
        private String model;

        @Column(name = "versionYear")
        private int versionYear;


        //setters
        public void setId(long id) {
            this.id = id;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setVersionYear(int versionYear) {
            this.versionYear = versionYear;
        }

        //getters
        public long getId() {
            return id;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getVersionYear() {
            return versionYear;
        }

    }