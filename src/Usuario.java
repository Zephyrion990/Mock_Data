
public class Usuario {
	// Variables
	private String id;
	private String first_Name;
	private String  last_Name;
	private String correo;
	private String  password;
	private String  gender;
	
	// Constructor
	public Usuario(String id, String first_Name,String  last_Name,String correo, String gender,String password){
		this.id=id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.correo = correo;
		this.password = password;
		this.gender = gender;
	}
	
	// Getter y setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}	
}
