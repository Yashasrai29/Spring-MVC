package springMVC;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
@Entity
public class Login {
	
	@Id
	private String email;
	private String password;
	private Boolean chechbox;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getChechbox() {
		return chechbox;
	}
	public void setChechbox(Boolean chechbox) {
		this.chechbox = chechbox;
	}
	@Override
	public String toString() {
		return "Model [email=" + email + ", password=" + password + ", chechbox=" + chechbox + "]";
	}
	

}
