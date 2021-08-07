/*
 *
 *  * *
 *  *  * @author : Tharaka dasunpriay <TharakaDasunpriya.tharaka@gmail.com>
 *  *  * @since : 08/07/2021
 *  *  *
 *
 */

package lk.ijse.gitpm.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gitPM", "root", "1234");
    }


    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (null==dBConnection)?
                (dBConnection= new DBConnection()):
                (dBConnection);
    }

    public Connection getConnection(){
        return connection;
    }
}





