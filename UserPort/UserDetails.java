package UserPort;

import java.io.Serializable;

public class UserDetails implements Serializable {
	public int id;
	public String name;
	public String sername;
	public String password;

	public UserDetails(int id, String name, String sername, String password) {
		this.id = id;
		this.name = name;
		this.sername = sername;
		this.password = password;
	}

	public UserDetails() {

	}
}