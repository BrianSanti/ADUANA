package BO;

import DAO.IngresoProductoDAO;
import DATABASE.Conexion;
import ENTITY.IngresoProducto;
import java.sql.Connection;

/**
 *
 * @author BillyS
 */
public class IngresoProductoBO {
    private IngresoProductoDAO IPDAO = new IngresoProductoDAO();
    private String strMensaje = "";
    
    public String AgregarProducto(IngresoProducto IngrePro){
        Connection conn = Conexion.getConnection();
        try{
            strMensaje = IPDAO.AgregarProducto(conn, IngrePro);
            conn.rollback();
        }catch(Exception e){
            strMensaje = strMensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                strMensaje = strMensaje + " " + e.getMessage();
            }
        }
  
        return strMensaje;
    }
}
