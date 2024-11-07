package bookaroom;

import bookaroom.util.data.SimpleDataLoad;
import bookaroom.util.dbumanager.DBUManagerTest;
import bookaroom.util.dbumanager.IDBUManager;
import bookaroom.views.UserConsole;


public class Main {
    
    private static IDBUManager instanceDBUManager = DBUManagerTest.getInstance();
    
    public static void main(String[] args) {
 
        /* Função para iniciar o banco de dados */
        SimpleDataLoad simpleDataLoad = new SimpleDataLoad(instanceDBUManager);  
        simpleDataLoad.populate();
        
        /* Função para iniciar o console com a função de startUiInterface(iniciar interface grafica), para caso a UserConsole tivesse funlção de chamar console mesmo*/
        UserConsole userConsole = new UserConsole(instanceDBUManager);
        userConsole.startUiInterface();

        //instanceDBUManager.closeEntityManager();  // Ao fechar as janelas um evento é iniciado que fecha o banco de dados por isso nao é preciso essa linha na main
    }
}