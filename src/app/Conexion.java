
package app;
import java.sql.*;


/**
 *
 * @author sergi
 */
public class Conexion {
    
    public static Connection getConexion(String usuario, String password){
        
        
        String url="jdbc:mysql://localhost:3306/";
        String user=usuario;
        String pass=password;
        String database="escuela";
        
        try{
            Connection conn=DriverManager.getConnection(url+database, user, pass);
            return conn;        
        }catch(SQLException e){
            System.out.println("Conexión NO realizada correctamente");
            e.printStackTrace();
            return null;
        }
    }
}
