package ruoque.crm.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="crm_contract")
public class SaleContract {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int sale_id;
	
	private String building;
	
	private String unit;
	
	private String room;
	
	private BigDecimal area;
	
	private BigDecimal afterExtenArea;
	
	private String household;
	
	private String orderName;
	
	private Date signContractDate;
	
	private String contractName; 
	
	private BigDecimal receivableAccount;
	
	private Date receivableDate;
	
	private BigDecimal paybackAccout;
	
	private Date paybackDate;
	
	private String salesman;
	
	private String  paymentMethod;
	
	private int loanYears;
	
	private String loadBank;
	
	private String loadManager;
	
	private String lackMaterial;
	
	private String lendingBank;
	
	private Date lendingDate;
	
	private String memo;
	
	private String contractHandOver;
	
	private java.util.Date recordTime;
	
	private int disable;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSale_id() {
		return sale_id;
	}

	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
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

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public BigDecimal getAfterExtenArea() {
		return afterExtenArea;
	}

	public void setAfterExtenArea(BigDecimal afterExtenArea) {
		this.afterExtenArea = afterExtenArea;
	}

	public String getHousehold() {
		return household;
	}

	public void setHousehold(String household) {
		this.household = household;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Temporal(TemporalType.DATE)
	public Date getSignContractDate() {
		return signContractDate;
	}

	public void setSignContractDate(Date signContractDate) {
		this.signContractDate = signContractDate;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public BigDecimal getReceivableAccount() {
		return receivableAccount;
	}

	public void setReceivableAccount(BigDecimal receivableAccount) {
		this.receivableAccount = receivableAccount;
	}

	@Temporal(TemporalType.DATE)
	public Date getReceivableDate() {
		return receivableDate;
	}

	public void setReceivableDate(Date receivableDate) {
		this.receivableDate = receivableDate;
	}

	public BigDecimal getPaybackAccout() {
		return paybackAccout;
	}

	public void setPaybackAccout(BigDecimal paybackAccout) {
		this.paybackAccout = paybackAccout;
	}

	@Temporal(TemporalType.DATE)
	public Date getPaybackDate() {
		return paybackDate;
	}

	public void setPaybackDate(Date paybackDate) {
		this.paybackDate = paybackDate;
	}

	public String getSalesman() {
		return salesman;
	}

	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getLoanYears() {
		return loanYears;
	}

	public void setLoanYears(int loanYears) {
		this.loanYears = loanYears;
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

	public String getLackMaterial() {
		return lackMaterial;
	}

	public void setLackMaterial(String lackMaterial) {
		this.lackMaterial = lackMaterial;
	}

	public String getLendingBank() {
		return lendingBank;
	}

	public void setLendingBank(String lendingBank) {
		this.lendingBank = lendingBank;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(Date lendingDate) {
		this.lendingDate = lendingDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
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

	public int getDisable() {
		return disable;
	}

	public void setDisable(int disable) {
		this.disable = disable;
	}
	
}
