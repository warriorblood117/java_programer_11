package migracion;

import java.sql.Connection;

public interface MigrationStrategy {
    void execute(Connection connection);
}
