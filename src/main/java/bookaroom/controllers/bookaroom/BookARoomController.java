package bookaroom.controllers.bookaroom;

import bookaroom.models.bookaroom.BookARoomModel;
import bookaroom.util.dbumanager.IDBUManager;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class BookARoomController implements IBookARoomController{

    private final IDBUManager instanceDBUManager;

    public BookARoomController(IDBUManager instanceDBUManager) {
        this.instanceDBUManager = instanceDBUManager;
    }

    @Override
    public List<BookARoomModel> listBookARoom(Integer id) {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b", BookARoomModel.class)
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public BookARoomModel findBookARoomById(Integer id) {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b WHERE b.id = :id", BookARoomModel.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void createBookARoom(BookARoomModel bookARoomModel) {
        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().persist(bookARoomModel);
        instanceDBUManager.getEntityManager().getTransaction().commit();
    }

    @Override
    public void updateBookARoom(BookARoomModel bookARoomModel) {
        instanceDBUManager.getEntityManager().getTransaction().begin();
        instanceDBUManager.getEntityManager().merge(bookARoomModel);
        instanceDBUManager.getEntityManager().getTransaction().commit();
    }

    @Override
    public void cancelBookARoom(Integer id) {
        BookARoomModel bookARoomModel = findBookARoomById(id);
        bookARoomModel.setStatus(BookARoomModel.Status.CANCELLED);
        updateBookARoom(bookARoomModel);
    }

    @Override
    public List<BookARoomModel> listCanceledBookARoom() {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b WHERE b.status = :status", BookARoomModel.class)
                    .setParameter("status", "CANCELED")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<BookARoomModel> listActivesBookARoom() {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b WHERE b.status <> :status", BookARoomModel.class)
                    .setParameter("status", "CANCELED")
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<BookARoomModel> listBookARoomByRoomAndDate(Integer id) {

        try{
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b WHERE b.room.id = :id AND b.bookingdate = :bookingDate", BookARoomModel.class)
                    .setParameter("id", id)
                    .setParameter("bookingDate", LocalDate.now())
                    .getResultList();
        } catch (Exception e){
            return null;
        }
    }

    @Override
    public List<BookARoomModel> listBookARoomByRoomAndWeek(Integer id) {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b WHERE b.room.id = :id AND b.bookingdate BETWEEN :initialDate AND :finalDate", BookARoomModel.class)
                    .setParameter("id", id)
                    .setParameter("initialDate", LocalDate.now().with(DayOfWeek.MONDAY))
                    .setParameter("finalDate", LocalDate.now().with(DayOfWeek.SUNDAY))
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<BookARoomModel> listBookARoomByRoomAndMonth(Integer id) {
        try {
            return instanceDBUManager.getEntityManager().createQuery("SELECT b FROM BookARoomModel b WHERE b.room.id = :id AND b.bookingdate BETWEEN :initialDate AND :finalDate", BookARoomModel.class)
                    .setParameter("id", id)
                    .setParameter("initialDate", LocalDate.now().withDayOfMonth(1))
                    .setParameter("finalDate", LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth()))
                    .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
