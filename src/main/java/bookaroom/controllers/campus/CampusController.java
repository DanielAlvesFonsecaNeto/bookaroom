package bookaroom.controllers.campus;

import bookaroom.models.campus.CampusModel;
import bookaroom.models.equipment.EquipmentModel;
import bookaroom.models.room.RoomModel;
import bookaroom.util.dbumanager.IDBUManager;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;


public class CampusController implements ICampusController{
    private final IDBUManager instanceDBUManager;

    public CampusController(IDBUManager instanceDBUManager) {
        this.instanceDBUManager = instanceDBUManager;
    }

    @Override
    public void createCampus(CampusModel campusModel) {
        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().persist(campusModel);
        instanceDBUManager.getEntityManager().getTransaction().commit();
    }

    @Override
    public void updateCampus(CampusModel campusModel) {
        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().merge(campusModel);
        instanceDBUManager.getEntityManager().getTransaction().commit();
    }

    @Override
    public void deleteCampus(CampusModel campusModel) {
        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().remove(campusModel);
        instanceDBUManager.getEntityManager().getTransaction().commit();
    }

    @Override
    public CampusModel findCampusById(Integer id) {
        try {
            return instanceDBUManager.getEntityManager().find(CampusModel.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean campusIsOpen(Integer id, DayOfWeek dayOfWeek, LocalTime initialHour, LocalTime finalHour) {
        CampusModel campusModel = findCampusById(id);
        return campusModel.getHorarioDeFuncionamento().isOpen(dayOfWeek, initialHour, finalHour);
    }

    @Override
    public void addEquipment(Integer id, EquipmentModel equipmentModel) {
        CampusModel campusModel = findCampusById(id);
        campusModel.getEquipments().add(equipmentModel);
        updateCampus(campusModel);
    }

    @Override
    public List<EquipmentModel> listEquipments(Integer id) {
        CampusModel campusModel = findCampusById(id);
        return campusModel.getEquipments();
    }

    @Override
    public List<CampusModel> listCampus() {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT c FROM CampusModel c", CampusModel.class).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<RoomModel> listRooms(Integer id) {
        try {
            CampusModel campusModel = findCampusById(id);
            return campusModel.getBuildings().stream().flatMap(buildingModel -> buildingModel.getRooms().stream()).collect(Collectors.toList());

        } catch (Exception e) {
            return null;
        }
    }

}
