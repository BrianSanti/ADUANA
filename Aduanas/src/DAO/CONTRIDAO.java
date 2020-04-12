
package DAO;

import ENTITY.CONTRIENTITY;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CONTRIDAO {
    private String mensaje = "";
    
    public String agregarCONTRI(Connection con,CONTRIENTITY CONTRI) throws SQLException{   
    PreparedStatement pst = null;
    String sql = "INSERT INTO CONTRIBUYENTE (ID_DPI, NIT, NOMBRE1, NOMBRE2, APELLIDO1, APELLIDO2, FECHAINGRESO, RIESGOCLIENTE)" 
            + "values(?,?,?,?,?,?,?,?)";
        try {
            
        
           pst = con.prepareStatement(sql);
           pst.setString(1, CONTRI.getID_DPI());
           pst.setString(2, CONTRI.getNit());
           pst.setString(3, CONTRI.getNombre1());
           pst.setString(4, CONTRI.getNonmbre2());
           pst.setString(5, CONTRI.getApellido1());
           pst.setString(6, CONTRI.getApellido2());
           pst.setString(7, CONTRI.getFechaIngreso());
           pst.setString(8, CONTRI.getRiesgoCliente());
           mensaje = "GUARDADO CORRECTAMENTE";
           pst.execute();
           pst.close();
           
        } catch(SQLException e){
        
        mensaje = "NO SE PUDO GUATRDAR CORRECTAMENTE \n " + e.getMessage();
        
        }
    
        return mensaje;
    }
    
    
    
    
}
