
package DATABASE;

import java.sql.*;
import javax.sql.DataSource;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;




public class Conexion {
    
    private static Connection conn = null;
    
    
    private static String login = "Brian";
    private static String clave = "12345";
    private static String db = "Aduana";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe"+db;
    
    
    //Conectar la base de datos
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("CONEXION EXITOSA");
        }else {
            System.out.println("CONEXION ERRONEA");
            
            }
        } catch (ClassNotFoundException |SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Conexion erronea");
        }
    return conn; 
    }
    
    //desconectar la base de datos
    public void desconexion(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println("Erro al desconectar "+ e.getMessage());
        }
    }
    
 /*   //Cargar el ComboBox con datos de la base de datos.
   public void consultar_paises(JComboBox cboPaises){
       //Creamos objeto tipo connection
       Connection con = null;
       //Creamos la consulta sql
       String SSQL = "SELECT NombrePais FROM PaisOrigen ORDER BY NombrePais ASC";
       //establecemos bloque try-catch-finally
       try{
           
       }catch(Exception e){
           
       }finally{
           
       }
       
   }
   */
  //Funcion para crear consultas 
   public ResultSet consulta (String sql){
       ResultSet res = null;
       try{
          PreparedStatement pstm = conn.prepareStatement(sql);
          res = pstm.executeQuery();
          
       }catch (SQLException e){
           JOptionPane.showMessageDialog(null, "Error Consulta "+e.getMessage());
       }
       return res;
   }
   
   
   //Metodo para obtener los datos de la BD
   public DefaultComboBoxModel obt_Pais(){
       DefaultComboBoxModel ListaModelo = new DefaultComboBoxModel();
       ListaModelo.addElement("Seleccione El Pais");
       ResultSet res = this.consulta("SELECT * FROM PaisOrigen ORDER BY NombrePais");
       
       try{
           while(res.next()){
               ListaModelo.addElement(res.getString("NombrePais"));
           }
           res.close();
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
       }
       return ListaModelo;
   }
   
   
   //Metodo para obtener los datos de la BD
   public DefaultComboBoxModel obt_Tipo(){
       DefaultComboBoxModel ListaModelo1 = new DefaultComboBoxModel();
       ListaModelo1.addElement("Seleccione El Tipo");
       ResultSet res = this.consulta("SELECT * FROM TipoProductos ORDER BY Descripción");
       
       try{
           while(res.next()){
               ListaModelo1.addElement(res.getString("Descripción"));
           }
           res.close();
       }catch (SQLException ex){
           JOptionPane.showMessageDialog(null, "Error "+ex.getMessage());
       }
       return ListaModelo1;
   }
    
}