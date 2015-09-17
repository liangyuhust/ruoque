package ruoque.crm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ruoque.crm.type.Gender;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="crm_staff")
public class Staff {
	@Id
	@GeneratedValue
	private int id;
	
	private String staffNo;
	
	private String name;
	
	private String password;
	
	private String salt;
	
	private Gender gender;
	
	private String addr;
	
	private String phone;
	
	private String email;
	
	private int department;
	
	private String favorite;
	
	private String memo;
	
	private String lastip;
	
	private Date lastLogin;
	
	private int role;
	
	private Date created_at;
	
	private int disable;
	
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Enumerated(value=EnumType.STRING)
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getLastip() {
		return lastip;
	}

	public void setLastip(String lastip) {
		this.lastip = lastip;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")  
	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")  
	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public int getDisable() {
		return disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}

	public Staff(){
		
	}

	public Staff(String staffNo, String name, String password, String salt,
			Gender gender, String addr, String phone, String email,
			String favorite, String memo, String lastip, Date lastLogin,
			int role, Date created_at) {
		this.staffNo = staffNo;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.gender = gender;
		this.addr = addr;
		this.phone = phone;
		this.email = email;
		this.favorite = favorite;
		this.memo = memo;
		this.lastip = lastip;
		this.lastLogin = lastLogin;
		this.role = role;
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffNo=" + staffNo + ", name=" + name
				+ ", password=" + password + ", salt=" + salt + ", gender="
				+ gender + ", addr=" + addr + ", phone=" + phone + ", email="
				+ email + ", favorite=" + favorite + ", memo=" + memo
				+ ", lastip=" + lastip + ", lastLogin=" + lastLogin + ", role="
				+ role + ", created_at=" + created_at + ", disable=" + disable
				+ "]";
	}
	

	
}
