package bookaroom.models.room;

import bookaroom.models.building.BuildingModel;
import bookaroom.models.timeframe.WeeklyScheduleModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class RoomModel {

    //<editor-fold desc="Enum" defaultstate="collapsed">
    public enum TypeRoom {
        LABORATORY,
        CLASSROOM,
        AUDITORIUM,
        OTHER;
    }
    //</editor-fold>

    //<editor-fold desc="Attributes" defaultstate="collapsed">
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Integer code;

    @NotNull
    private Integer capacity;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeRoom type;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "building_id")
    private BuildingModel buildingModel;
    

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weeklySch_id")
    private WeeklyScheduleModel weeklyScheduleModel;

    

    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed">


    public RoomModel() {
    }

    public RoomModel(Integer code, Integer capacity, TypeRoom type , WeeklyScheduleModel weeklyScheduleModel ,BuildingModel buildingModel) {
        this.code = code;
        this.capacity = capacity;
        this.type = type;
        this.weeklyScheduleModel = weeklyScheduleModel;
        this.buildingModel = buildingModel;
        }
    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed">

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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public TypeRoom getType() {
        return type;
    }

    public void setType(TypeRoom type) {
        this.type = type;
    }

    public WeeklyScheduleModel getWeeklySchedule() {
        return weeklyScheduleModel;
    }

    public void setWeeklySchedule(WeeklyScheduleModel weeklyScheduleModel) {
        this.weeklyScheduleModel = weeklyScheduleModel;
    }

    public BuildingModel getBuildingModel() {
        return buildingModel;
    }

    public void setBuildingModel(BuildingModel buildingModel) {
        this.buildingModel = buildingModel;
    }

//</editor-fold>

    //<editor-fold desc="toString">

    @Override
    public String toString() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("\n\t\t\t\tRooms{")
                .append("id=").append(id)
                .append(", code=").append(code)
                .append(", capacity=").append(capacity)
                .append(", type=").append(type)
                .append("}");
        return sb.toString();*/
        if(type == TypeRoom.OTHER){
            return "Predio :  " + buildingModel + "   ---- sala :  SALA NUCLEO   " + code ; 
        }
        
        return "Predio :  " + buildingModel + "   ---- sala :  " + type.name() +"   " + code ;
    }
    //</editor-fold>
}
