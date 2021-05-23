package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admins")
public class Admins  {

	@Id
	@GeneratedValue
	@Column(name = "admin_id")
	private int adminId;
	
	@Column(name = "admin_nick_name")
	private String adminNickName;
	
	@Column(name = "admin_password")
	private String adminPassword;
	
	public Admins() {}

	public Admins(int adminId, String adminNickName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminNickName = adminNickName;
		this.adminPassword = adminPassword;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminNickName() {
		return adminNickName;
	}

	public void setAdminNickName(String adminNickName) {
		this.adminNickName = adminNickName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	
}
