package dbase;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PostgreSQLJDBC {

    public static void main(String[] args) {

//    }
//    public void create() {
        Connection c = null;
        Statement stmt = null;
        String sql = "";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "123");

            stmt = c.createStatement();

            sql = "CREATE SCHEMA IF NOT EXISTS COSTS ";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE IF NOT EXISTS COSTDATA "
                    + " ( "
                    + " ID                   SERIAL PRIMARY KEY     NOT NULL, "
                    + " NAME                  VARCHAR(32)            NOT NULL "
                    + " ) ";
            stmt.executeUpdate(sql);


            sql = "CREATE TABLE IF NOT EXISTS COSTDATALIST "
                    + " ( "
                    + " ID2                  INT       NOT NULL,"
                    + " DATE                INT                  NOT NULL,"
                    + " ID                  INT            NOT NULL,"
                    + " MONEY               INT                  NOT NULL)";
            stmt.executeUpdate(sql);

            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+ e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

}