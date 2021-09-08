package classes;

public class Client implements java.io.Serializable {

	private Integer idClient;
	private String name;
	private String lastName;
	private String username;
	private String password;
	private String email;

	public Client() {
	}

	public Client(int idClient) {
		this.idClient = idClient;
	}
	
	public Client(String name, String lastName, String username, String password, String email) {
		this.name = name;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
