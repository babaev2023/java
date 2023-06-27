
package javaapplication30;

import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Enumeration;
import java.sql.*;
        

/**
 *
 * @author Stepan Babaev
 */
public class JavaApplication30 {

    public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String CONN_STRING = "jdbc:mysql://localhost:3306/?user=root&password=root&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //useSSL=false - отключает SSL - но так делать не надо.
    public static void main(String[] args) {
        
      Enumeration<Driver> drivers=DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            System.out.println("Название драйвера: "+drivers.nextElement());
            //Показывает какой есть драйвер: com.mysql.cj.jdbc.Driver
        }
        
        try {
            //Загружаем код класса в оперативную память
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL driver not found!!");
            return;
        }
        
        //Подключение к базе
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(CONN_STRING);
        } catch (SQLException ex) {
            System.out.println("Cannot open connection! "+ ex.getMessage());
            return;
        }
        
        //Работаем с базой
        try {
            Statement st = conn.createStatement();
            //st.executeUpdate("CREATE DATABASE db"); //Создаем таблицу
            st.executeUpdate("USE db"); //База как папка
            //st.executeUpdate("CREATE TABLE persons (name varchar(32),age int(3))"); //Создаем таблицу
            //st.executeUpdate("INSERT INTO persons (name,age) VALUES ('Pavel',40)"); //Заполняем таблицу
            
            //--------//
            //Получение данных
            ResultSet rs = st.executeQuery("SELECT * FROM persons WHERE age=36 ORDER BY name");
            while(rs.next()) {
                System.out.println(rs.getString("name")+" - " + rs.getString("age"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
