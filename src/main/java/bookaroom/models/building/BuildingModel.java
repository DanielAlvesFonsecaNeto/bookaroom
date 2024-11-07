package bookaroom.models.building;

import bookaroom.models.room.RoomModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class BuildingModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Integer code;

    @NotNull
    @Column(length = 100)
    private String name;

    @NotNull
    private boolean active;

    @OneToMany (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn (name = "building_id")
    private List<RoomModel> roomModels;
    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed>
    public BuildingModel() {
        this.active = true;
        roomModels = new ArrayList<>();
    }

    public BuildingModel(Integer code, String name, boolean active) {
        this.code = code;
        this.name = name;
        this.active = active;
        roomModels = new ArrayList<>();
        }
    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed>
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<RoomModel> getRooms() {
        return roomModels;
    }

    public void setRooms(List<RoomModel> roomModels) {
        this.roomModels = roomModels;
    }
    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed>
    @Override
    public String toString() {
       /* StringBuilder sb = new StringBuilder();
        sb.append("\n\t\tBuilding{")
                .append("id=").append(id)
                .append(", code=").append(code)
                .append(", name='").append(name).append('\'')
                .append(", active=").append(active)
                .append(", rooms=").append(roomModels)
                .append("\n\t\t}");
        return sb.toString();
    */
       return name + " "+ code ;
    }   
    //</editor-fold>
}
