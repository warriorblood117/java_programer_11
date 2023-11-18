package migracion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CreateTableUser {


    public void create(Connection connection){

        String createTable  ="Create table user ( \n" +
                " id BIGINT  UNSIGNED  AUTO_INCREMENT PRIMARY KEY ,  \n" +
                " name varchar(50)\n" +
                ");";
        try {
            Statement statement = connection.createStatement();
            statement.execute(createTable);
            System.out.println(" se creo la tabla correctamente ");
            connection.close();
        }catch (Exception e){
            System.err.println("Error al crear la tabla " + e.getMessage());

        }

    }


    public void rollback (Connection connection){

        String createTable  ="drop table user;";
        try {
            Statement statement = connection.createStatement();
            statement.execute(createTable);
            System.out.println(" se elimino la tabla correctamente ");
            connection.close();
        }catch (Exception e){
            System.err.println("Error al crear la tabla " + e.getMessage());
        }
    }

}