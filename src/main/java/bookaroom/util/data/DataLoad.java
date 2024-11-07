package bookaroom.util.data;

import bookaroom.models.room.RoomModel;
import bookaroom.models.timeframe.OperatingHoursModel;
import bookaroom.models.timeframe.TimePeriodModel;
import bookaroom.models.timeframe.WeeklyScheduleModel;
import bookaroom.util.dbumanager.IDBUManager;
import bookaroom.models.address.AddressModel;
import bookaroom.models.building.BuildingModel;
import bookaroom.models.campus.CampusModel;
import bookaroom.models.employee.EmployeeModel;
import bookaroom.models.equipment.EquipmentModel;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DataLoad {

    //<editor-fold desc="Attributes" defaultstate="collapsed>
    private static boolean executed = false;
    private  static  DataLoad instance;
    private static IDBUManager instanceDBUManager;

    //</editor-fold>

    //<editor-fold desc="Constructor" defaultstate="collapsed>

    //</editor-fold>

    //<editor-fold desc="Methods" defaultstate="collapsed>

    //<editor-fold desc="Populate DB" defaultstate="collapsed>

    private void Populate() {


        TimePeriodModel dailyCampusSchedule = new TimePeriodModel(LocalTime.of(5, 0), LocalTime.of(22, 0));

        OperatingHoursModel campusOperatingHoursModelMonday = new OperatingHoursModel(DayOfWeek.MONDAY, dailyCampusSchedule);
        OperatingHoursModel campusOperatingHoursModelTuesday = new OperatingHoursModel(DayOfWeek.TUESDAY, dailyCampusSchedule);
        OperatingHoursModel campusOperatingHoursModelWednesday = new OperatingHoursModel(DayOfWeek.WEDNESDAY, dailyCampusSchedule);
        OperatingHoursModel campusOperatingHoursModelThursday = new OperatingHoursModel(DayOfWeek.THURSDAY, dailyCampusSchedule);
        OperatingHoursModel campusOperatingHoursModelFriday = new OperatingHoursModel(DayOfWeek.FRIDAY, dailyCampusSchedule);

        WeeklyScheduleModel campusOperatingHours = new WeeklyScheduleModel();
        campusOperatingHours.setMonday(campusOperatingHoursModelMonday);
        campusOperatingHours.setTuesday(campusOperatingHoursModelTuesday);
        campusOperatingHours.setWednesday(campusOperatingHoursModelWednesday);
        campusOperatingHours.setThursday(campusOperatingHoursModelThursday);
        campusOperatingHours.setFriday(campusOperatingHoursModelFriday);



        // Construção de horario semanal
        //Salas


        //Periodo inicial até final
        TimePeriodModel dailyClassroomSchedule = new TimePeriodModel(LocalTime.of(7, 20), LocalTime.of(18, 40));

        //horario  de Operacao Diaria
        OperatingHoursModel classroomOperatingHoursModelMonday = new OperatingHoursModel(DayOfWeek.MONDAY, dailyClassroomSchedule);
        OperatingHoursModel classroomOperatingHoursModelTuesday = new OperatingHoursModel(DayOfWeek.TUESDAY, dailyClassroomSchedule);
        OperatingHoursModel classroomOperatingHoursModelWednesday = new OperatingHoursModel(DayOfWeek.WEDNESDAY, dailyClassroomSchedule);
        OperatingHoursModel classroomOperatingHoursModelThursday = new OperatingHoursModel(DayOfWeek.THURSDAY, dailyClassroomSchedule);
        OperatingHoursModel classroomOperatingHoursModelFriday = new OperatingHoursModel(DayOfWeek.FRIDAY, dailyClassroomSchedule);

        //horario semanal

        WeeklyScheduleModel classroomOperatingHours = new WeeklyScheduleModel();
        classroomOperatingHours.setMonday(classroomOperatingHoursModelMonday);
        classroomOperatingHours.setTuesday(classroomOperatingHoursModelTuesday);
        classroomOperatingHours.setWednesday(classroomOperatingHoursModelWednesday);
        classroomOperatingHours.setThursday(classroomOperatingHoursModelThursday);
        classroomOperatingHours.setFriday(classroomOperatingHoursModelFriday);




        // Contrução de funcionarios - Ainda não defindo campus
        //enderecos
        //moc
        AddressModel addressFunc1 = new AddressModel("Rua 01", 23, "Centro", "Montes Claros", "MG", "Brasil", "301-0001");
        AddressModel addressFunc2 = new AddressModel("Rua 03", 42, "Centro", "Montes Claros", "MG", "Brasil", "301-0001");
        AddressModel addressFunc3 = new AddressModel("Rua 08", 3, "Canelas", "Montes Claros", "MG", "Brasil", "301-0001");
        //januaria
        AddressModel addressFunc4 = new AddressModel("Rua 11", 174, "centro", "Januaria", "MG", "Brasil", "301-0001");
        AddressModel addressFunc5 = new AddressModel("Rua 62", 264, "Ribeirinho", "Januaria", "MG", "Brasil", "301-0001");

        //Funcionarios  MOC
        EmployeeModel employeeMoc1 = new EmployeeModel("Lucio","01452114-54","Lucio@email.com.br",addressFunc1);
        EmployeeModel employeeMoc2 = new EmployeeModel("Caribe","01134714-07","Caribe@email.com.br",addressFunc2);
        EmployeeModel employeeMoc3 = new EmployeeModel("Alberto","03454134-14","Alberto@email.com.br",addressFunc3);

        //Funcionarios  JANU
        EmployeeModel employeeJanu1 = new EmployeeModel("Maria","21422124-22","Maria.Aviar@email.com.br",addressFunc4);
        EmployeeModel employeeJanu2 = new EmployeeModel("Rita","31412137-01","ritinhaVasconcelos@email.com.br",addressFunc5);




        // Contrução de Salas
        //MOC
        //Predio 1
        BuildingModel buildingMoc01 = new BuildingModel(1,"Predio Principal",true);
        
        RoomModel receptionRoomMocP1 = new RoomModel(1,5, RoomModel.TypeRoom.OTHER,null,buildingMoc01);

        //Sala de Aula
        RoomModel classroomMoc01 = new RoomModel(1,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc01);
        RoomModel classroomMoc02 = new RoomModel(2,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc01);
        RoomModel classroomMoc03 = new RoomModel(3,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc01);
        RoomModel classroomMoc04 = new RoomModel(4,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc01);
        RoomModel classroomMoc05 = new RoomModel(5,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc01);

        //Labs
        RoomModel mocLab01 = new RoomModel(1,20, RoomModel.TypeRoom.LABORATORY,null,buildingMoc01);
        RoomModel mocLab02 = new RoomModel(2,20, RoomModel.TypeRoom.LABORATORY,null,buildingMoc01);

        //Auditorio
        RoomModel mocAuditorium01 = new RoomModel(1,100, RoomModel.TypeRoom.AUDITORIUM,null,buildingMoc01);


        //Predio 2
        BuildingModel buildingMoc02 = new BuildingModel(1,"Predio Integrado",true);
        
        RoomModel receptionRoomMocP2 = new RoomModel(1,5, RoomModel.TypeRoom.OTHER,null,buildingMoc02);

        //Sala de Aula
        RoomModel classroomMoc06 = new RoomModel(1,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc02);
        RoomModel classroomMoc07 = new RoomModel(2,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc02);
        RoomModel classroomMoc08 = new RoomModel(3,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc02);
        RoomModel classroomMoc09 = new RoomModel(4,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingMoc02);


        //Labs
        RoomModel mocLab03 = new RoomModel(1,20, RoomModel.TypeRoom.LABORATORY,null,buildingMoc02);
        RoomModel mocLab04 = new RoomModel(2,20, RoomModel.TypeRoom.LABORATORY,null,buildingMoc02);
        RoomModel mocLab05 = new RoomModel(3,20, RoomModel.TypeRoom.LABORATORY,null,buildingMoc02);


        //Januaria
        //Predio 1
        BuildingModel buildingJanu01 = new BuildingModel(1,"Predio Principal",true);
        
        RoomModel receptionRoomJanuP1 = new RoomModel(1,5, RoomModel.TypeRoom.OTHER,null,buildingJanu01);

        //Sala de Aula
        RoomModel classroomJanu01 = new RoomModel(1,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingJanu01);
        RoomModel classroomJanu02 = new RoomModel(2,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingJanu01);
        RoomModel classroomJanu03 = new RoomModel(3,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingJanu01);
        RoomModel classroomJanu04 = new RoomModel(4,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingJanu01);
        RoomModel classroomJanu05 = new RoomModel(5,40, RoomModel.TypeRoom.CLASSROOM,classroomOperatingHours,buildingJanu01);

        //Labs
        RoomModel januLab01 = new RoomModel(1,20, RoomModel.TypeRoom.LABORATORY,null,buildingJanu01);
        RoomModel januLab02 = new RoomModel(2,20, RoomModel.TypeRoom.LABORATORY,null,buildingJanu01);

        //Auditorio
        RoomModel januAuditorium01 = new RoomModel(1,100, RoomModel.TypeRoom.AUDITORIUM,null,buildingJanu01);
        RoomModel januAuditorium02 = new RoomModel(2,100, RoomModel.TypeRoom.AUDITORIUM,null,buildingJanu01);




        // insercao de salas nos Predios
        //MOC
        //Predio 1

        
        buildingMoc01.getRooms().add(receptionRoomMocP1);
        buildingMoc01.getRooms().add(classroomMoc01);
        buildingMoc01.getRooms().add(classroomMoc02);
        buildingMoc01.getRooms().add(classroomMoc03);
        buildingMoc01.getRooms().add(classroomMoc04);
        buildingMoc01.getRooms().add(classroomMoc05);
        buildingMoc01.getRooms().add(mocLab01);
        buildingMoc01.getRooms().add(mocLab02);
        buildingMoc01.getRooms().add(mocAuditorium01);

        //Predio 2

        
        buildingMoc02.getRooms().add(receptionRoomMocP2);
        buildingMoc02.getRooms().add(classroomMoc06);
        buildingMoc02.getRooms().add(classroomMoc07);
        buildingMoc02.getRooms().add(classroomMoc08);
        buildingMoc02.getRooms().add(classroomMoc09);
        buildingMoc02.getRooms().add(mocLab03);
        buildingMoc02.getRooms().add(mocLab04);
        buildingMoc02.getRooms().add(mocLab05);


        //Januaria

        
        buildingJanu01.getRooms().add(receptionRoomJanuP1);
        buildingJanu01.getRooms().add(classroomJanu01);
        buildingJanu01.getRooms().add(classroomJanu02);
        buildingJanu01.getRooms().add(classroomJanu03);
        buildingJanu01.getRooms().add(classroomJanu04);
        buildingJanu01.getRooms().add(classroomJanu05);
        buildingJanu01.getRooms().add(januLab01);
        buildingJanu01.getRooms().add(januLab02);
        buildingJanu01.getRooms().add(januAuditorium01);
        buildingJanu01.getRooms().add(januAuditorium02);



        // Contrução de Campus
        //MOC
        //endereço do campus
        AddressModel addressCampusMoc = new AddressModel("Rua do diabo", 666, "Village", "Montes Claros", "MG", "Brasil", "301-0001");

        // Criando Campus
        CampusModel campusMoc = new CampusModel("Campus Montes Claros", addressCampusMoc, buildingMoc01,campusOperatingHours);
        campusMoc.getBuildings().add(buildingMoc02);

        //adicionando  funcionarios

        employeeMoc1.setCampusModel(campusMoc);
        employeeMoc2.setCampusModel(campusMoc);
        employeeMoc3.setCampusModel(campusMoc);

        List<EmployeeModel> employeeListMoc = new ArrayList<>();

        employeeListMoc.add(employeeMoc1);
        employeeListMoc.add(employeeMoc2);
        employeeListMoc.add(employeeMoc3);

        /** Aqui em baixo vc comenta o campusMoc.setEmployees(employeeListMoc); e depois faz a consulta de lista de funcionario do campus "Select from campus c funcioario lista*/
        campusMoc.setEmployees(employeeListMoc);

        //Januaria
        //endereço do campus
        AddressModel addressCampusJanu = new AddressModel("Rua JJ", 123, "Egalliv", "Januaria", "MG", "Brasil", "301-0001");

        // Criando Campus
        CampusModel campusJanu = new CampusModel("Campus Januaria", addressCampusJanu, buildingJanu01,campusOperatingHours);

        //adicionando  funcionarios

        employeeJanu1.setCampusModel(campusJanu);
        employeeJanu2.setCampusModel(campusJanu);

        List<EmployeeModel> employeeListJanu = new ArrayList<>();

        employeeListJanu.add(employeeJanu1);
        employeeListJanu.add(employeeJanu2);

        /** ----------------------------------------------------------------------------------- */
        campusJanu.setEmployees(employeeListJanu);

        // Contrução de Equipamentos
        //MOC

        List<EquipmentModel> equipmentMocList = new ArrayList<>();

        equipmentMocList.add(new EquipmentModel("Notebook Dell","01" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusMoc));
        equipmentMocList.add(new EquipmentModel("Notebook Dell","02" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusMoc));
        equipmentMocList.add(new EquipmentModel("Notebook Dell","03" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusMoc));
        equipmentMocList.add(new EquipmentModel("Notebook Dell","04" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusMoc));
        equipmentMocList.add(new EquipmentModel("Notebook Acer","05" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusMoc));
        equipmentMocList.add(new EquipmentModel("Notebook Acer","06" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusMoc));

        equipmentMocList.add(new EquipmentModel("Projetor Multilaser","01" ,EquipmentModel.TypeEquipament.PROJECTOR , campusMoc));
        equipmentMocList.add(new EquipmentModel("Projetor Positivo","02" ,EquipmentModel.TypeEquipament.PROJECTOR , campusMoc));
        equipmentMocList.add(new EquipmentModel("Projetor Positivo","03" ,EquipmentModel.TypeEquipament.PROJECTOR , campusMoc));

        equipmentMocList.add(new EquipmentModel("Microfone AA","01" ,EquipmentModel.TypeEquipament.MICROPHONE , campusMoc));
        equipmentMocList.add(new EquipmentModel("Microfone AA","02" ,EquipmentModel.TypeEquipament.MICROPHONE , campusMoc));


        campusMoc.setEquipments(equipmentMocList);

        //Janu

        List<EquipmentModel> equipmentJanuList = new ArrayList<>();

        equipmentJanuList.add(new EquipmentModel("Notebook Dell","01" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Notebook Dell","02" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Notebook Dell","03" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Notebook Dell","04" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Notebook Acer","05" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Notebook Acer","06" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));
        equipmentJanuList.add(new EquipmentModel("MacBook","07" ,EquipmentModel.TypeEquipament.NOTEBOOK , campusJanu));

        equipmentJanuList.add(new EquipmentModel("Projetor Multilaser","01" ,EquipmentModel.TypeEquipament.PROJECTOR , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Projetor Positivo","02" ,EquipmentModel.TypeEquipament.PROJECTOR , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Projetor Positivo","03" ,EquipmentModel.TypeEquipament.PROJECTOR , campusJanu));

        equipmentJanuList.add(new EquipmentModel("Microfone AA","01" ,EquipmentModel.TypeEquipament.MICROPHONE , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Microfone AA","02" ,EquipmentModel.TypeEquipament.MICROPHONE , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Microfone AA","03" ,EquipmentModel.TypeEquipament.MICROPHONE , campusJanu));
        equipmentJanuList.add(new EquipmentModel("Microfone AA","04" ,EquipmentModel.TypeEquipament.MICROPHONE , campusJanu));

        campusJanu.setEquipments(equipmentJanuList);



        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().merge(campusMoc);
        instanceDBUManager.getEntityManager().getTransaction().commit();

        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().merge(campusJanu);
        instanceDBUManager.getEntityManager().getTransaction().commit();



        executed = true;

    }

    //</editor-fold>

    public static DataLoad getInstance(IDBUManager instanceDBUManager1) {
        if(instance == null){
            instance = new DataLoad();
        }
        instanceDBUManager = instanceDBUManager1;
        return instance;
    }

    public String PopulateDB(){
        if(!executed){
            Populate();
            return "\n\nDB  populated successfully!!";
        }
        else
            return "\n\nThe DB has already been populated and cannot be populated again!!";
    }

    //</editor-fold>


}
