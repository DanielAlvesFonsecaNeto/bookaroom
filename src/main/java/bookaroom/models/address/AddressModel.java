package bookaroom.models.address;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table
public class AddressModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(length = 100)
    private String street;

    @NotNull
    private Integer number;

    @Column(length = 100)
    private String complement;

    @NotNull
    @Column(length = 100)
    private String neighborhood;

    @NotNull
    @Column(length = 100)
    private String city;

    @NotNull
    @Column(length = 100)
    private String state;

    @NotNull
    @Column(length = 100)
    private String country;

    @NotNull
    @Column(length = 30)
    private String zipCode;
    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed>
    public AddressModel() {
    }

    public AddressModel(String street, Integer number, String neighborhood, String city, String state, String country, String zipCode) {
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public AddressModel(String street, Integer number, String complement, String neighborhood, String city, String state, String country, String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }
    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed>
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{")
                .append("id=").append(id)
                .append(", street='").append(street).append('\'')
                .append(", number=").append(number)
                .append(", complement='").append(complement).append('\'')
                .append(", neighborhood='").append(neighborhood).append('\'')
                .append(", city='").append(city).append('\'')
                .append(", state='").append(state).append('\'')
                .append(", country='").append(country).append('\'')
                .append(", zipCode='").append(zipCode).append('\'')
                .append("}");
        return sb.toString();
    }
    //</editor-fold>
}
