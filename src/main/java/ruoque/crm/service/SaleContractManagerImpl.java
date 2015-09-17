package ruoque.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ruoque.crm.dao.SaleContractDao;
import ruoque.crm.model.SaleContract;
import ruoque.crm.util.Pager;

@Service("afterSalesManager")
public class SaleContractManagerImpl implements SaleContractManager {
	@Resource
	private SaleContractDao saleContractDao;

	public void setSaleContract(SaleContractDao saleContractDao) {
		this.saleContractDao = saleContractDao;
	}

	public SaleContract getSaleContract(int id) {
		return saleContractDao.getSaleContract(id);
	}

	public List<SaleContract> getAllSaleContract() {
		return saleContractDao.getAllSaleContract();
	}

	public Pager<SaleContract> getAllSaleContract(int pageNum, int pageSize) {
		return saleContractDao.getAllSaleContract(pageNum, pageSize);
	}

	public void addSaleContract(SaleContract afterSales) {
		saleContractDao.addSaleContract(afterSales);
	}

	public boolean delSaleContract(int id) {
		return saleContractDao.delSaleContract(id);
	}

	public boolean updateSaleContract(SaleContract saleContract) {
		return saleContractDao.updateSaleContract(saleContract);
	}

}
