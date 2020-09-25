/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author @BrunoDev
 */
public class PropertiesBD {

    private String JDBC_DRIVER;
    private String USER;
    private String PASS_WORD;
    private String HOST;
    private String PORT;
    private String DATABASE;
    private String CLASSNAME;

    public PropertiesBD() {
        setPropertiesBD();
    }

    public void setPropertiesBD() {

        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            //URL file
            inputStream = new FileInputStream("database.properties.config");
            properties.load(inputStream);
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }

        //set Properties
        JDBC_DRIVER = properties.getProperty("database.JDBC_DRIVER");
        USER = properties.getProperty("database.USER");
        PASS_WORD = properties.getProperty("database.PASS_WORD");
        HOST = properties.getProperty("database.HOST");
        PORT = properties.getProperty("database.PORT");
        DATABASE = properties.getProperty("database.DATABASE");
        CLASSNAME = properties.getProperty("database.CLASSNAME");
    }

    public String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASS_WORD() {
        return PASS_WORD;
    }

    public String getHOST() {
        return HOST;
    }

    public String getPORT() {
        return PORT;
    }

    public String getDATABASE() {
        return DATABASE;
    }

    public String getCLASSNAME() {
        return CLASSNAME;
    }
}
