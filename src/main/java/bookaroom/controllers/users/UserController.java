package bookaroom.controllers.users;

import bookaroom.models.users.UserModel;
import bookaroom.util.dbumanager.IDBUManager;


//// nao sei se ainda usaremos essa classe 

public class UserController implements IUserController {
    private final IDBUManager instanceDBUManager;

    public UserController(IDBUManager instanceDBUManager) {
        this.instanceDBUManager = instanceDBUManager;
    }


    @Override
    public UserModel showUser(String login, String password) {
        try{
            return instanceDBUManager.getEntityManager().createQuery("SELECT u FROM UserModel u WHERE u.userLogin = :login AND u.passWordLogin = :password", UserModel.class)
                    .setParameter("login", login)
                    .setParameter("password", password)
                    .getSingleResult();
        }catch (Exception e){
            return null;
        }
    }
}
