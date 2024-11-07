package bookaroom.util.dbumanager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DBUManagerTest implements IDBUManager {

    private static DBUManagerTest instance = null;

    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    private DBUManagerTest() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("BookARoomPUTest");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public static DBUManagerTest getInstance() {
        
        if(instance == null){
        instance = new DBUManagerTest();
        }
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
