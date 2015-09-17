package ruoque.crm.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ruoque.crm.type.ComerCategory;
import ruoque.crm.type.ComerType;
import ruoque.crm.type.Gender;
import ruoque.crm.type.MaritalStatus;
import ruoque.crm.type.TransportMeans;

@Entity
@Table(name="crm_comer")
public class Comer {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String salesman;
	
	private String addr;
	
	private String phone;
	
	private Gender gender;
	
	private Date visitDate;
	
	private Time visitTime;
	
	private ComerCategory comerCategory;
	
	private ComerType comerType;
	
	private TransportMeans transportMeans;
	
	private MaritalStatus maritalStatus;
	
	private int age;
	
	private String housingSituation;
	
	private BigDecimal area;
	
	private String livingRegion;

	private String workingRegion;
	
	private String medium;
	
	private String categoryDemand;
	
	private BigDecimal areaDemand;
	
	private String parkingDemand;
	
	private int roomNumDemand;
	
	private BigDecimal unitPrice;
	
	private BigDecimal grossPrice;
	
	private String vocation;
	
	private String purchaseMotive;
	
	private String  paymentMethod;
	
	private String inquiryFocuse;
	
	private String recommendHousehold;
	
	private String recommendHouseNo;
	
	private String serviceSatisfaction;
	
	private String memo;
	
	private String feedback;
	
	private java.util.Date created_at;
	
	private int disable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Temporal(TemporalType.TIME)
	public Time getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Time visitTime) {
		this.visitTime = visitTime;
	}

	public ComerCategory getComerCategory() {
		return comerCategory;
	}

	public void setComerClass(ComerCategory comerCategory) {
		this.comerCategory = comerCategory;
	}

	public ComerType getComerType() {
		return comerType;
	}

	public void setComerType(ComerType comerType) {
		this.comerType = comerType;
	}

	public TransportMeans getTransportMeans() {
		return transportMeans;
	}

	public void setTransportMeans(TransportMeans transportMeans) {
		this.transportMeans = transportMeans;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHousingSituation() {
		return housingSituation;
	}

	public void setHousingSituation(String housingSituation) {
		this.housingSituation = housingSituation;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public String getLivingRegion() {
		return livingRegion;
	}

	public void setLivingRegion(String livingRegion) {
		this.livingRegion = livingRegion;
	}

	public String getWorkingRegion() {
		return workingRegion;
	}

	public void setWorkingRegion(String workingRegion) {
		this.workingRegion = workingRegion;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getCategoryDemand() {
		return categoryDemand;
	}

	public void setCategoryDemand(String categoryDemand) {
		this.categoryDemand = categoryDemand;
	}

	public BigDecimal getAreaDemand() {
		return areaDemand;
	}

	public void setAreaDemand(BigDecimal areaDemand) {
		this.areaDemand = areaDemand;
	}

	public String getParkingDemand() {
		return parkingDemand;
	}

	public void setParkingDemand(String parkingDemand) {
		this.parkingDemand = parkingDemand;
	}

	public int getRoomNumDemand() {
		return roomNumDemand;
	}

	public void setRoomNumDemand(int roomNumDemand) {
		this.roomNumDemand = roomNumDemand;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(BigDecimal grossPrice) {
		this.grossPrice = grossPrice;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getPurchaseMotive() {
		return purchaseMotive;
	}

	public void setPurchaseMotive(String purchaseMotive) {
		this.purchaseMotive = purchaseMotive;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getInquiryFocuse() {
		return inquiryFocuse;
	}

	public void setInquiryFocuse(String inquiryFocuse) {
		this.inquiryFocuse = inquiryFocuse;
	}

	public String getRecommendHousehold() {
		return recommendHousehold;
	}

	public void setRecommendHousehold(String recommendHousehold) {
		this.recommendHousehold = recommendHousehold;
	}

	public String getRecommendHouseNo() {
		return recommendHouseNo;
	}

	public void setRecommendHouseNo(String recommendHouseNo) {
		this.recommendHouseNo = recommendHouseNo;
	}

	public String getServiceSatisfaction() {
		return serviceSatisfaction;
	}

	public void setServiceSatisfaction(String serviceSatisfaction) {
		this.serviceSatisfaction = serviceSatisfaction;
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

	public java.util.Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(java.util.Date created_at) {
		this.created_at = created_at;
	}

	public int isDisable() {
		return disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}

	
}
