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


            sql = "CREATE TABLE IF NOT EXISTS COSTS.COSTDATA "
                    + " ( "
                    + " ID                   SERIAL PRIMARY KEY     NOT NULL, "
                    + " NAME                  VARCHAR(32)            NOT NULL "
                    + " ) ";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE IF NOT EXISTS COSTS.COSTDATALIST "
                    + " ( "
                    + " ID                  SERIAL PRIMARY KEY       NOT NULL,"
                    + " DATE                INT                 NOT NULL,"
                    + " ID_COSTDATA         INT                NOT NULL,"
                    + " MONEY               INT                  NOT NULL)";
            stmt.executeUpdate(sql);




            sql = "ALTER TABLE COSTS.COSTDATALIST "
                    + " ADD CONSTRAINT FK_COSTDATA "
                    + " FOREIGN KEY (ID_COSTDATA) REFERENCES COSTDATA (ID) MATCH FULL "
                    + " ";
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






//package dataBase;
//
//
//        import java.sql.Connection;
//        import java.sql.DriverManager;
//        import java.sql.Statement;
//
//public class DbTableCreator {
//
//    public void create() {
//        Connection c = null;
//        Statement stmt = null;
//        String sql = "";
//        try {
//            Class.forName("org.postgresql.Driver");
//            c = DriverManager
//                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
//                            "postgres", "123");
//
//            stmt = c.createStatement();
//
//            sql = "CREATE SCHEMA IF NOT EXISTS JAVA_TASK ";
//            stmt.executeUpdate(sql);
//
//            sql = "CREATE TABLE IF NOT EXISTS JAVA_TASK.USER "
//                    + " ( "
//                    + " ID                      SERIAL PRIMARY KEY     NOT NULL, "
//                    + " FIRST_NAME              CHAR(32)            NOT NULL, "
//                    + " LAST_NAME               CHAR(32)            NOT NULL  "
//                    + " ) ";
//            stmt.executeUpdate(sql);
//
//            sql = "CREATE TABLE IF NOT EXISTS JAVA_TASK.POST "
//                    + " ( "
//                    + " ID                      SERIAL PRIMARY KEY     NOT NULL, "
//                    + " USER_ID                 INT                 NOT NULL, "
//                    + " TITLE                   CHAR(100)           NOT NULL, "
//                    + " PUBLICATION             CHAR(500)           NOT NULL  "
//                    + " ) ";
//            stmt.executeUpdate(sql);
//
//            sql = "ALTER TABLE JAVA_TASK.POST "
//                    + " ADD CONSTRAINT FK_USER "
//                    + " FOREIGN KEY (USER_ID) REFERENCES USER (ID) MATCH FULL "
//                    + " ";
//            stmt.executeUpdate(sql);
//
//            stmt.close();
//            c.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println(e.getClass().getName()+": "+ e.getMessage());
//            System.exit(0);
//        }
//        System.out.println("Opened database successfully");
//    }
//
//}