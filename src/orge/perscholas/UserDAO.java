/**
 * 
 */
package orge.perscholas;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author CTStudent
 *
 */
@Entity

public class UserDAO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	
	

	/**
	 * 
	 */
	public UserDAO() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param password
	 */
	public UserDAO(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public UserDAO(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param email the email to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDAO other = (UserDAO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserDAO [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	
}
