
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AcessoBanco {
    
    public static Connection getConnection() throws Exception {
        String usuario = "system";
        String senha = "tiger";
        Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:192.168.0.104:orcl", usuario, senha);
        return c;
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
