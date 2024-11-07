package bookaroom.util.dbumanager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUManager implements IDBUManager {

    private static DBUManager instance = new DBUManager();

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    private DBUManager() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BookARoomPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public static DBUManager getInstance() {
        return instance;
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    @Override
    public void closeEntityManager() {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
        if (entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
