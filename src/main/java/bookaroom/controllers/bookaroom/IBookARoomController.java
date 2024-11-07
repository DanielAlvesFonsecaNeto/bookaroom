package bookaroom.controllers.bookaroom;

import bookaroom.models.bookaroom.BookARoomModel;

import java.util.List;

public interface IBookARoomController {

    /*
    * Lista todas as reservas de um campus
    *
    * @param id id do campus
    * @return lista de reservas
    */
    List<BookARoomModel> listBookARoom(Integer id);

    /*
     * Busca uma reserva pelo seu id.
     *
     * @param id o id da reserva a ser buscada.
     * @return a reserva buscada.
    */
    BookARoomModel findBookARoomById(Integer id);

    /*
     * Cria uma nova reserva.
     *
     * @param bookARoomModel a reserva a ser criada.
    */
    void createBookARoom(BookARoomModel bookARoomModel);

    /*
     * Atualiza uma reserva.
     *
     * @param bookARoomModel a reserva a ser atualizada.
    */
    void updateBookARoom(BookARoomModel bookARoomModel);

    /*
     * Cancela uma reserva.
     *
     * @param Id da reserva a ser cancelada.
    */
    void cancelBookARoom(Integer id);

    /*
    * Busca as reservas que foram canceladas
    *
    * @return lista de reservas canceladas
    */
    List<BookARoomModel> listCanceledBookARoom();

    /*
     * Busca as reservas que estão ativas
     *
     * @return lista de reservas ativas
     */
    List<BookARoomModel> listActivesBookARoom();

    /*
     * Busca as reservas de uma sala num determinado dia
     *
     * @param id id da sala
     * @return lista de reservas ativas
     */
    List<BookARoomModel> listBookARoomByRoomAndDate(Integer id);

    /*
     * Busca as reservas de uma sala numa determinada semana
     *
     * @param id id da sala
     * @return lista de reservas ativas
     */
    List<BookARoomModel> listBookARoomByRoomAndWeek(Integer id);

    /*
     * Busca as reservas de uma sala num determinado mês
     *
     * @param id id da sala
     * @return lista de reservas ativas
     */
    List<BookARoomModel> listBookARoomByRoomAndMonth(Integer id);
}
