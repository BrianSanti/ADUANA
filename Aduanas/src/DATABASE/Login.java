/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import java.sql.*;

/**
 *
 * @author BillyS
 */
public class Login {
    public static Conexion conn = new Conexion();
    
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String strSQL;
    public static int intresultNum = 0;
    
    
    public static String BuscarUser(String strUser){
        String strBuscar = null;
        
        Connection conn = null;
        try{
            conn = Conexion.getConnection();
            String strSentenciaBus = ("SELECT Usuario FROM Usuarios WHERE Usuario = '" + strUser + "'");
            ps = conn.prepareStatement(strSentenciaBus);
            rs = ps.executeQuery();
            if(rs.next()){
                String strNombre = rs.getString("Usuario");
                strBuscar = strNombre;
            }
            conn.close();
        }catch(Exception e){
            
        }
    return strBuscar;
    }
    
    public String BuscarUserRegistrado(String strUser, String strPass){
        String busqueda_usuario = null;
        Connection conn = null;
        
        try{
            conn = Conexion.getConnection();
            String sentencia_buscar_usuario=("SELECT User, Password FROM Usuarios WHERE User = '"+strUser+"' && Password = '"+strPass+"'");
            ps = conn.prepareStatement(sentencia_buscar_usuario);
            rs = ps.executeQuery();
            if(rs.next()){
                busqueda_usuario = "Usuario Encontrado";
            }else{
                busqueda_usuario = "Usuario No Encontrado";
            }
            conn.close();
        }catch(Exception e){
            
        }
        return busqueda_usuario;
    }
    
}
