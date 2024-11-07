package bookaroom.controllers.campus;

import bookaroom.models.campus.CampusModel;
import bookaroom.models.equipment.EquipmentModel;
import bookaroom.models.room.RoomModel;
import bookaroom.util.dbumanager.IDBUManager;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

public interface ICampusController {
    /**
     * Cria um novo campus.
     *
     * @param campusModel o campus a ser criado.
     */
    void createCampus(CampusModel campusModel);

    /**
     * Atualiza um campus.
     *
     * @param campusModel o campus a ser atualizado.
     */
    void updateCampus(CampusModel campusModel);

    /**
     * Remove um campus.
     *
     * @param campusModel o campus a ser removido.
     */
    void deleteCampus(CampusModel campusModel);

    /**
     * Busca um campus pelo seu id.
     *
     * @param id o id do campus a ser buscado.
     * @return o campus buscado.
     */
    CampusModel findCampusById(Integer id);

    /**
     * Verifica se um campus está aberto em um determinado dia da semana e horário.
     *
     * @param id          o id do campus a ser verificado.
     * @param dayOfWeek   o dia da semana a ser verificado.
     * @param initialHour a hora inicial a ser verificada.
     * @param finalHour   a hora final a ser verificada.
     * @return true se o campus está aberto no dia da semana e horário especificados, false caso contrário.
     */
    boolean campusIsOpen(Integer id, DayOfWeek dayOfWeek, LocalTime initialHour, LocalTime finalHour);

    /**
     * Adiciona um equipamento a um campus.
     *
     * @param id             o id do campus.
     * @param equipmentModel o equipamento a ser adicionado.
     */
    void addEquipment(Integer id, EquipmentModel equipmentModel);

    /**
     * Lista os equipamentos de um campus.
     *
     * @param id o id do campus.
     * @return a lista de equipamentos do campus.
     */
    List<EquipmentModel> listEquipments(Integer id);

    /**
     * Lista todos os campus.
     *
     * @return a lista de todos os campus.
     */
    List<CampusModel> listCampus();

    /**
     * Lista todas as salas de um campus.
     *
     * @param id o id do campus.
     * @return a lista de salas do campus.
     */
    List<RoomModel> listRooms(Integer id);
}
