import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader("/Users/r3sn0/OneDrive/Escritorio/MOCK_DATA.csv");
        List<Usuario> usuarios = reader.readUsers();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getId()+ " " + usuario.getFirst_Name() + " " + usuario.getLast_Name() + " " + usuario.getCorreo() + " " + usuario.getPassword() + " " + usuario.getGender());
        }
    }
}
