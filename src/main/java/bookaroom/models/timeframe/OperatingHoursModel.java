package bookaroom.models.timeframe;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table
public class OperatingHoursModel implements ITimeFrame{

    //<editor-fold desc="Attributes" defaultstate="collapsed">
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(9)")
    private DayOfWeek dayOfWeek;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "time_period_id")
    private TimePeriodModel operatingHours;

    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public OperatingHoursModel(DayOfWeek dayOfWeek, TimePeriodModel operatingHours) {
        this.dayOfWeek = dayOfWeek;
        this.operatingHours = operatingHours;
    }

    public OperatingHoursModel() {

    }

    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed">

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public TimePeriodModel getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(TimePeriodModel operatingHours) {
        this.operatingHours = operatingHours;
    }


    //</editor-fold>

    //<editor-fold desc="Methods" defaultstate="collapsed">

    @Override
    public boolean isValid() {
        return operatingHours.isValid() &&
                operatingHours.getStartTime().isAfter(LocalTime.MIN) &&
                operatingHours.getEndTime().isBefore(LocalTime.MAX);
    }

    @Override
    public long getDurationMinutes() {
        return operatingHours.getDurationMinutes();
    }

    @Override
    public boolean isWithinInterval(LocalTime time) {
        return dayOfWeek.equals(DayOfWeek.from(time)) &&
                operatingHours.isWithinInterval(time);
    }

    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed">

    @Override
    public String toString() {
        return "OperatingHours{" +
                "id=" + id +
                ", dayOfWeek=" + dayOfWeek +
                ", operatingHours=" + operatingHours +
                '}';
    }
    //</editor-fold>
}
