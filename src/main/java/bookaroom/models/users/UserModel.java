package bookaroom.models.users;

import bookaroom.models.employee.EmployeeModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class UserModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    @Id
    @Column(length = 100)
    private String userLogin;

    @Column(length = 100)
    private String passWordLogin;

    private Boolean admLogin;
    //</editor-fold>
    @NotNull
    @OneToOne
    @JoinColumn(name = "employee_id")
    private EmployeeModel employee;

    //<editor-fold desc="Constructor" defaultstate="collapsed>
    public UserModel(String userLogin, String passWordLogin, Boolean admLogin,EmployeeModel employee) {
        this.userLogin = userLogin;
        this.passWordLogin = passWordLogin;
        this.admLogin = admLogin;
        this.employee = employee;
    }

    public UserModel() {
    }

    //</editor-fold>


    //<editor-fold desc="Getters and Setters" defaultstate="collapsed>
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPassWordLogin() {
        return passWordLogin;
    }

    public void setPassWordLogin(String passWordLogin) {
        this.passWordLogin = passWordLogin;
    }

    public Boolean getAdmLogin() {
        return admLogin;
    }

    public void setAdmLogin(Boolean admLogin) {
        this.admLogin = admLogin;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }

    //</editor-fold>

    @Override
    public String toString() {
        return "UserModel{" + "userLogin=" + userLogin + ", passWordLogin=" + passWordLogin + ", admLogin=" + admLogin + ", employee=" + employee + '}';
    }
    
    
}
