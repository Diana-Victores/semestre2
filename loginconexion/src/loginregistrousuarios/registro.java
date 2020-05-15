
package loginregistrousuarios;

//import static java.lang.Class.forName;
//import static java.lang.Class.forName;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class registro {
    
    Connection conectar=null;
 //   Connection pruebaconexion;
    
    public Connection conexion (){
        try {
           Class.forName("com.mysql.jdbc.Driver");
            
            conectar=(Connection) DriverManager.getConnection ("jdbc:mysql://localhost/nomina", "root","");
            
          // JOptionPane.showMessageDialog (null,"Conexion Exitosa");
            
        } catch (Exception e){
            
              JOptionPane.showMessageDialog (null,"Error de Conexion" + e.getMessage ());
        }
        return conectar;
        
        }       

   
    
}
