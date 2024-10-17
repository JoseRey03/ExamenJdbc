package org.example;
import java.util.List;

public interface PeliculaDAO {
    int contarPeliculas();
    boolean añadirPelicula(Pelicula movies);

    default Pelicula obtenerPeliculaPorId(int id) {
        return null;
    }
    default List<Pelicula> listarPeliculas() {
        return null;
    }

    int ContarlasPeliculas();

    boolean AñadirlasPelicula(Pelicula movies);
}