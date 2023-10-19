package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="root";
    private static final String url="jdbc:mysql://localhost:3306/registroAsignacion";
    // Funcion que va conectarse a mi bd de mysql
    public Connection conectar(){
      con = null;
     try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a la base de datos.");
            // Realiza operaciones en la base de datos aquí
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }

      return con;
    }
}
