package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.SaleOrderDao;
import ruoque.crm.model.SaleOrder;
import ruoque.crm.util.Pager;

@Service("saleManager")
public class SaleOrderManagerImpl implements SaleOrderManager{
	
	@Resource
	private SaleOrderDao saleOrderDao;

	public void setSaleOrderDao(SaleOrderDao saleOrderDao) {
		this.saleOrderDao = saleOrderDao;
	}

	public SaleOrder getSaleOrder(int id) {
		return saleOrderDao.getSaleOrder(id);
	}

	public List<SaleOrder> getAllSaleOrder() {
		return saleOrderDao.getAllSaleOrder();
	}

	public Pager<SaleOrder> getAllSaleOrder(int pageNum, int pageSize) {
		return saleOrderDao.getAllSaleOrder(pageNum, pageSize);
	}

	public void addSaleOrder(SaleOrder saleOrder) {
		saleOrderDao.addSaleOrder(saleOrder);
	}

	public boolean delSaleOrder(int id) {
		return saleOrderDao.delSaleOrder(id);
	}

	public boolean updateSaleOrder(SaleOrder saleOrder) {
		return saleOrderDao.updateSaleOrder(saleOrder);
	}

}
