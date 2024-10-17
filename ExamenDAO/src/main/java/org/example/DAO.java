package org.example;

import java.sql.*;

public abstract class DAO implements PeliculaDAO {
    private final Connection conectar;
    public DAO(Connection conectar) {
        this.conectar = conectar;
    }
    @Override
    public boolean AñadirlasPelicula(Pelicula movies) {
        String sql = "INSERT INTO pelicula (titulo, genero, año) VALUES (?, ?, ?)";
        try (PreparedStatement preparado = conectar.prepareStatement(sql)) {
            preparado.setString(1, movies.getTitulo());
            preparado.setString(2, movies.getGenero());
            preparado.setInt(3, movies.getAño());
            int filas = preparado.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public int ContarlasPeliculas() {
        String sql = "SELECT count(*) FROM pelicula";
        try (Statement stmt = conectar.createStatement()) {
            ResultSet resultado = stmt.executeQuery(sql);
            if (resultado.next()) {
                return resultado.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

