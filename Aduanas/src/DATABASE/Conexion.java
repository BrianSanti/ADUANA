
package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class Conexion {
    
    private static Connection conn = null;
    private static String login = "Brian";
    private static String clave = "12345";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
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
    
    
    
    
    
    
    
    
}
