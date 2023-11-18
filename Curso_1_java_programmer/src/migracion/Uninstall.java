package migracion;

import java.sql.Connection;

public class Uninstall implements MigrationStrategy {

    CreateTableUser createTableUser = new CreateTableUser();

    @Override
    public void execute(Connection connection) {
        createTableUser.rollback(connection);
    }
}
