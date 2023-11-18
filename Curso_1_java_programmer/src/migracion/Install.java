package migracion;

import java.sql.Connection;

public class Install implements  MigrationStrategy{
    CreateTableUser createTableUser = new CreateTableUser();
    @Override
    public void execute(Connection connection) {
        createTableUser.create(connection);
    }
}
