package bookaroom.views;

import bookaroom.controllers.Controller;
import bookaroom.util.dbumanager.IDBUManager;
import bookaroom.views.ui.TelaLogin;

public class UserConsole {
    
    private IDBUManager instanceDBUManager;

    public UserConsole(IDBUManager instanceDBUManager) {
        this.instanceDBUManager = instanceDBUManager;
    }
    
     public void startUiInterface(){
        
        Controller controller = Controller.getInstance();
        controller.setDBUManger(instanceDBUManager); 
         
        Sessao sessao = Sessao.getInstance();
        sessao.setDBUManger(instanceDBUManager);
         
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.startScream();
     }
    
}
