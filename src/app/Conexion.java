
package app;
import java.sql.*;


/**
 *
 * @author sergi
 */
public class Conexion {
    
    public static Connection getConexion(){
        
        
        String url="jdbc:mysql://localhost:3306/";
        String user="root";
        String password="1234";
        String database="escuela";
        
        try{
            Connection conn=DriverManager.getConnection(url+database, user, password);
            return conn;        
        }catch(SQLException e){
            System.out.println("Conexión NO realizada correctamente");
            e.printStackTrace();
            return null;
        }
    }
}
