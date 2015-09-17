package ruoque.crm.model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ruoque.crm.type.Gender;

@Entity
@Table(name="crm_call")
public class Call {

	@Id
	@GeneratedValue
	private int id;
	
	private String propertyConsultant;
	
	private String owner;
	
	private String name;
	
	private Date callDate;
	
	private Time callTime;
	
	private String phone;
	
	private Gender gender;
	
	private String category;
	
	private String medium;
	
	private String inquiryFocuse;
	
    private String memo;
	
	private String feedback;
	
    private Timestamp created_at;
	
	private int disable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPropertyConsultant() {
		return propertyConsultant;
	}

	public void setPropertyConsultant(String propertyConsultant) {
		this.propertyConsultant = propertyConsultant;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	@Temporal(TemporalType.TIME)
	public Time getCallTime() {
		return callTime;
	}

	public void setCallTime(Time callTime) {
		this.callTime = callTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getInquiryFocuse() {
		return inquiryFocuse;
	}

	public void setInquiryFocuse(String inquiryFocuse) {
		this.inquiryFocuse = inquiryFocuse;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public int isDisable() {
		return disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}
	
}
