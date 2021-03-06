package ruoque.crm.dao;

import java.util.List;

import ruoque.crm.model.SaleOrder;
import ruoque.crm.util.Pager;

public interface SaleOrderDao {

	public SaleOrder getSaleOrder(int id);  

	public List<SaleOrder> getAllSaleOrder();
	
	public Pager<SaleOrder> getAllSaleOrder(int pageNum,int pageSize);  

	public void addSaleOrder(SaleOrder saleOrder);  

	public boolean delSaleOrder(int id);  

	public boolean updateSaleOrder(SaleOrder saleOrder); 
}
