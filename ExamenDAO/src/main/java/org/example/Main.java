package org.example;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection conectar = Jdbc.getEnl();
        if (conectar != null) {
            PeliculaDAO peliculaDAO = new DAO(conectar) {
                @Override
                public int contarPeliculas() {
                    return 0;
                }

                @Override
                public boolean añadirPelicula(Pelicula pelicula) {
                    return false;
                }
            };
            // Añadir una nueva película
            Pelicula nuevaPelicula = new Pelicula(7, "Pacific Rim", 2015, "ciencia ficción");
            boolean resultadoAñadir = peliculaDAO.añadirPelicula(nuevaPelicula);
            System.out.println("Película añadida: " + resultadoAñadir);

            // Contar total de películas
            int totalPeliculas = peliculaDAO.contarPeliculas();
            System.out.println("Total de las películas: " + totalPeliculas);

        } else {
            System.out.println("Error al conectar con la base de datos.");
        }
            }
        }
}