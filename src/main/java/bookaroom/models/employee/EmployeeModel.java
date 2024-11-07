package bookaroom.models.employee;

import bookaroom.models.address.AddressModel;
import bookaroom.models.campus.CampusModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class EmployeeModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column (length = 100)
    private String name;

    @NotNull
    @Column (length = 11)
    private String cpf;

    @NotNull
    @Column (length = 100)
    private String email;

    @NotNull
    @OneToOne (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn (name = "address_id")
    private AddressModel addressModel;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "campus_id")
    private CampusModel campusModel;


    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed>

    public EmployeeModel() {
    }

    public EmployeeModel(String name, String cpf, String email, AddressModel addressModel) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.addressModel = addressModel;
    }

    public EmployeeModel(String name, String cpf, String email, AddressModel addressModel, CampusModel campusModel) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.addressModel = addressModel;
        this.campusModel = campusModel;
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed>

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressModel getAddress() {
        return addressModel;
    }

    public void setAddress(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    public CampusModel getCampusModel() {
        return campusModel;
    }

    public void setCampusModel(CampusModel campusModel) {
        this.campusModel = campusModel;
    }

    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed>
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\t\tEmployees{")
                .append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", cpf='").append(cpf).append('\'')
                .append(", email='").append(email).append('\'')
                .append(", address=").append(addressModel)
                .append(", Campus=").append(campusModel.getName())
                .append('}');
        return sb.toString();
    }
    //</editor-fold>
}
