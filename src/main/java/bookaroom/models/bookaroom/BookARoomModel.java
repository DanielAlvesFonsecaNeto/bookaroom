package bookaroom.models.bookaroom;

import bookaroom.models.equipment.EquipmentListModel;
import bookaroom.models.room.RoomModel;
import bookaroom.models.employee.EmployeeModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table
public class BookARoomModel {



    //<editor-fold desc="Enum" defaultstate="collapsed">
    public enum Status {
        CONCLUDED,
        CONFIRMED,
        CANCELLED
    }
    //</editor-fold>

    //<editor-fold desc="Attributes" defaultstate="collapsed">
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private LocalDate bookingdate;

    @NotNull
    private LocalTime bookingtimeini;

    @NotNull
    private LocalTime bookingtimeend;

    private String description;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @NotNull
    @ManyToOne
    @JoinColumn (name = "employee_id")
    private EmployeeModel employee;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "room_id")
    private RoomModel room;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "equipment_list_id")
    private EquipmentListModel equipmentList;

    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed">


    public BookARoomModel() {
    }

    public BookARoomModel(LocalDate bookingdate, LocalTime bookingtimeini, LocalTime bookingtimeend, String description, Status status, EmployeeModel employee, RoomModel room, EquipmentListModel equipmentList) {
        this.bookingdate = bookingdate;
        this.bookingtimeini = bookingtimeini;
        this.bookingtimeend = bookingtimeend;
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.room = room;
        this.equipmentList = equipmentList;
    }

    public BookARoomModel(String description, Status status, EmployeeModel employee, RoomModel room, EquipmentListModel equipmentList) {
        this.description = description;
        this.status = status;
        this.employee = employee;
        this.room = room;
        this.equipmentList = equipmentList;
    }

    //</editor-fold>


    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(LocalDate bookingdate) {
        this.bookingdate = bookingdate;
    }

    public LocalTime getBookingtimeini() {
        return bookingtimeini;
    }

    public void setBookingtimeini(LocalTime bookingtimeini) {
        this.bookingtimeini = bookingtimeini;
    }

    public LocalTime getBookingtimeend() {
        return bookingtimeend;
    }

    public void setBookingtimeend(LocalTime bookingtimeend) {
        this.bookingtimeend = bookingtimeend;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public EmployeeModel getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeModel employee) {
        this.employee = employee;
    }

    public RoomModel getRoom() {
        return room;
    }

    public void setRoom(RoomModel room) {
        this.room = room;
    }

    public EquipmentListModel getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(EquipmentListModel equipmentList) {
        this.equipmentList = equipmentList;
    }


    //</editor-fold>

    //<editor-fold desc="Methods" defaultstate="collapsed">
    public void cancelBooking() {
        this.status = Status.CANCELLED;
    }

    public void confirmBooking() {
        this.status = Status.CONFIRMED;
    }

    public boolean isAvailable() {
        ///criar metodo para verificar se a sala esta disponivel para reserva
        return true;
    }
    //</editor-fold>

    //<editor-fold desc="toString" defaultstate="collapsed">

    @Override
    public String toString() {
        return "BookARoomModel{" +
                "id=" + id +
                ", bookingdate=" + bookingdate +
                ", bookingtimeini=" + bookingtimeini +
                ", bookingtimeend=" + bookingtimeend +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", employee=" + employee +
                ", room=" + room +
                ", equipmentList=" + equipmentList +
                '}';
    }

    //</editor-fold>

}
