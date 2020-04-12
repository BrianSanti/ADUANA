package BO;

import DAO.CONTRIDAO;
import DATABASE.Conexion;
import ENTITY.CONTRIENTITY;
import java.sql.Connection;

public class CONTRIBO {
    
     private String mensaje = "";
     private CONTRIDAO cdao =  new CONTRIDAO();
    
    public String agregarCONTRI(CONTRIENTITY CONTRI){
        
             Connection conn = Conexion.getConnection();
       
                try {
                    mensaje = cdao.agregarCONTRI(conn, CONTRI);
             
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
        }     
    return mensaje;
    }

   
    
    
}
