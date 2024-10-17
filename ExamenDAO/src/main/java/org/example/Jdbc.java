package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Jdbc {
    // Variable estática que guarda la conexión a la base de datos,inicializada directamente usando el método createConnection()
    public static Connection enl = null;
    private static final String url = "jdbc:mysql://localhost:3306/pelicula";
    private static final String user = "root";
    private static final String pass = System.getenv("MYSQL_ROOT_PASSWORD");

    // Método público que permite acceder a la conexión desde otras partes del código
    public static Connection getEnl() {
        if(enl == null){
            try{
                enl = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexión establecida");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al conectar con la base de datos");
            }
        }
        return enl;
    }


}
