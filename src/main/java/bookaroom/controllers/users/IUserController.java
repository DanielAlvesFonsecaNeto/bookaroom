package bookaroom.controllers.users;

import bookaroom.models.users.UserModel;

public interface IUserController {

    /*
     * Mostra um usuario dado um login e senha
     *
     * @param login login do usuario
     * @param password senha do usuario
     * @return usuario
     */
    UserModel showUser(String login, String password);
}
