package bookaroom.models.equipment;

import bookaroom.models.campus.CampusModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class EquipmentModel {


    //<editor-fold desc="ENUM" defaultstate="collapsed>

    public enum TypeEquipament{
        MICROCOMPUTER,
        NOTEBOOK,
        TABLET,
        PROJECTOR,
        MICROPHONE,
        SPEAKER;
    }

    //

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column (length = 100)
    private String name;

    @NotNull
    @Column (length = 16)
    private String code;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeEquipament type;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "campus_id")
    private CampusModel campusModel;

    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed>

    public EquipmentModel() {

    }

    public EquipmentModel(String name, String code, TypeEquipament type, CampusModel campusModel) {
        this.name = name;
        this.code = code;
        this.type = type;
        this.campusModel = campusModel;
    }

    public EquipmentModel(String name, String code, TypeEquipament type) {
        this.name = name;
        this.code = code;
        this.type = type;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public TypeEquipament getType() {
        return type;
    }

    public void setType(TypeEquipament type) {
        this.type = type;
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
        sb.append("\n\t\t\t\tEquipment{")
                .append("id=").append(id)
                .append(", name='").append(name).append('\'')
                .append(", code='").append(code).append('\'')
                .append(", campus=").append(campusModel.getName())
                .append('}');
        return sb.toString();
    }
    //</editor-fold>
}
