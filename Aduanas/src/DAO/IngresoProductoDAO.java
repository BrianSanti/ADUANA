package DAO;

import ENTITY.IngresoProducto;
import java.sql.*;

/**
 *
 * @author BillyS
 */
public class IngresoProductoDAO {
    private String strMensaje="";
    public String AgregarProducto(Connection con, IngresoProducto IngrePro){
        PreparedStatement pst = null;
        String sql = "INSERT INTO PRODUCTO (ID_PRODUCTO, Descripcion, Precio_Unitario, Cantidad_Articulos, Iva_Total, Importe_Total, Riesgo_Producto, ID_DPI, ID_PAIS, ID_TIPO) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, IngrePro.getId_Producto());
            pst.setString(2, IngrePro.getDescripcion());
            pst.setDouble(3, IngrePro.getPrecioUnitario());
            pst.setInt(4, IngrePro.getCantidadArt());
            pst.setDouble(5, IngrePro.getIvaTotal());
            pst.setDouble(6, IngrePro.getImporteTotal());
            pst.setInt(7, IngrePro.getRiesgoProducto());
            pst.setInt(8, IngrePro.getId_DPI());
            pst.setString(9, IngrePro.getNombrePais());
            pst.setString(10, IngrePro.getDescripcionProd());
            strMensaje = "GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();;
            
            
        }catch(SQLException e){
            strMensaje = "NO SE HA GUARDADO CORRECTAMENTE \n"+e.getMessage();
        }
        
        return strMensaje;
    }
}
