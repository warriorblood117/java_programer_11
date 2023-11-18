package config;

import migracion.CreateTableUser;
import migracion.Install;
import migracion.MigrationStrategy;
import migracion.Uninstall;

public class Main {

    public static void main(String[] args) {

        boolean doMigration =true;
        boolean doInstall =false;

        ConnectionDB myqlconecction = new ConnectionDB("aulamatriz-mysql.cu8fdrthvxfg.us-east-1.rds.amazonaws.com","3306","root","123ABCbe.","prueba");

        if(doMigration){
            System.out.println("Se realizara la migracion");
            MigrationStrategy migrationStrategy;
            if(doInstall){
                migrationStrategy = new Install();
            }else{
                migrationStrategy = new Uninstall();
            }
            migrationStrategy.execute(myqlconecction.doConnection());
        }else{
            System.out.println("No migrar");
        }


    }


}
