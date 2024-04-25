import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {
	// Variables
    private String route;

    // Constructor
    public MyFileReader(String route){
        this.route = route;
    }
    
    // Metodos
    // Metodo para leer los usuarios de la base de datos Tipo Csv
    public List<Usuario> readUsers() {
        List<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(route))) {
            // Leer la primera línea que contiene los encabezados y la descarta
            bufferedReader.readLine();
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Dividir la línea por las comas para obtener los datos
                String[] datos = linea.split(",");
                // Crear un nuevo Usuario con los datos obtenidos
                Usuario usuario = new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                // Agregar el usuario a la lista
                usuarios.add(usuario);
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return usuarios;
    }
}

