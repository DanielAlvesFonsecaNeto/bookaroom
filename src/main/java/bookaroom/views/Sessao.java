package bookaroom.views;

import bookaroom.util.dbumanager.IDBUManager;


public class Sessao {
    /**
        
        * Essa Classe deverá informar o campus e o usuario em sesão para todas as subtelas fazerem suas operações
        * Essa Classe deve ser um singleton e o atributo campus de usuario devem ser staticos
     
     *    private static campusModel
     *    private static userModel
     *    private static funcionario    // ja que é esse funcionario que estará associado a reserva
     */
    
    private static Sessao instancia; 
    private static IDBUManager instanceDBUManager;
    
    private Sessao(){
    
    }
    
    public static Sessao getInstance() {
        if(instancia == null){
            instancia = new Sessao();
        }
        
        return instancia;
    }
    
    public static void setDBUManger(IDBUManager instanceDBUManager1){
        instanceDBUManager = instanceDBUManager1;
    }
    
    public static void finalizarBD(){
        instanceDBUManager.closeEntityManager();
    }
    
}
