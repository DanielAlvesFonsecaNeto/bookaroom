package bookaroom.util.dbumanager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public interface IDBUManager {
    EntityManager getEntityManager();
    EntityManagerFactory getEntityManagerFactory();
    void closeEntityManager();
}
