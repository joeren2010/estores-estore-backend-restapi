package estore.com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the admins database table.
 * 
 */
@Entity
@Table(name="admins")
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adminid")					//tells springboot to map to adminid
	private int adminId;					//by default: springboot will map this to admin_id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="addedon")					//tells springboot to map to addedon
	private Date addedOn;					//by default: springboot will map this to added_on
	private String email;
	@Column(name="fullname")	
	private String fullName;
	@Column(name="logintype")
	private int loginType;
	private String password;

	
	public Admin() {
	}

	public int getAdminId() {
		return this.adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public Date getAddedOn() {
		return this.addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getLoginType() {
		return this.loginType;
	}

	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}