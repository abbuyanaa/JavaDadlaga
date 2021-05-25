package dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class dbconnect {

    Connection con;
    public String driver = "com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://localhost:3306/java_dadlaga?useUnicode=true&characterEncoding=UTF-8";
    public String uname = "root";
    public String upass = "";
    PreparedStatement stmt;
    ResultSet rs;
    TableModel tm;

    public Connection condb() throws SQLException {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, uname, upass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet login(String query) {
        try {
            con = condb();
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(dbconnector.dbconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public TableModel tabled_hewleh(String query) {
        try {
            con = condb();
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            tm = DbUtils.resultSetToTableModel(rs);
        } catch (SQLException ex) {
            Logger.getLogger(dbconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tm;
    }

    public void exec(String query) {
        try {
            con = condb();
            stmt = con.prepareStatement(query);
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(dbconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
