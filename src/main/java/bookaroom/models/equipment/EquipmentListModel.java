package bookaroom.models.equipment;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class EquipmentListModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed">
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToMany
    @JoinTable(
            name = "equipment_list",
            joinColumns = @JoinColumn(name = "list_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id")
    )
    private List<EquipmentModel> equipments;
    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed">
    public EquipmentListModel() {
        equipments = new ArrayList<>();
    }

    public EquipmentListModel(List<EquipmentModel> equipments) {
        this.equipments = equipments;
    }

    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed">

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public List<EquipmentModel> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<EquipmentModel> equipments) {
        this.equipments = equipments;
    }

    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed">
    @Override
    public String toString() {
        return "EquipmentListModel{" +
                "id=" + id +
                ", equipments=" + equipments +
                '}';
    }

    //</editor-fold>


}
