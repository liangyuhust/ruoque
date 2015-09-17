package ruoque.crm.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ruoque.crm.type.Gender;

@Entity
@Table(name="crm_order")
public class SaleOrder {

	@Id
	@GeneratedValue
	private int id;

	private String building;
	
	private String unit;
	
	private String room;
	
	private BigDecimal mainRoomArea;
	
	private BigDecimal basementArea;
	
	private BigDecimal gardenArea;
	
	private BigDecimal availableArea;
	
	private BigDecimal originalPrice;
	
	private BigDecimal preferentialPrice;
	
	private BigDecimal transactionPrice;
	
	private String orderName;
	
	private String orderID;
	
	private String orderPhone;
	
	private Date orderDate;
	
	private Date  scheduledSignedDate;
	
	private Date  signedDate;
	
	private String contractName;
	
	private Gender contractGender;
	
	private String contractID;
	
	private String contractAddr;
	
	private String contractSpouse;
	
	private String spouseID;
	
	private String spousePhone;
	
	private BigDecimal grossPrice;
	
	private BigDecimal downPayment;
	
	private BigDecimal loan;
	
	private String paymentPattern; 
	
	private BigDecimal deposit;
	
	private BigDecimal revPayment;
	
	private BigDecimal practicalRevPayment;
	
	private BigDecimal receivablePayment;
	
	private Date receivableDate;
	
	private BigDecimal  consumptionLoan;
	
	private BigDecimal  revConsumptionLoan;
	
	private Date remitDate;
	
	private BigDecimal returnedMoney;
	
	private Date returnedDate;
	
	private String salesman;
	
	private String memo;
	
	private BigDecimal holeSealingFee;
	
	private String contractHandOver;
	
	private java.util.Date recordTime;
	
	private String loadMethod;
	
	private Date signedLoadDate;
	
	private String loadBank;
	
	private String loadManager;
	
	private int mortgageYears;
	
	private Date lendingDate;
	
	private BigDecimal leadingAmount;	
	
	private BigDecimal totalRevMoney;

	private int allReceived;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public BigDecimal getMainRoomArea() {
		return mainRoomArea;
	}

	public void setMainRoomArea(BigDecimal mainRoomArea) {
		this.mainRoomArea = mainRoomArea;
	}

	public BigDecimal getBasementArea() {
		return basementArea;
	}

	public void setBasementArea(BigDecimal basementArea) {
		this.basementArea = basementArea;
	}

	public BigDecimal getGardenArea() {
		return gardenArea;
	}

	public void setGardenArea(BigDecimal gardenArea) {
		this.gardenArea = gardenArea;
	}

	public BigDecimal getAvailableArea() {
		return availableArea;
	}

	public void setAvailableArea(BigDecimal availableArea) {
		this.availableArea = availableArea;
	}

	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public BigDecimal getPreferentialPrice() {
		return preferentialPrice;
	}

	public void setPreferentialPrice(BigDecimal preferentialPrice) {
		this.preferentialPrice = preferentialPrice;
	}

	public BigDecimal getTransactionPrice() {
		return transactionPrice;
	}

	public void setTransactionPrice(BigDecimal transactionPrice) {
		this.transactionPrice = transactionPrice;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getScheduledSignedDate() {
		return scheduledSignedDate;
	}

	public void setScheduledSignedDate(Date scheduledSignedDate) {
		this.scheduledSignedDate = scheduledSignedDate;
	}

	public Date getSignedDate() {
		return signedDate;
	}

	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Gender getContractGender() {
		return contractGender;
	}

	public void setContractGender(Gender contractGender) {
		this.contractGender = contractGender;
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getContractAddr() {
		return contractAddr;
	}

	public void setContractAddr(String contractAddr) {
		this.contractAddr = contractAddr;
	}

	public String getContractSpouse() {
		return contractSpouse;
	}

	public void setContractSpouse(String contractSpouse) {
		this.contractSpouse = contractSpouse;
	}

	public String getSpouseID() {
		return spouseID;
	}

	public void setSpouseID(String spouseID) {
		this.spouseID = spouseID;
	}

	public String getSpousePhone() {
		return spousePhone;
	}

	public void setSpousePhone(String spousePhone) {
		this.spousePhone = spousePhone;
	}

	public BigDecimal getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(BigDecimal grossPrice) {
		this.grossPrice = grossPrice;
	}

	public BigDecimal getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(BigDecimal downPayment) {
		this.downPayment = downPayment;
	}

	public BigDecimal getLoan() {
		return loan;
	}

	public void setLoan(BigDecimal loan) {
		this.loan = loan;
	}

	public String getPaymentPattern() {
		return paymentPattern;
	}

	public void setPaymentPattern(String paymentPattern) {
		this.paymentPattern = paymentPattern;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public BigDecimal getRevPayment() {
		return revPayment;
	}

	public void setRevPayment(BigDecimal revPayment) {
		this.revPayment = revPayment;
	}

	public BigDecimal getPracticalRevPayment() {
		return practicalRevPayment;
	}

	public void setPracticalRevPayment(BigDecimal practicalRevPayment) {
		this.practicalRevPayment = practicalRevPayment;
	}

	public BigDecimal getReceivablePayment() {
		return receivablePayment;
	}

	public void setReceivablePayment(BigDecimal receivablePayment) {
		this.receivablePayment = receivablePayment;
	}

	public Date getReceivableDate() {
		return receivableDate;
	}

	public void setReceivableDate(Date receivableDate) {
		this.receivableDate = receivableDate;
	}

	public BigDecimal getConsumptionLoan() {
		return consumptionLoan;
	}

	public void setConsumptionLoan(BigDecimal consumptionLoan) {
		this.consumptionLoan = consumptionLoan;
	}

	public BigDecimal getRevConsumptionLoan() {
		return revConsumptionLoan;
	}

	public void setRevConsumptionLoan(BigDecimal revConsumptionLoan) {
		this.revConsumptionLoan = revConsumptionLoan;
	}

	public Date getRemitDate() {
		return remitDate;
	}

	public void setRemitDate(Date remitDate) {
		this.remitDate = remitDate;
	}

	public BigDecimal getReturnedMoney() {
		return returnedMoney;
	}

	public void setReturnedMoney(BigDecimal returnedMoney) {
		this.returnedMoney = returnedMoney;
	}

	public Date getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getHoleSealingFee() {
		return holeSealingFee;
	}

	public void setHoleSealingFee(BigDecimal holeSealingFee) {
		this.holeSealingFee = holeSealingFee;
	}

	public String getContractHandOver() {
		return contractHandOver;
	}

	public void setContractHandOver(String contractHandOver) {
		this.contractHandOver = contractHandOver;
	}

	public java.util.Date getRecordTime() {
		return recordTime;
	}

	public void setRecordTime(java.util.Date recordTime) {
		this.recordTime = recordTime;
	}

	public String getLoadMethod() {
		return loadMethod;
	}

	public void setLoadMethod(String loadMethod) {
		this.loadMethod = loadMethod;
	}

	public Date getSignedLoadDate() {
		return signedLoadDate;
	}

	public void setSignedLoadDate(Date signedLoadDate) {
		this.signedLoadDate = signedLoadDate;
	}

	public String getLoadBank() {
		return loadBank;
	}

	public void setLoadBank(String loadBank) {
		this.loadBank = loadBank;
	}

	public String getLoadManager() {
		return loadManager;
	}

	public void setLoadManager(String loadManager) {
		this.loadManager = loadManager;
	}

	public int getMortgageYears() {
		return mortgageYears;
	}

	public void setMortgageYears(int mortgageYears) {
		this.mortgageYears = mortgageYears;
	}

	public Date getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}

	public BigDecimal getLeadingAmount() {
		return leadingAmount;
	}

	public void setLeadingAmount(BigDecimal leadingAmount) {
		this.leadingAmount = leadingAmount;
	}

	public BigDecimal getTotalRevMoney() {
		return totalRevMoney;
	}

	public void setTotalRevMoney(BigDecimal totalRevMoney) {
		this.totalRevMoney = totalRevMoney;
	}

	public int getAllReceived() {
		return allReceived;
	}

	public void setAllReceived(int allReceived) {
		this.allReceived = allReceived;
	}
	
}
