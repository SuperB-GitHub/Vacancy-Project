package finalprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseHandler {

    Connection dbConnect = null;

    public Connection getDBConection() throws SQLException {
        dbConnect = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Новый пользователь\\Desktop\\Lang-Prog\\FinalProg\\finalprog\\src\\main\\resources\\finalprog\\FinalProg.db");
        return dbConnect;
    }
    public void registerForWork(String fio, String city, String persmail, String namecomp, String mailcomp, String password){
        String insert_in_comp = "INSERT INTO "+ DBParam.TABLE_COMP + "(" + DBParam.COMP_FIO + ","+ DBParam.COMP_CITY + ","+ DBParam.COMP_PERSMAIL + ","
        + DBParam.COMP_NAMECOMP + ","+ DBParam.COMP_MAILCOMP + ")"+"VALUES(?,?,?,?,?)";
        String insert_in_auth = "INSERT INTO "+ DBParam.TABLE_AUTH + "(" +DBParam.AUTH_MAIL + ","+ DBParam.AUTH_PASS + ","+ DBParam.AUTH_WHO + ")"+"VALUES(?,?,?)";

        try {
            PreparedStatement prst1 = getDBConection().prepareStatement(insert_in_comp);
            PreparedStatement prst2 = getDBConection().prepareStatement(insert_in_auth);
            prst1.setString(1, fio);
            prst1.setString(2, city);
            prst1.setString(3, persmail);
            prst1.setString(4, namecomp);
            prst1.setString(5, mailcomp);
            prst2.setString(1, persmail);
            prst2.setString(2, password);
            prst2.setString(3, "Company");
            prst1.executeUpdate();
            prst2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registerNotWork(String fio, String datebirth, String city, String mail, String spec, String educat, String gender, String password){
        String insert_in_njob = "INSERT INTO "+ DBParam.TABLE_NOTJOB + "(" + DBParam.NJOB_FIO + ","+ DBParam.NJOB_DATEBIRTH + ","+ DBParam.NJOB_CITY + ","
        + DBParam.NJOB_MAIL + ","+ DBParam.NJOB_SPEC + ","+ DBParam.NJOB_EDU + ","+ DBParam.NJOB_GEN +")"+"VALUES(?,?,?,?,?,?,?)";
        String insert_in_auth = "INSERT INTO "+ DBParam.TABLE_AUTH + "(" +DBParam.AUTH_MAIL + ","+ DBParam.AUTH_PASS + ","+ DBParam.AUTH_WHO + ")"+"VALUES(?,?,?)";

        try {
            PreparedStatement prst1 = getDBConection().prepareStatement(insert_in_njob);
            PreparedStatement prst2 = getDBConection().prepareStatement(insert_in_auth);
            prst1.setString(1, fio);
            prst1.setString(2, datebirth);
            prst1.setString(3, city);
            prst1.setString(4, mail);
            prst1.setString(5, spec);
            prst1.setString(6, educat);
            prst1.setString(7, gender);

            prst2.setString(1, mail);
            prst2.setString(2, password);
            prst2.setString(3, "NotJob");
            prst1.executeUpdate();
            prst2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet login(String mail, String pass){
        ResultSet rs = null;
        String select = "SELECT * FROM " + DBParam.TABLE_AUTH + " WHERE " + DBParam.AUTH_MAIL + "= ? AND " + DBParam.AUTH_PASS + "= ?";
        try {
            PreparedStatement prst = getDBConection().prepareStatement(select);
            prst.setString(1, mail);
            prst.setString(2, pass);
            rs = prst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    
}
