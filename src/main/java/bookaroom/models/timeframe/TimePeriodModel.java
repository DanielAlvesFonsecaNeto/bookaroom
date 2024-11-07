package bookaroom.models.timeframe;

import jakarta.persistence.*;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MINUTES;

@Entity
@Table
public class TimePeriodModel implements ITimeFrame {

    //<editor-fold desc="Attributes" defaultstate="collapsed">
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.TIME)
    private LocalTime startTime;

    @Temporal(TemporalType.TIME)
    private LocalTime endTime;
    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed">
    public TimePeriodModel(LocalTime startTime, LocalTime endTime) {
        if(endTime.isBefore(startTime) || startTime.isAfter(endTime)){
            throw new IllegalArgumentException("End time must be after start time");
        }

        this.startTime = startTime;
        this.endTime = endTime;
    }

    public TimePeriodModel() {

    }
    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed">


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    //</editor-fold>

    //<editor-fold desc="Methods" defaultstate="collapsed">

    @Override
    public boolean isValid() {
        return startTime.isBefore(endTime);
    }

    @Override
    public long getDurationMinutes() {
        return startTime.until(endTime, MINUTES);
    }

    @Override
    public boolean isWithinInterval(LocalTime time) {
        return time.isAfter(startTime) && time.isBefore(endTime);
    }
    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed">

    @Override
    public String toString() {
        return "TimePeriod{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
    //</editor-fold>
}
