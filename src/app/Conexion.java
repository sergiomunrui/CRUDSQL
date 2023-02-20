
package app;
import java.sql.*;


/**
 *
 * @author sergi
 */
public class Conexion {
    
    /*Método que es llamado desde las distintas clases para establecer conexión
    mediante conector JDBC. Tiene dos parametros para la conexión que son el 
    usuario y la contraseña que se exige desde la pantalla de Inicio para
    verificarlo*/
    public static Connection getConexion(String usuario, String password){
        
        
        String url="jdbc:mysql://localhost:3306/";
        String user=usuario;
        String pass=password;
        String database="escuela"; //Base de datos a la que se conecta
        
        try{
            Connection conn=DriverManager.getConnection(url+database, user, pass);
            return conn;        
        }catch(SQLException e){ //Ecepción capturada en caso de no realizar la conexión
            System.out.println("Conexión NO realizada correctamente");
            e.printStackTrace();
            return null;
        }
    }
}
