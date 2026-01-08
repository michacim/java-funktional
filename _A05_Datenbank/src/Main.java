import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ihk_persons", "root", "");
            System.out.println("Datenbankverbindung hergestellt!");

            // select
            // Statement selectStatement = con.createStatement();
            // ResultSet rs = selectStatement.executeQuery("SELECT * FROM colors");

            PreparedStatement selectStatement = con.prepareStatement("SELECT * FROM persons");
            ResultSet rs = selectStatement.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                Date birthdate=  rs.getDate("birthdate");

                System.out.printf("%d %s %s %s\n", id, firstname, lastname, birthdate);
            }
            selectStatement.close();


            // insert

            PreparedStatement insertStatement = con.prepareStatement("INSERT INTO persons (firstname, lastname, birthdate) VALUES (?,?, ?)");
            insertStatement.setString(1,"Max");//1. Fragezeichen
            insertStatement.setString(2,"Meier");//2. Fragezeichen
            insertStatement.setString(3,"1999-04-02");//3. Fragezeichen
            int in = insertStatement.executeUpdate();
            System.out.println("insert:"+ in);


            //delete
            PreparedStatement deleteStatement = con.prepareStatement("DELETE FROM persons WHERE id =?");
            deleteStatement.setInt(1,1);
            int del = deleteStatement.executeUpdate();
            System.out.println("delete: "+del);


            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}