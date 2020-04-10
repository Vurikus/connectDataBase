import java.sql.*;
import java.util.Scanner;

public class ConnectionDB
{
    //Field

    private String URL = "jdbc:postgresql://localhost:5432/person";
    private String user = "postgres";
    private String password = "1";

    //Constructor

    //Function
    void connect (){
        try {
            Connection connection = DriverManager.getConnection(URL, user, password);
            Statement statement = connection.createStatement();
            //statement.executeUpdate(InsertPerson(new Person ("Ksenia", "Gorohova", 24, null)));
            ResultSet resultSet = statement.executeQuery(Select("person"));
            while (resultSet.next()){
                System.out.print(resultSet.getInt("id") + " ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("surname") + " ");
                System.out.print(resultSet.getInt("age") + " ");
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String Select (String nameTable){
        return ("SELECT * FROM " + nameTable);
    }

    private String InsertPerson (Person person){

        return ("INSERT INTO person (name, surname, age) VALUES ('" + person.getName() + "', '"
                + person.getSurname() + "', " + person.getAge() + ");");
    }
}
