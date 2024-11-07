
package bookaroom.controllers;

import bookaroom.controllers.campus.CampusController;
import bookaroom.models.room.RoomModel;
import bookaroom.util.dbumanager.IDBUManager;
import java.util.List;


public class Controller {

private static Controller instance;
    
private static IDBUManager dBUManager;

private static CampusController campusController;

private Controller(){

}    

public static Controller getInstance(){
    if(instance == null){
        instance = new Controller();
    }
    return instance;
}

public static void setDBUManger(IDBUManager iDBUManager){    /// setar todos os controlers com o banco 
    dBUManager = iDBUManager;    
    
    campusController = new CampusController(dBUManager);
}



public List<RoomModel> listRooms(Integer id) {
    return campusController.listRooms(id);
}



}
