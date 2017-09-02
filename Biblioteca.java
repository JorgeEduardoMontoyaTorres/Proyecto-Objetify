import java.util.ArrayList;

/**
 * Crea la coleccion de los archivos.
 */
public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    
    public Biblioteca()
    {
        canciones = new ArrayList<String>(); //Como es un objeto, hay que crear un nuevo objeto.
        reproductor = new Reproductor();
    }
    
    /**
     * Agrega las canciones a la biblioteca.
     * @param nombreArchivo Nombre que se le asignara al archivo.
     */
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    
    /**
     * Obtiene el numero de archivo que se quiere reproducir.
     * @param numeroCancion Numero de la cancion que se reproducira.
     */
    public void reproducirCancion(int numeroCancion)
    {
        reproductor.reproducir(canciones.get(numeroCancion) );
    }
}