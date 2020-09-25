/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import FileProperties.PropertiesBD;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author @BrunoDev
 */
public class ConnectionBD {

    private Connection connection;
    
    private final PropertiesBD propertiesBD = new PropertiesBD();

    private final String JDBC_DRIVER;
    private final String USER;
    private final String PASS_WORD;
    private final String HOST;
    private final String PORT;
    private final String DATABASE;
    private final String CLASSNAME;
    private final String URL;

    public ConnectionBD() {
        //URL jdbc Driver//localhost or Direccion ip//port//database=databaseName  
        //"jdbc:sqlserver://localhost:1433;database=database;"
        JDBC_DRIVER = propertiesBD.getJDBC_DRIVER();
        USER = "user=" + propertiesBD.getUSER() + ";";
        PASS_WORD = "password=" + propertiesBD.getPASS_WORD() + ";";
        HOST = propertiesBD.getHOST();
        PORT = propertiesBD.getPORT();
        DATABASE = propertiesBD.getDATABASE();
        CLASSNAME = propertiesBD.getCLASSNAME();
        URL = JDBC_DRIVER + "://" + HOST + ":" + PORT + ";database=" + DATABASE + ";";
    }

    //Connection
    public boolean conectar() {
        try {
            Class.forName(CLASSNAME);
            connection = DriverManager.getConnection(URL + USER + PASS_WORD);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean desConectar() {
        if (connection != null) {
            try {
                connection.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public Connection getConexion() {
        try {
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
