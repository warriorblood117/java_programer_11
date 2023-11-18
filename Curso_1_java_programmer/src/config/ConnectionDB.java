package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

    private String host;
    private String userName;
    private String userPass;
    private String dbName;

    private String port;

    public ConnectionDB(String host, String port,String userName, String userPass, String dbName) {
        this.host = host;
        this.userName = userName;
        this.userPass = userPass;
        this.dbName = dbName;
        this.port = port;
    }

    public Connection doConnection() {
        try {
            String jdbcUrl = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.dbName;
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(jdbcUrl, this.userName, this.userPass);
        } catch (Exception e) {
            System.out.println("Error Conexion a la base de datos" + ": " + e.getMessage());
            return null;
        } finally {
            System.err.println();
        }
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
