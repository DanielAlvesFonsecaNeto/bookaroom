package bookaroom.models.timeframe;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;


@Entity
@Table
public class WeeklyScheduleModel {

    //<editor-fold desc="Attributes" defaultstate="collapsed">
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "monday_id")
    private OperatingHoursModel Monday;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "tuesday_id")
    private OperatingHoursModel Tuesday;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "wednesday_id")
    private OperatingHoursModel Wednesday;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "thursday_id")
    private OperatingHoursModel Thursday;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "friday_id")
    private OperatingHoursModel Friday;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "saturday_id")
    private OperatingHoursModel Saturday;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "sunday_id")
    private OperatingHoursModel Sunday;

    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed">

    public WeeklyScheduleModel(){

    }

    //</editor-fold>

    //<editor-fold desc="Getter and Setter" defaultstate="collapsed">

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OperatingHoursModel getMonday() {
        return Monday;
    }

    public void setMonday(OperatingHoursModel monday) {
        Monday = monday;
    }

    public OperatingHoursModel getTuesday() {
        return Tuesday;
    }

    public void setTuesday(OperatingHoursModel tuesday) {
        Tuesday = tuesday;
    }

    public OperatingHoursModel getWednesday() {
        return Wednesday;
    }

    public void setWednesday(OperatingHoursModel wednesday) {
        Wednesday = wednesday;
    }

    public OperatingHoursModel getThursday() {
        return Thursday;
    }

    public void setThursday(OperatingHoursModel thursday) {
        Thursday = thursday;
    }

    public OperatingHoursModel getFriday() {
        return Friday;
    }

    public void setFriday(OperatingHoursModel friday) {
        Friday = friday;
    }

    public OperatingHoursModel getSaturday() {
        return Saturday;
    }

    public void setSaturday(OperatingHoursModel saturday) {
        Saturday = saturday;
    }

    public OperatingHoursModel getSunday() {
        return Sunday;
    }

    public void setSunday(OperatingHoursModel sunday) {
        Sunday = sunday;
    }


    //</editor-fold>

    //<editor-fold desc="Methods" defaultstate="collapsed">
    public boolean isOpen(DayOfWeek dayOfWeek, LocalTime initialHour, LocalTime finalHour){
        switch (dayOfWeek){
            case MONDAY:
                return Monday.getOperatingHours().getStartTime().isBefore(initialHour) && Monday.getOperatingHours().getEndTime().isAfter(finalHour);
            case TUESDAY:
                return Tuesday.getOperatingHours().getStartTime().isBefore(initialHour) && Tuesday.getOperatingHours().getEndTime().isAfter(finalHour);
            case WEDNESDAY:
                return Wednesday.getOperatingHours().getStartTime().isBefore(initialHour) && Wednesday.getOperatingHours().getEndTime().isAfter(finalHour);
            case THURSDAY:
                return Thursday.getOperatingHours().getStartTime().isBefore(initialHour) && Thursday.getOperatingHours().getEndTime().isAfter(finalHour);
            case FRIDAY:
                return Friday.getOperatingHours().getStartTime().isBefore(initialHour) && Friday.getOperatingHours().getEndTime().isAfter(finalHour);
            case SATURDAY:
                return Saturday.getOperatingHours().getStartTime().isBefore(initialHour) && Saturday.getOperatingHours().getEndTime().isAfter(finalHour);
            case SUNDAY:
                return Sunday.getOperatingHours().getStartTime().isBefore(initialHour) && Sunday.getOperatingHours().getEndTime().isAfter(finalHour);
            default:
                return false;
        }
    }
    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed">

    @Override
    public String toString() {
        return "WeeklySchedule{" +
                "id=" + id +
                ", Monday=" + Monday +
                ", Tuesday=" + Tuesday +
                ", Wednesday=" + Wednesday +
                ", Thursday=" + Thursday +
                ", Friday=" + Friday +
                ", Saturday=" + Saturday +
                ", Sunday=" + Sunday +
                '}';
    }
    //</editor-fold>
}
