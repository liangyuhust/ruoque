package ruoque.crm.dao;

import java.util.List;

import ruoque.crm.model.SaleContract;
import ruoque.crm.util.Pager;

public interface SaleContractDao {

	public SaleContract getSaleContract(int id);  

	public List<SaleContract> getAllSaleContract();
	
	public Pager<SaleContract> getAllSaleContract(int pageNum,int pageSize);  

	public void addSaleContract(SaleContract saleContract);  

	public boolean delSaleContract(int id);  

	public boolean updateSaleContract(SaleContract saleContract);  
}
