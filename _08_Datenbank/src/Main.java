import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ihk_colors", "root", "");
            System.out.println("Datenbankverbindung hergestellt!");

            // select
            Statement selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery("SELECT * FROM colors");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String hex = rs.getString("hex");
                System.out.printf("%d %s %s\n", id, name, hex);
            }
            selectStatement.close();


            // insert

            PreparedStatement insertStatement = con.prepareStatement("INSERT INTO colors (name, hex) VALUES (?,?)");
            insertStatement.setString(1,"blue");//1. Fragezeichen
            insertStatement.setString(2,"#0000ff");//2. Fragezeichen
            int in = insertStatement.executeUpdate();
            System.out.println("insert:"+ in);


            //delete
            PreparedStatement deleteStatement = con.prepareStatement("DELETE FROM colors WHERE name =?");
            deleteStatement.setString(1,"blue");
            int del = deleteStatement.executeUpdate();
            System.out.println("delete: "+del);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}