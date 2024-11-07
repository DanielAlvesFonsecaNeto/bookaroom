package bookaroom.util.data;

import bookaroom.models.users.UserModel;
import bookaroom.util.dbumanager.IDBUManager;
import bookaroom.models.employee.EmployeeModel;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;

public class SimpleDataLoad {

    //Essa classe será executada de qualquer forma na main

    private final IDBUManager instanceDBUManager;
    public SimpleDataLoad(IDBUManager instanceDBUManager){
        this.instanceDBUManager = instanceDBUManager;
    }


    public void populate() {

        DataLoad dataLoad = DataLoad.getInstance(instanceDBUManager);
        System.out.println(dataLoad.PopulateDB());

        // inserir users após pegar os funcionarios de DataLoad
        TypedQuery<EmployeeModel> query = instanceDBUManager.getEntityManager().createQuery(
                "SELECT e FROM EmployeeModel e",
                EmployeeModel.class);
        List<EmployeeModel> employees = query.getResultList();

        List<UserModel> userModelsList = new ArrayList<>();

        for(EmployeeModel result : employees){
            userModelsList.add(new UserModel(result.getName(),"123",false, result));
        }

        instanceDBUManager.getEntityManager().getTransaction().begin();
        for(UserModel result : userModelsList){
            instanceDBUManager.getEntityManager().merge(result);
        }
        instanceDBUManager.getEntityManager().getTransaction().commit();


        //definir Lucio e Maria como ADMs caso eles existam no banco
        try {

            UserModel userLucio;
            UserModel userMaria;

            TypedQuery<UserModel> query2 = instanceDBUManager.getEntityManager().createQuery(
                    "SELECT u FROM UserModel u WHERE userLogin = :name",
                    UserModel.class);
            query2.setParameter("name", "Lucio");
            userLucio = query2.getSingleResult();

            TypedQuery<UserModel> query3 = instanceDBUManager.getEntityManager().createQuery(
                    "SELECT u FROM UserModel u WHERE userLogin = :name",
                    UserModel.class);
            query3.setParameter("name", "Maria");
            userMaria = query3.getSingleResult();


            userLucio.setPassWordLogin("adm123");
            userLucio.setAdmLogin(true);
            userMaria.setPassWordLogin("adm123");
            userMaria.setAdmLogin(true);

            instanceDBUManager.getEntityManager().getTransaction().begin();
            instanceDBUManager.getEntityManager().merge(userLucio);
            instanceDBUManager.getEntityManager().merge(userMaria);
            instanceDBUManager.getEntityManager().getTransaction().commit();


        }catch (IllegalArgumentException e) {
            System.err.println("Error: User not found");
        }




    }
}
