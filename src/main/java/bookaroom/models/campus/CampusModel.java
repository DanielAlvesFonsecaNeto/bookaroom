package bookaroom.models.campus;

import bookaroom.models.address.AddressModel;
import bookaroom.models.building.BuildingModel;
import bookaroom.models.employee.EmployeeModel;
import bookaroom.models.equipment.EquipmentModel;
import bookaroom.models.timeframe.WeeklyScheduleModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Entity
@Table
public class CampusModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(length = 100)
    private String name;

    @NotNull
    @OneToOne (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn (name = "address_id")
    private AddressModel addressModel;

    @OneToMany (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn (name = "campus_id")
    private List<BuildingModel> buildingModels;

    @OneToMany (mappedBy = "campusModel", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<EquipmentModel> equipmentModels;

    @OneToMany (mappedBy = "campusModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EmployeeModel> employeeModels;


    //</editor-fold>

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "WeeklySch_id")
    private WeeklyScheduleModel horarioDeFuncionamento;

    //<editor-fold desc="Constructor" defaultstate="collapsed>
    public CampusModel(String campusMontesClaros, AddressModel enderecoCampusMoc, BuildingModel predioMoc01) {
        buildingModels = new ArrayList<>();
        equipmentModels = new ArrayList<>();
        employeeModels = new ArrayList<>();
    }
    public CampusModel(String name, AddressModel addressModel, BuildingModel buildingModelCore, WeeklyScheduleModel horarioDeFuncionamento) {
        this.name = name;
        this.addressModel = addressModel;
        buildingModels = new ArrayList<>();
        buildingModels.add(buildingModelCore);
        this.horarioDeFuncionamento = horarioDeFuncionamento;
    }

    public CampusModel() {

    }
    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed>
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

    public AddressModel getAddress() {
        return addressModel;
    }

    public void setAddress(AddressModel addressModel) {
        this.addressModel = addressModel;
    }

    public List<BuildingModel> getBuildings() {
        return buildingModels;
    }

    public void setBuildings(List<BuildingModel> buildingModels) {
        this.buildingModels = buildingModels;
    }

    public List<EquipmentModel> getEquipments() {
        return equipmentModels;
    }

    public void setEquipments(List<EquipmentModel> equipmentModels) {
        this.equipmentModels = equipmentModels;
    }

    public List<EmployeeModel> getEmployees() {
        return employeeModels;
    }

    public void setEmployees(List<EmployeeModel> employeeModels) {
        this.employeeModels = employeeModels;
    }

    public WeeklyScheduleModel getHorarioDeFuncionamento() {
        return horarioDeFuncionamento;
    }

    public void setHorarioDeFuncionamento(WeeklyScheduleModel horarioDeFuncionamento) {
        this.horarioDeFuncionamento = horarioDeFuncionamento;
    }

    //</editor-fold>

    //<editor-fold desc="Methods" defaultstate="collapsed>


    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed>
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCampus{")
                .append("\n    id=").append(id)
                .append(",\n    name='").append(name).append('\'')
                .append(",\n    address=").append(addressModel)
                .append(",\n    buildings=").append(buildingModels);

        List<String> equipmentNames = equipmentModels.stream()
                .sorted(Comparator.comparing(EquipmentModel::getName).thenComparing(EquipmentModel::getCode))
                .map(equipmentModel -> equipmentModel.getName() + "(" + equipmentModel.getCode() + ")")
                .collect(Collectors.toList());

        sb.append(",\n    equipment=").append(String.join(", ", equipmentNames));

        List<String> employeesNames = employeeModels.stream()
                .sorted(Comparator.comparing(EmployeeModel::getName).thenComparing(EmployeeModel::getCpf))
                .map(employeeModel -> employeeModel.getName() + "(" + employeeModel.getCpf() + ")")
                .collect(Collectors.toList());

        sb.append(",\n    employees=").append(String.join(", ", employeesNames));

        sb.append("\n}");
        return sb.toString();
    }

    //</editor-fold>
}
